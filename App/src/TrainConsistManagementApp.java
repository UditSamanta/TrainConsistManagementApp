import java.util.Arrays;
import java.util.List;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}



public class TrainConsistManagementApp{
    public static void main(String[] args) {
        // 1. User creates a list of bogies (Reuse from previous UC)
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair Car", 56),
                new Bogie("Sleeper", 72),
                new Bogie("General", 90),
                new Bogie("AC 2-Tier", 48)
        );

        // 2. System converts list into a stream
        // 3. map() extracts capacity values
        // 4. reduce() sums the capacities using 0 as identity and Integer::sum
        int totalSeatingCapacity = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // 5. Total seating capacity is displayed
        System.out.println("--- Train Seating Analytics ---");
        System.out.println("Total Bogies: " + bogies.size());
        System.out.println("Total Seating Capacity: " + totalSeatingCapacity);
        System.out.println("-------------------------------");

        // 6. Program continues (Original list remains intact)
    }
}