## Sorts!

### Analysis
- Based on the results and the big o notation, the best sort is Merge Sort because it has the smallest big O notation (nlog(n) is more efficient than n^2)
	
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
	
