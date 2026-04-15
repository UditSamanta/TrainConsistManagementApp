import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // Sample Inputs
        String trainIdInput = "TRN-1234";
        String cargoCodeInput = "PET-AB";

        // 1. Define Regex Patterns
        // TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile Patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // 3. Create Matchers and Validate
        validateInput("Train ID", trainIdInput, trainPattern);
        validateInput("Cargo Code", cargoCodeInput, cargoPattern);

        // Test with invalid data
        System.out.println("\n--- Testing Invalid Inputs ---");
        validateInput("Train ID", "TRN-123", trainPattern);    // Too short
        validateInput("Cargo Code", "PET-ab", cargoPattern);   // Lowercase
    }

    /**
     * Helper method to validate input and display results
     */
    public static void validateInput(String fieldName, String input, Pattern pattern) {
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("✔ " + fieldName + " [" + input + "]: Validation Successful.");
        } else {
            System.out.println("❌ " + fieldName + " [" + input + "]: Invalid Format!");
        }
    }
}