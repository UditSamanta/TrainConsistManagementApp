import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    int capacity;
    public Bogie(int capacity) { this.capacity = capacity; }
    public int getCapacity() { return capacity; }
}

public class PerformanceComparison {
    public static void main(String[] args) {
        // 1. Prepare a large collection of bogies (100,000 items)
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie(i % 100)); // Capacities 0-99
        }

        // --- LOOP-BASED FILTERING ---
        long startLoop = System.nanoTime(); // Start Time
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }
        long endLoop = System.nanoTime(); // End Time
        long loopDuration = endLoop - startLoop;

        // --- STREAM-BASED FILTERING ---
        long startStream = System.nanoTime(); // Start Time
        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime(); // End Time
        long streamDuration = endStream - startStream;

        // 6. Execution time is displayed
        System.out.println("--- Performance Benchmark Results ---");
        System.out.println("Dataset Size      : " + bogies.size() + " bogies");
        System.out.println("Loop Duration     : " + loopDuration + " ns");
        System.out.println("Stream Duration   : " + streamDuration + " ns");
        System.out.println("Result Consistency: " + (loopResult.size() == streamResult.size()));
        System.out.println("-------------------------------------");

        if (loopDuration < streamDuration) {
            System.out.println("Observation: Loop was faster by " + (streamDuration - loopDuration) + " ns");
        } else {
            System.out.println("Observation: Stream was faster by " + (loopDuration - streamDuration) + " ns");
        }
    }
}