import java.util.LinkedHashSet;

public class TrainConsistManagement {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);
    }
}