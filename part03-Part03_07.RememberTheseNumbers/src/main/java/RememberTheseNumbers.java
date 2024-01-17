
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }
        // Print the numbers received from the user (excluding -1)
        // iterate through the indices of the 'numbers'
        // retrieve each element and loop continues until the end of ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            System.out.println(num);
        }
    }
}
