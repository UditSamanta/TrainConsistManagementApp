import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a HashMap<String, Integer>
        // Key: Bogie Name (String), Value: Seating Capacity (Integer)
        Map<String, Integer> bogieCapacities = new HashMap<>();

        System.out.println("=== UC6: Bogie to Capacity Mapping (HashMap) ===");

        // 2. Use put() to map bogies to their specific capacities
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        // 3. Displaying the map structure
        System.out.println("Bogie Data stored successfully.");

        // 4. Iterate over the map using entrySet() to display details
        System.out.println("\n--- Train Capacity Summary ---");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }

        // 5. Fast Lookup Example
        String searchBogie = "AC Chair";
        if (bogieCapacities.containsKey(searchBogie)) {
            System.out.println("\nQuick Search: " + searchBogie + " has a limit of " + bogieCapacities.get(searchBogie) + " passengers.");
        }
    }
}