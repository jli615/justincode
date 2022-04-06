import LinkedList2.Queue;
import LinkedList2.QueueTester;
import tt2.Calculator;
import tt3.*;
import java.util.HashMap; // import the HashMap class


import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IntByReference function = new IntByReference(1);
        Thread t1 = new Thread(new IntByReference(1));
        //t1.start();

        Thread matrix = new Thread(new Matrix(new int[10][20]));
        //matrix.start();

        Thread queue = new Thread(new QueueTester());
        //queue.start();

        Thread calculator = new Thread(new Calculator("1+1"));
        //calculator.start();

        Thread sorts = new Thread(new Sorts(5000));
        //sorts.start();

        Thread bSort = new Thread(new BubbleSort(5000));
        //bSort.start();

        Thread iSort = new Thread(new InsertionSort(5000));
        //iSort.start();

        Thread mSort = new Thread(new MergeSort(5000));
        //mSort.start();

        Thread sSort = new Thread(new SelectionSort(5000));
        //sSort.start();

        //1part 2
        /**IntByReference.swapper(21, 16);
        IntByReference.swapper(16, 21);
        IntByReference.swapper(16, -1);
        IntByReference.swapper(100, 20);

        //part 3
        Matrix m0 = new Matrix(keypad());
        System.out.println("Keypad:");
        System.out.println(m0);

        Matrix m1 = new Matrix(numbers());
        System.out.println("Numbers Systems:");
        System.out.println(m1);*/

        //part 1

        Menu selection = new Menu();
        int choice = selection.menu();

        Map<Integer, Thread> myElements = new Hashtable<Integer, Thread>(); {
            myElements.put(1, t1);
            myElements.put(2, matrix);
            myElements.put(3, queue);
            myElements.put(4, calculator);
            myElements.put(5, sorts);
            myElements.put(6, bSort);
            myElements.put(7, iSort);
            myElements.put(8, mSort);
            myElements.put(9, sSort);
        }

        myElements.get(choice).start();
    }

    static int[][] keypad() {
        return new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };
    }

    // declare and initialize a random length arrays
    static int[][] numbers() {
        return new int[][]{ { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
    }


    public static void menu() {
        int selection;
        System.out.print("Select your choice: ");
        Scanner scan = new Scanner(System.in);

        Hashtable<Integer, String> menu = new Hashtable<Integer, String>();


        menu.put(1, "Hello");
        menu.put(2, "Printy");
        menu.put(3, "Loopy");
        menu.put(4, "Classy Print");
        menu.put(5, "Classy Poem");
        menu.put(6, "Binary");
        menu.put(7, "Termy");
        menu.put(0, "Quit");

        selection = scan.nextInt();
        String output =  menu.get(selection);
        System.out.println(output);

        menu();
    }
}
