package tt3;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class InsertionSort extends Sorts {

    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;
    private int swaps;
    private int comparisons;

    public InsertionSort(int size) {
        super(size);
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        int arraySize = data.size();
        for (int i = 1; i < arraySize; i++) {
            int value = data.get(i);
            int index = i - 1;
            while (index >= 0 && data.get(index) > value) {
                data.set(index + 1, data.get(index));
                this.swaps++;
                index--;
            }
            data.set(index + 1, value);
        }
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    public int getSwaps() { return this.swaps; }
    public int getComparisons() { return this.comparisons; }

    public static void main(String[] args) {
        int sum=0, time=0, TIMES=12, SIZE=5000;

        for(int i=0; i< TIMES; i++) {
            InsertionSort s = new InsertionSort(SIZE);
            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
                // System.out.println(s.getData());
                sum += s.getData().get(j);
            }
            //System.out.println("Average random: " + sum / ((i+1)*SIZE));
            //System.out.println(s.getTimeElapsed());
            System.out.println(s.getSwaps());
            time += s.getTimeElapsed();
        }
        //System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
    }
}

