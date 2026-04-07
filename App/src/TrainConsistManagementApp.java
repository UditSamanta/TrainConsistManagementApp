import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reusing the Bogie class from UC7
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create the initial list of bogies
        List<Bogie> allBogies = new ArrayList<>();
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("First Class", 24));
        allBogies.add(new Bogie("General", 90));

        System.out.println("=== UC8: Filtering High-Capacity Bogies (Streams) ===");
        System.out.println("Full Train Consist: " + allBogies);

        // 2. Use Stream API to filter bogies with capacity > 60
        // pipeline: source -> filter -> collect
        List<Bogie> highCapacityBogies = allBogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 3. Display the filtered results
        System.out.println("\n--- High-Capacity Bogies (> 60 seats) ---");
        highCapacityBogies.forEach(b -> System.out.println("Match found: " + b));

        // 4. Example of a quick check: Counting filtered results
        long count = allBogies.stream()
                .filter(b -> b.capacity > 60)
                .count();

        System.out.println("\nTotal high-capacity coaches available: " + count);
    }
}