import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. User provides passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities: " + Arrays.toString(capacities));

        // 2. Bubble Sort Logic
        bubbleSort(capacities);

        // 6. Sorted result is displayed
        System.out.println("Sorted Capacities:   " + Arrays.toString(capacities));
    }

    /**
     * Sorts an array using the Bubble Sort algorithm.
     * Uses nested loops to compare and swap adjacent elements.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // 3. System iterates through the array (Multiple passes)
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place, so we ignore them
            for (int j = 0; j < n - i - 1; j++) {

                // 4. Adjacent values are compared
                if (arr[j] > arr[j + 1]) {
                    // 5. If out of order, values are swapped
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}