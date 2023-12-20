
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize variables for count and sum
        int count = 0;
        int sum = 0;

        while (true) {
            // for entering number
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // break loop if input is 0
            if (number == 0) {
                break;
            }

            // loops to add to count
            if (number > 0) {
                count = count + 1;
            }
            if (number < 0) {
                count = count + 1;
            }

            // loops to add sum
            if (number < 0) {
                sum = number + sum;
            }
            if (number > 0) {
                sum = number + sum;
            }
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
