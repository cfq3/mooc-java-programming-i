
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to read user input until an empty line is entered
        while (true) {
            String userInput = scanner.nextLine(); // Get user input

            // Check if the user input is an empty line
            if (userInput.equals("")) { // If the userInput is an empyty string
                break; // Break the loop
            }

            // Split the user input into an array of words based on spaces
            String[] splitStringArray = userInput.split(" "); // Split userInput

            // Iterate over each word in the splitStringArray
            for (String word : splitStringArray) { // For each word in the splitStringArray
                if (word.contains("av")) { // Check if the word contains "av"
                    System.out.println(word); // Print the word to the console
                }
            }
        }
    }
}
