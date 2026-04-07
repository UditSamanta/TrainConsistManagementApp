import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Print a welcome message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize an empty List using ArrayList
        // We use the List interface for abstraction and ArrayList for the implementation
        List<String> trainBogies = new ArrayList<>();

        // 3. Display the initial bogie count using size()
        int initialCount = trainBogies.size();

        System.out.println("Initializing train consist...");
        System.out.println("Initial Bogie Count: " + initialCount);

        // 4. Program continues (Confirmation message)
        System.out.println("Status: System ready for bogie attachment.");
    }
}