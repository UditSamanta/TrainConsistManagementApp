import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. User provides bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original Order: " + Arrays.toString(bogieNames));

        // 2. System calls Arrays.sort() on the array
        // 3. Java internally sorts the values (Natural Alphabetical Order)
        Arrays.sort(bogieNames);

        // 4. Sorted bogie names are displayed
        System.out.println("Sorted Order:   " + Arrays.toString(bogieNames));

        // 5. Program continues
        System.out.println("\n--- Sorting Efficiency Note ---");
        System.out.println("Algorithm: Dual-Pivot Quicksort / TimSort");
        System.out.println("Complexity: O(n log n)");
    }
}