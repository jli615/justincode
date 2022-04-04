package tt3;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort extends Sorts {

    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;


    public MergeSort(int size) {
        super(size);
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        int arraySize = data.size();
        sort(data, 0, size - 1);
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    public void merge(ArrayList<Integer> arr, int l, int m, int r) {
        int index1 = m - l + 1;
        int index2 = r - m;

        ArrayList<Integer> left = new ArrayList<>(index1);
        ArrayList<Integer> right = new ArrayList<>(index2);

        for (int i = 0; i < index1; i++) {
            left.add(arr.get(l + i));
        }
        for (int j = 0; j < index2; j++) {
            right.add(arr.get(m + 1 + j));
        }

        int a = 0;
        int b = 0;
        int c = l;

        while (a < index1 && b < index2) {
            if (left.get(a) <= right.get(b)) {
                arr.set(c, left.get(a));
                a++;
            } else {
                arr.set(c, right.get(b));
                b++;
            }
            c++;
        }
        while (a < index1) {
            arr.set(c, left.get(a));
            a++;
            c++;
        }
        while (b < index2) {
            arr.set(c, right.get(b));
            b++;
            c++;
        }

    }

    public void sort(ArrayList<Integer> arr, int l, int r) {
        if (l < r) {

            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }


    public static void main(String[] args) {
        int sum=0, time=0, TIMES=12, SIZE=5000;

        for(int i=0; i< TIMES; i++) {
            MergeSort s = new MergeSort(SIZE);
            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
                // System.out.println(s.getData());
                sum += s.getData().get(j);
            }
            System.out.println("Average random: " + sum / ((i+1)*SIZE));
            System.out.println("Nanoseconds: " + s.getTimeElapsed());
            time += s.getTimeElapsed();
        }
        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
    }
}

