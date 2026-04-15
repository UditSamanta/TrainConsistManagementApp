import java.util.*;
import java.util.stream.Collectors;

// Base Bogie Class
abstract class Bogie {
    private String id;
    private String type;

    public Bogie(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public abstract String getDetails();
}

// Passenger Bogie
class PassengerBogie extends Bogie {
    private int seatCapacity;

    public PassengerBogie(String id, String type, int seatCapacity) {
        super(id, type);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public String getDetails() {
        return "Passenger Bogie [ID=" + getId() +
                ", Type=" + getType() +
                ", Seats=" + seatCapacity + "]";
    }
}

// Goods Bogie
class GoodsBogie extends Bogie {
    private String cargoType;

    public GoodsBogie(String id, String type, String cargoType) {
        super(id, type);
        this.cargoType = cargoType;
    }

    @Override
    public String getDetails() {
        return "Goods Bogie [ID=" + getId() +
                ", Type=" + getType() +
                ", Cargo=" + cargoType + "]";
    }
}

// Main Application
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create the initial list of bogies
        List<Bogie> allBogies = new ArrayList<>();
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("First Class", 24));
        allBogies.add(new Bogie("General", 90));

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("P1", "Sleeper", 72));
        bogies.add(new PassengerBogie("P2", "AC Chair", 50));
        bogies.add(new PassengerBogie("P3", "First Class", 30));
        bogies.add(new PassengerBogie("P4", "Sleeper", 72));

        bogies.add(new GoodsBogie("G1", "Cylindrical", "Oil"));
        bogies.add(new GoodsBogie("G2", "Rectangular", "Coal"));
        bogies.add(new GoodsBogie("G3", "Cylindrical", "Gas"));

        // Step 2: Convert list into stream and group by type
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        // Step 3: Display grouped result
        System.out.println("=== Grouped Bogies by Type ===");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());

            for (Bogie bogie : entry.getValue()) {
                System.out.println("  " + bogie.getDetails());
            }
        }
    }
}