import java.util.Arrays;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() { return type; }
    public String getCargo() { return cargo; }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. User prepares a list of goods bogies
        List<GoodsBogie> trainCargo = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal"),
                new GoodsBogie("Open", "Grain"),
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Flat", "Steel")
        );

        // 2. System converts list into a stream
        // 3. allMatch() checks every bogie against safety rules
        // Rule: If type is "Cylindrical", cargo MUST be "Petroleum"
        boolean isSafe = trainCargo.stream().allMatch(bogie -> {
            if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                return bogie.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies pass this specific rule
        });

        // 5. Result is displayed
        System.out.println("--- Safety Inspection Report ---");
        if (isSafe) {
            System.out.println("STATUS: [SAFE] - All cargo matches bogie specifications.");
        } else {
            System.out.println("STATUS: [DANGER] - Safety violation detected! Check Cylindrical bogies.");
        }
        System.out.println("-------------------------------");
    }
}