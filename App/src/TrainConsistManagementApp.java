import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a LinkedHashSet to maintain order and ensure uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("=== UC5: Ordered Unique Bogie Formation ===");

        // 2. Attach bogies in a specific sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Formation: " + trainFormation);

        // 3. Attempt to attach a duplicate bogie (Sleeper)
        System.out.println("\nAttempting to add duplicate: 'Sleeper'...");
        boolean isAdded = trainFormation.add("Sleeper");

        // 4. Verify if the duplicate was blocked
        if (!isAdded) {
            System.out.println("System Alert: Bogie 'Sleeper' is already attached. Duplicate blocked.");
        }

        // 5. Display the final formation order
        System.out.println("\nFinal Train Formation (Order Preserved):");
        System.out.println(trainFormation);

        // Demonstrating the count
        System.out.println("Total Unique Bogies in Sequence: " + trainFormation.size());
    }
}