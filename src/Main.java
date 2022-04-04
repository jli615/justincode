import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //part 2
        IntByReference.swapper(21, 16);
        IntByReference.swapper(16, 21);
        IntByReference.swapper(16, -1);
        IntByReference.swapper(100, 20);

        //part 3
        Matrix m0 = new Matrix(keypad());
        System.out.println("Keypad:");
        System.out.println(m0);

        Matrix m1 = new Matrix(numbers());
        System.out.println("Numbers Systems:");
        System.out.println(m1);

        //part 1
        menu();

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
