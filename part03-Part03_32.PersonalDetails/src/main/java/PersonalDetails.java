
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int totalBirthYears = 0; // Store sum of all birth years
        int count = 0;           // Count number of entries
        String longestName = ""; // Store the longest name
        int maxLength = 0;       // Store the length of the longest name

        while (true) {
            String input = scanner.nextLine(); // Get input from user

            // End loop if user enters an empty line
            if (input.equals("")) {
                break; // Exit the loop
            }

            String[] data = input.split(","); // Split input string by commas into an array
            int birthyear = Integer.valueOf(data[1]); // Convert the birth year(second element) into an integer
            String name = data[0]; // Get the name (first element)

            // Calculate longest name
            int length = name.length(); 
            if (length > maxLength) { // Check if the current name is longest found so far
                maxLength = length;   // Update maxLength with the length of the current name
                longestName = name;   // Update longestName with the current name
            }

            // Add birthyear to the total sum of birth years
            totalBirthYears += birthyear;
            // Increment the count of entries
            count++;
        }

        // Calculate average birth year
        int avgBirthyear;
        if (count > 0) {
            avgBirthyear = totalBirthYears / count;
        } else {
            avgBirthyear = 0;
        }
        
        // Print the longest name
        System.out.println("Longest name: " + longestName);
        //Pring the average of the birth years
        System.out.println("Average of the birth years: " + avgBirthyear);
    }
}
