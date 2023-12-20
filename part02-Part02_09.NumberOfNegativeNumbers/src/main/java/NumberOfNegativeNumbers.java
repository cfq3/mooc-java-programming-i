
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize int count to count for negative numbers
        int count = 0;

        while (true) {
            // ask for number
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // when user inputs 0, exit loop
            if (number == 0) {
                break;
            }

            // increase counter if number is negative
            if (number < 0) {
                count = count + 1;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
