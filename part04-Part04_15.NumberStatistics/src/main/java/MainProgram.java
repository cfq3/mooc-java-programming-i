
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        
        System.out.println("Enter numbers: ");
        int number = scanner.nextInt();
        while(number != -1) {
            statistics.addNumber(number);
            number = scanner.nextInt();
        } 
            System.out.println("Sum: " + statistics.sum());
    }
}
