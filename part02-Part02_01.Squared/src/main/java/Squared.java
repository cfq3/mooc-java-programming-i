
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get number from user
        int number = Integer.valueOf(scanner.nextLine());

        // Square operation
        int square = number * number;

        // Printing the result of the operation
        System.out.println(square);
    }
}
