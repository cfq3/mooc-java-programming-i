
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0; // Initialize max age to 0
        String input = scanner.nextLine();

        while (!(input.equals(""))) {
            String[] part = input.split(","); // Split the input string into an array of strings and use comma as delimiter
            if (maxAge < Integer.valueOf(part[1])) { // if the current age is greater than 'maxAge'
                maxAge = Integer.valueOf(part[1]);  // update maxAge if the current age is greater
            }
            input = scanner.nextLine(); // read the next line of input
        } 
        System.out.println("Age of the oldest: " + maxAge); // print the age of the oldest person
    }
}

