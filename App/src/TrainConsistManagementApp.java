import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Create a Bogie class to model real-world attributes
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Overriding toString() for clean console output
    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 2. Create a List<Bogie> to store custom objects
        List<Bogie> passengerBogies = new ArrayList<>();

        System.out.println("=== UC7: Sorting Bogies by Capacity ===");

        // 3. Add bogies with varying capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("Initial List: " + passengerBogies);

        // 4. Use Comparator.comparingInt() to sort by capacity (Ascending)
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 5. Display the sorted results
        System.out.println("\n--- Bogies Sorted by Capacity (Smallest to Largest) ---");
        for (Bogie b : passengerBogies) {
            System.out.println(">> " + b);
        }

        // 6. Bonus: Sorting in Descending order for high-capacity planning
        passengerBogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());
        System.out.println("\n--- High-Capacity Ranking (Largest to Smallest) ---");
        passengerBogies.forEach(b -> System.out.println("Rank: " + b));
    }
}