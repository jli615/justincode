## Linked List
- Linked Lists are a type of data structure in which each piece of data contains a reference link to the next piece of data, meaning that the next node can be referenced through the cucrent node
- In our code, generic T was used because we did not know which data types would be inputed into the queue, and so it allows us to use the data without specifically defining a data type

### Highlights of Work

How Linked Lists are used to build Queues
```
public void add(T data) {
        // add new object to end of Queue
        LinkedList<T> tail = new LinkedList<>(data, this.tail);

        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.tail.setNextNode(tail); // current tail points to new tail
            this.tail = tail;  // update tail
        }
    }
```

Algorithm to merge data from queue1 (this) and queue2

```
while (!(this.getHead() == null && queue2.getHead() == null)) {
            //if queue1 is empty
            if (this.getHead() == null) {
                T add = queue2.getHead().getData();
                queue2.delete();
                mergeArr.add(add);
            } else if (queue2.getHead() == null) {
                //if queue 2 is empty
                T add = this.getHead().getData();
                this.delete();
                mergeArr.add(add);
            } else if (this.getHead().getData().hashCode() <= queue2.getHead().getData().hashCode()) {
                //if queue1 head < queue 2 head
                T add = this.getHead().getData();
                this.delete();
                mergeArr.add(add);
            } else if (this.getHead().getData().hashCode() > queue2.getHead().getData().hashCode()){
                //if queue2 head < queue 1 head
                T add = queue2.getHead().getData();
                queue2.delete();
                mergeArr.add(add);
            }
```


Algorithm to reverse a Queue to its opposite order
```
public Queue<T> reverseQueue() {
        Queue<T> reverse = new Queue<>();
        while (this.getHead() != null) {
            T add = this.getTail().getData();
            reverse.add(add);
        }

        return reverse;
```
