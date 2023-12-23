
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialze sum
        int sum = 0;
        // ask for user input
        System.out.println("Last number?");
        int n = Integer.valueOf(scanner.nextLine());

        int i = 0;
        while (i <= n) {
            sum = i + sum;
            i++;
        }
        System.out.println("The sum is: " + sum);
    }
}
