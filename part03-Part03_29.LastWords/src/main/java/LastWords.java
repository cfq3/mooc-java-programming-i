
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reads user input until an empty line is entered
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            // For each non-empty line, the program splits the string by spaces 
            // and prints the last part of the string

            String[] parts = input.split(" "); // splits input into array of substrings, using "" to separate & store in parts array
            if (parts.length > 0) {
                // Retrieve last element of the array
                String lastElement = parts[parts.length - 1];
                System.out.println(lastElement);
            }
        }
    }
}
