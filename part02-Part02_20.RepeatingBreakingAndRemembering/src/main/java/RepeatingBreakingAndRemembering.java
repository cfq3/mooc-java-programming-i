
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        // Create variables needed for loop
        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");

        while (true) {
            // Get user input
            int num = Integer.valueOf(scanner.nextInt());

            // if number is even add 1 to even number count
            if (num % 2 == 0) {
                even = even + 1;
            }

            // if number is odd add 1 to odd number count EXCLUDE -1
            if (num % 2 != 0 && num != -1) {
                odd = odd + 1;
            }

            // If user input '-1' break loop
            if (num == -1) {
                break;
            }

            // calculate sum
            sum += num;
            // calculate count of numbers
            count = count + 1;
            //calculate average
            avg = 1.0 * sum / count;
        }
        // Print statements after loop ends
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
