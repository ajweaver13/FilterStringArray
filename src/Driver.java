import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        FilterStringArray fsa = new FilterStringArray();
        System.out.println("----------------------------------------------");
        System.out.println("|                  Welcome!                  |");
        System.out.println("|                                            |");
        System.out.println("|   This program will filter strings from    |");
        System.out.println("|   integers and then multiply any integer   |");
        System.out.println("|                   by 11.                   |");
        System.out.println("|                                            |");
        System.out.println("|    Enter * to move to the next activity    |");
        System.out.println("|                  or exit.                  |");
        System.out.println("----------------------------------------------\n");

        System.out.print("Please enter an array with a space separating them: ");
        String line = scan.nextLine();
        while (!line.equals("*")) {
            String[] array = line.split(" ");
            System.out.print("Output: "+ Arrays.toString(fsa.filterArray(array)) + "\n");
            System.out.print("Please enter an array with a space separating them: ");
            line = scan.nextLine();
        }

        System.out.print("\nPlease enter a number: ");
        line = scan.nextLine();
        while (!line.equals("*")) {
            line = check(line);
            System.out.print("Output: "+ fsa.multiplyBy11(line) + "\n");
            System.out.print("Please enter a number: ");
            line = scan.nextLine();
        }
    }

    public static String check(String number) {
        try {
            Long.parseLong(number);
        } catch(Exception e) {
            System.out.println("Invalid input!");
            System.out.print("\nPlease enter a number: ");
            number = scan.nextLine();
            if (!number.equals("*")) {
                number = check(number);
            } else {
                System.exit(0);
            }
        }
        return number;
    }
}
