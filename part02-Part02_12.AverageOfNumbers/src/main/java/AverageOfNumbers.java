
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize variables for counting, sum and average
        int count = 0;
        double sum = 0;
        double average = 0;

        while (true) {
            // prompts user
            // user value is assigned to number
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // if input is '0' break loop
            if (number == 0) {
                break;
            }

            // loops for adding count. i
            // increment count by 1 for each positive and negative number
            if (number > 0) {
                count = count + 1;
            }
            if (number < 0) {
                count = count + 1;
            }
            // loops for sum
            // sum initialzed as zero. add number value to sum for each positive and negative number
            if (number > 0) {
                sum = number + sum;
            }
            if (number < 0) {
                sum = number + sum;
            }
        }
        // calculate and print out average
        average = (sum / count) * 1.0;
        System.out.println("Average of the numbers: " + average);
    }
}
