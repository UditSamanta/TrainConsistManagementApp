import java.util.ArrayList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create an ArrayList<String> for passenger bogies
        ArrayList<String> trainBogies = new ArrayList<>();

        System.out.println("--- UC2: Adding Passenger Bogies ---");

        // 2. Add bogies: Sleeper, AC Chair, First Class
        trainBogies.add("Sleeper");
        trainBogies.add("AC Chair");
        trainBogies.add("First Class");

        // 3. Print the list after insertion
        System.out.println("Train Consist after adding bogies: " + trainBogies);

        // 4. Remove one bogie (AC Chair)
        System.out.println("\nRemoving 'AC Chair' from the train...");
        trainBogies.remove("AC Chair");

        // 5. Use contains() to check if 'Sleeper' exists
        System.out.println("Checking existence of 'Sleeper' bogie...");
        if (trainBogies.contains("Sleeper")) {
            System.out.println("Result: Sleeper bogie is present in the train.");
        } else {
            System.out.println("Result: Sleeper bogie not found.");
        }

        // 6. Print final list state
        System.out.println("\nFinal Train Consist: " + trainBogies);
        System.out.println("Total Bogies: " + trainBogies.size());
    }
}