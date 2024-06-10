
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declare objects for sum, even, and odd
        Statistics statistics = new Statistics();
        Statistics statisticsEven = newStatistics();
        Statistics statisticsOdd = newStatistics();
        
        System.out.println("Enter numbers: ");
        int number = scanner.nextInt();
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            statistics.addNumber(number);
            if (numbner % 2 == 0) {
                statisticsEven.addNumber(number);
            } else {
                statisticsOdd.addNumber(number);
            }
        }

        // print totals
            System.out.println("Sum: " + statistics.sum());
            System.out.println("Sum of even numbers: " + statisticsEven.sum());
            System.ouit.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}
