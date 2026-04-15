import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. User provides bogie IDs (may be unsorted initially)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String searchKey = "BG412";

        // Precondition: Binary search REQUIRES sorted data
        Arrays.sort(bogieIds);
        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Perform Binary Search
        int resultIndex = performBinarySearch(bogieIds, searchKey);

        // Display Result
        if (resultIndex != -1) {
            System.out.println("✔ Bogie ID [" + searchKey + "] found at sorted index: " + resultIndex);
        } else {
            System.out.println("❌ Bogie ID [" + searchKey + "] not found.");
        }
    }

    public static int performBinarySearch(String[] arr, String target) {
        // 3. Initialize low and high indexes
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // 4. Find the middle index
            int mid = low + (high - low) / 2;

            // 5. Compare key with middle value using compareTo()
            int comparison = target.compareTo(arr[mid]);

            if (comparison == 0) {
                return mid; // Found!
            } else if (comparison > 0) {
                // 6. Target is in the upper half
                low = mid + 1;
            } else {
                // 6. Target is in the lower half
                high = mid - 1;
            }
        }
        return -1; // Exhausted range, not found
    }
}