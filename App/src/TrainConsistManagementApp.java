import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a LinkedList<String> for the train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("=== UC4: Ordered Train Formation (LinkedList) ===");

        // 2. Add initial bogies: Engine, Sleeper, AC, Cargo, Guard
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train: " + trainConsist);

        // 3. Insert 'Pantry Car' at position 2 (index 2)
        // Note: Indexing starts at 0, so position 2 is the 3rd element
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car: " + trainConsist);

        // 4. Remove the first and last bogie
        String removedFirst = trainConsist.removeFirst();
        String removedLast = trainConsist.removeLast();

        System.out.println("Removed First: " + removedFirst);
        System.out.println("Removed Last: " + removedLast);

        // 5. Display the final ordered train consist
        System.out.println("\nFinal Ordered Train Consist: " + trainConsist);
    }
}