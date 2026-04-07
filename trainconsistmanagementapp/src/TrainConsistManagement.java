import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");
        System.out.print("Enter Train ID: ");
        String trainID = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        Matcher trainMatcher = trainRegex.matcher(trainID);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        System.out.println("Train ID " + trainID + " is " + (isTrainValid ? "valid" : "invalid"));
        System.out.println("Cargo Code " + cargoCode + " is " + (isCargoValid ? "valid" : "invalid"));

        scanner.close();
    }
}