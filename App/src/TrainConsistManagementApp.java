import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Scenario 1: Searching an empty train consist
        String[] emptyTrain = {};
        try {
            System.out.println("Attempting search on empty train...");
            searchWithValidation(emptyTrain, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("❌ Caught State Error: " + e.getMessage());
        }

        System.out.println("------------------------------------");

        // Scenario 2: Searching a valid train consist
        String[] activeTrain = {"BG101", "BG205", "BG309"};
        try {
            System.out.println("Attempting search on active train...");
            boolean found = searchWithValidation(activeTrain, "BG205");
            System.out.println("Result: Bogie " + (found ? "Found" : "Not Found"));
        } catch (IllegalStateException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    /**
     * Searches for a bogie ID but validates system state first.
     * @throws IllegalStateException if the array is null or empty.
     */
    public static boolean searchWithValidation(String[] bogieIds, String target) {
        // 1. System checks whether the bogie collection is empty
        if (bogieIds == null || bogieIds.length == 0) {
            // 2. If no bogies, throw IllegalStateException (Fail-Fast)
            throw new IllegalStateException("Search operation failed: The train consist is empty.");
        }

        // 3. If validation passes, proceed with search logic
        for (String id : bogieIds) {
            if (id.equals(target)) {
                return true;
            }
        }
        return false;
    }
}