
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variable and assign user input to it
        int number = Integer.valueOf(scanner.nextLine());

        // Operations and declaring the variable for result
        int negative = number * -1;

        // Number used in conditioal operations
        if (number < 0) {
            System.out.println(negative);
        } else if (number > 0) {
            System.out.println(number);
        } else {
            System.out.println(number);
        }
    }
}
