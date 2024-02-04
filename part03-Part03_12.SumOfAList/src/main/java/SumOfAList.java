
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // perform the calculation of the sum of the numbers in the list here

        // Initialize sum outside of loop
        int sum = 0;
        
        // iterate through each element of the ArrayList 'list'
        for (Integer input: list) {
            sum += input; // add current element 'input' to 'sum' variable
        } 
        
        // print the sum of numbers stored in the ArrayList
        System.out.println("Sum: " + sum);
    }
}
