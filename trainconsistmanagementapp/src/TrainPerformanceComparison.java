import java.util.*;
import java.util.stream.*;

class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainPerformanceComparison {

    public static void main(String[] args) {

        List<PassengerBogie> bogies = Arrays.asList(
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("First Class", 48),
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("First Class", 48)
        );

        long loopStart = System.nanoTime();
        List<PassengerBogie> loopFiltered = new ArrayList<>();
        for (PassengerBogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        System.out.println("Loop Filtered Bogies: " + loopFiltered);
        System.out.println("Loop Execution Time (ns): " + (loopEnd - loopStart));

        long streamStart = System.nanoTime();
        List<PassengerBogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        System.out.println("Stream Filtered Bogies: " + streamFiltered);
        System.out.println("Stream Execution Time (ns): " + (streamEnd - streamStart));
    }
}