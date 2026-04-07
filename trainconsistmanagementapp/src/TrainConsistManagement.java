import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " bogie carrying " + cargo;
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        List<GoodsBogie> goodsBogies = Arrays.asList(
                new GoodsBogie("Rectangular", "Coal"),
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Grain"),
                new GoodsBogie("Cylindrical", "Petroleum")
        );

        goodsBogies.forEach(System.out::println);

        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie -> {
                    if (bogie.type.equalsIgnoreCase("Cylindrical")) {
                        return bogie.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true;
                });

        System.out.println("\nTrain Safety Compliance: " + (isSafe ? "SAFE" : "UNSAFE"));
    }
}