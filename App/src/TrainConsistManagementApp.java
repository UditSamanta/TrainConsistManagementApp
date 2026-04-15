// 1. Create a custom exception class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    private String type;
    private int capacity;

    // 2. Validate capacity inside the constructor
    // 3. Declare constructor with throws declaration
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            // 4. Throw the exception when business rules are violated
            throw new InvalidCapacityException("Capacity must be greater than zero. Received: " + capacity);
        }
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; }
    public String getType() { return type; }
}

public class TrainSafetySystem {
    public static void main(String[] args) {
        System.out.println("--- Train Consistency Validation ---");

        // Test Case 1: Valid Creation
        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("✔ Bogie Created: " + b1.getType() + " (" + b1.getCapacity() + " seats)");
        } catch (InvalidCapacityException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        // Test Case 2: Invalid Creation (Zero Capacity)
        try {
            PassengerBogie b2 = new PassengerBogie("AC Chair Car", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("❌ Caught Expected Exception: " + e.getMessage());
        }

        // Test Case 3: Invalid Creation (Negative Capacity)
        try {
            PassengerBogie b3 = new PassengerBogie("General", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("❌ Caught Expected Exception: " + e.getMessage());
        }

        System.out.println("------------------------------------");
    }
}