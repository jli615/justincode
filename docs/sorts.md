{% include navigation.html %}

## Sorts!

### Analysis
- Based on the results and the big o notation, the best sort is Merge Sort because it has the smallest big O notation (nlog(n) is more efficient than n^2)
- Results from running the algorithms: [Time and Swaps](https://docs.google.com/spreadsheets/u/7/d/1OUK_QME8nq_A_T0iI7AC677uC2ioFfvJhsV4LAzEatE/edit?usp=drive_web&ouid=102960307689219371082)
	
### Bubble Sort
- In bubble sort, we iterate through the data structure, comparing each consecutive pair of elements to see if they need to be swapped.
- We iterate through the data structure many times, continuing to swap values. We only stop once an entire iteration passes in which no swaps occur. Once this happens, we know that the data structure is sorted.
- Bubble Sort has an O(n^2) complexity, since in its worst case scenario we would have to iterate through the data structure (where the first n comes from) n times in order to sort it out (thus n^2)

### Selection Sort
- In selection sort, we start off by iterating through the entire data structure (indexes 0 thru n-1) for the element with the smallest value. It's value and index are stored. We then swap out the lowest value with the first element.
- Next, we iterate through the rest of the elements (1 thru n-1) for the element with the next smallest value, and then swap that with the second element. We continue doing this in each iteration, taking the next smallest value and moving it to the front, until the entire data structure is sorted in order.
- Selection Sort has an O(n^2) complexity since for each index in the data structure (where the first n comes from), it must iterate through the elements in the data structure (where n^2 comes from).
 
### Insertion Sort
- In insertion sort, we start off by comparing the first two elements in the data structure. If they are in the right order, nothing happens. If they aren't then they are swapped.
- Next, we compare the next element to the one previous to it. If it is smaller, then they two elements swap places, and we compare the element and the next one previous to it.
- As we work through the entire data structure, we focus on swapping one term down at a time until it falls into the right order. Then we move on to focusing on swapping the next term - all the way until all the terms are in order
- Insertion Sort has an O(n^2) complexity since for each index in the data structure (first n), it has the possibility of iterating through every element before it to find its place (where the n^2 comes from)

### Merge Sort
- In Merge Sort, we continuously divide the data structure into smaller and smaller substructures until they cannot be broken up anymore.
- Each pair of broken up substructures is then sorted and then merged almost like a zipper: the elements of substructure 1 are compared to the elements of substructure 2 in order to create a unified substructure.
- This continues until all that is left is one big substructure that is now ordered.
- Merge Sort has an O(nlog(n)) complexity. This is because since the structures are split in half over and over again, the # of total operations is proportional to the number of powers of 2 - aka the log.
	
### Highlights of Work

In this coding assignment, I made use of Runnable
```
public class Sorts implements Runnable {
```

And inheritance
```
public class InsertionSort extends Sorts implements Runnable {
```

This required the implementation of a "public void run()" function so that the runnable thread can be stored and run in a hashmap.
```
public void run() {
        int sum=0, time=0, TIMES=12, SIZE=5000;

        for(int i=0; i< TIMES; i++) {
            InsertionSort s = new InsertionSort(SIZE);
            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
                // System.out.println(s.getData());
                sum += s.getData().get(j);
            }
            System.out.println("Average random: " + sum / ((i+1)*SIZE));
            System.out.println("Average time: " + s.getTimeElapsed());
            System.out.println(s.getSwaps());
            time += s.getTimeElapsed();
        }
        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
    }
```

using Instant.now() before and after the algorithm to store the beginning and ending times allowed us to calculate how long it took
```
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
```
