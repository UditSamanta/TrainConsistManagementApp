import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a HashSet<String> for bogie IDs
        // We use the Set interface for abstraction
        Set<String> bogieIds = new HashSet<>();

        System.out.println("=== UC3: Unique Bogie ID Tracking ===");

        // 2. Add IDs, including intentional duplicates
        System.out.println("Registering bogies: BG101, BG102, BG101 (duplicate), BG103...");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // This duplicate will be automatically ignored
        bogieIds.add("BG103");

        // 3. Print the final set
        System.out.println("\nFinal Unique Bogie IDs: " + bogieIds);

        // 4. Observe behavior
        System.out.println("Total Unique Bogies Registered: " + bogieIds.size());

        // 5. Verification check
        if (bogieIds.size() < 4) {
            System.out.println("System Alert: Duplicate IDs were detected and blocked.");
        }
    }
}