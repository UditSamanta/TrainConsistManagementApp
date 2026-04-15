public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. User provides a list of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 2. User provides search keys (Testing found and not found scenarios)
        String searchKey1 = "BG309";
        String searchKey2 = "BG999";

        System.out.println("--- Bogie ID Locator ---");

        performLinearSearch(bogieIds, searchKey1);
        performLinearSearch(bogieIds, searchKey2);
    }

    /**
     * Performs a Linear Search to find a specific bogie ID.
     */
    public static void performLinearSearch(String[] ids, String target) {
        boolean found = false;
        int position = -1;

        // 3. System traverses the array sequentially
        for (int i = 0; i < ids.length; i++) {
            // 4. Each element is compared with the search key
            if (ids[i].equals(target)) {
                found = true;
                position = i;
                // 5. If match found, search stops (Early Termination)
                break;
            }
        }

        // 6. Result is displayed
        if (found) {
            System.out.println("✔ Bogie ID [" + target + "] found at position: " + (position + 1));
        } else {
            System.out.println("❌ Bogie ID [" + target + "] NOT found in the consist.");
        }
    }
}