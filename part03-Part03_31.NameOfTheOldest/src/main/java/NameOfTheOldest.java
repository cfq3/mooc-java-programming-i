
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0; // Variable to store the age from the input
        String name = ""; // Variable to store the name from the input
        String oldestName = "";  // Variable to store the name of the oldest person
        int oldest = 0; // Variable to store the age of the oldest person

        while (true) {
            String input = scanner.nextLine(); // Read line of input
            if (input.equals("")) { // input is an empty string, break
                break;
            }

            String[] data = input.split(","); // Split the input string by commas into an array
            age = Integer.valueOf(data[1]); // Convert the second element (age) from String to int
            name = data[0]; // Get the first element (name) from thr array
            if (age > oldest) { // Check if the current age is greater than the oldest age
                oldest =  age; // Update the oldest age
                oldestName = name; // Update the name of the oldest person
            }
        }
        System.out.println("Name of the oldest: " + oldestName); // Print the name of the oldest person
    }
}