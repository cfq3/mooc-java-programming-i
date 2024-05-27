
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int totalBirthYears = 0;
        int count = 0;
        String longestName = "";
        int maxLength = 0;

        while (true) {
            String input = scanner.nextLine(); // Get input from user

            // End loop if user enters an empty line
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(","); // Split input string by comma
            int birthyear = Integer.valueOf(data[1]); // Convert birthyear into type int
            String name = data[0];

            // Calculate longest name
            int length = name.length();
            if (length > maxLength) {
                maxLength = length;
                longestName = name;
            }

            // Add birthyear to total and increment count
            totalBirthYears += birthyear;
            count++;

        }

        // Calculate average birth year
        int avgBirthyear;
        if (count > 0) {
            avgBirthyear = totalBirthYears / count;
        } else {
            avgBirthyear = 0;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avgBirthyear);
    }
}
