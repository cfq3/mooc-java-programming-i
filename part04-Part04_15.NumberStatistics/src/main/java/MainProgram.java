
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declare objects for sum, even, and odd
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        
        System.out.println("Enter numbers: ");
        
        while(true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            statistics.addNumber(number);
            if (number % 2 == 0) {
                statisticsEven.addNumber(number);
            } else {
                statisticsOdd.addNumber(number);
            }
        }

        // print totals
            System.out.println("Sum: " + statistics.sum());
            System.out.println("Sum of even numbers: " + statisticsEven.sum());
            System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}
