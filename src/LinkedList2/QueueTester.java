package LinkedList2;

public class QueueTester implements Runnable {
    public void run() {
        // Create iterable Queue of Words
        Object[] words = new String[] { "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};
        QueueManager qWords = new QueueManager("Words", words );
        qWords.printQueue();

        // Create iterable Queue of Integers
        Object[] numbers = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        QueueManager qNums = new QueueManager("Integers", numbers );
        qNums.printQueue();



        qNums.queue.add(10);
        qNums.printQueue();
        qNums.queue.delete();
        qNums.printQueue();
        qNums.queue.delete();
        qNums.printQueue();

        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();


        Object[] num1 = new Integer[] { 1, 4, 5, 8};
        QueueManager qNum1 = new QueueManager("Integers", num1 );
        qNum1.printQueue();

        Object[] num2 = new Integer[] { 2, 3, 6, 7};
        QueueManager qNum2 = new QueueManager("Integers", num2 );
        qNum2.printQueue();

        Queue qMerged = qNum1.queue.merge(qNum2.queue);

        System.out.print("Merged Queue: ");
        for (Object data : qMerged)
            System.out.print(data + " -> ");
        System.out.print("nil");


        Queue qReverse = qNum1.queue.reverseQueue();
        for (Object data : qReverse)
            System.out.print(data + " -> ");
        System.out.print("nil");
    }

    public static void main(String[] args)
    {
        // Create iterable Queue of Words
        Object[] words = new String[] { "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};
        QueueManager qWords = new QueueManager("Words", words );
        qWords.printQueue();

        // Create iterable Queue of Integers
        Object[] numbers = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        QueueManager qNums = new QueueManager("Integers", numbers );
        qNums.printQueue();



        qNums.queue.add(10);
        qNums.printQueue();
        qNums.queue.delete();
        qNums.printQueue();
        qNums.queue.delete();
        qNums.printQueue();

        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();
        qWords.queue.delete();
        qWords.printQueue();


        Object[] num1 = new Integer[] { 1, 4, 5, 8};
        QueueManager qNum1 = new QueueManager("Integers", num1 );
        qNum1.printQueue();

        Object[] num2 = new Integer[] { 2, 3, 6, 7};
        QueueManager qNum2 = new QueueManager("Integers", num2 );
        qNum2.printQueue();

        Queue qMerged = qNum1.queue.merge(qNum2.queue);

        System.out.print("Merged Queue: ");
        for (Object data : qMerged)
            System.out.print(data + " -> ");
        System.out.print("nil");


        Queue qReverse = qNum1.queue.reverseQueue();
        for (Object data : qReverse)
            System.out.print(data + " -> ");
        System.out.print("nil");

    }
}