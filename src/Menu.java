import java.util.*;

public class Menu {
    public int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - IntByReference Swap");
        System.out.println("2 - Matrix");
        System.out.println("3 - Queue");
        System.out.println("4 - Calculator");
        System.out.println("5 - Sorts");
        System.out.println("6 - Bubble Sort");
        System.out.println("7 - Insertion Sort");
        System.out.println("8 - Merge Sort");
        System.out.println("9 - Selection Sort");


        selection = input.nextInt();
        return selection;

    }
}