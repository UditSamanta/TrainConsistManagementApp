// 1. Create a custom runtime exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape; // e.g., "Cylindrical" or "Rectangular"
    private String currentCargo = "Empty";

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // 2. Validate compatibility before assignment
    public void assignCargo(String cargo) {
        System.out.println("Attempting to assign [" + cargo + "] to [" + shape + "] bogie...");

        // 3. Throw exception for unsafe combinations
        if (cargo.equalsIgnoreCase("Petroleum") && shape.equalsIgnoreCase("Rectangular")) {
            throw new CargoSafetyException("SAFETY VIOLATION: Petroleum cannot be carried in Rectangular bogies due to leak risks.");
        }

        this.currentCargo = cargo;
        System.out.println("✔ Assignment Successful.");
    }

    public String getShape() { return shape; }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");

        // 4. Test logic using try-catch-finally
        processCargo(cylindricalBogie, "Petroleum"); // Safe case
        processCargo(rectangularBogie, "Petroleum"); // Unsafe case
        processCargo(rectangularBogie, "Coal");      // Safe case

        System.out.println("\n[System Status: Online] - Program continued safely.");
    }

    public static void processCargo(GoodsBogie bogie, String cargo) {
        try {
            bogie.assignCargo(cargo);
        } catch (CargoSafetyException e) {
            // 5. Catch block handles the error and prevents crash
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            // 6. Finally block executes mandatory logging/cleanup
            System.out.println("LOG: Cargo validation cycle completed for " + bogie.getShape() + " bogie.");
            System.out.println("---------------------------------------------------------");
        }
    }
}