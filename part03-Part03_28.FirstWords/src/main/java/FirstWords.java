
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reads user input until an empty line is entered
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            // For each non empty line in program
            // Spit the string by spaces
            // Print the first part of the string
            String[] pieces = input.split(" ");

            // Print the first part of the string if it exists
            if (pieces.length > 0) {
                System.out.println(pieces[0]);
            }
        }
    }
}
