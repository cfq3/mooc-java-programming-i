
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        // ask for a start and end indices
        System.out.println("From where?");
        int start = Integer.valueOf(scanner.nextInt());
        System.out.println("To where?");
        int end = Integer.valueOf(scanner.nextInt());

        // loop through numbers in the range (between the indices 'start' to 'end')
        for (int i = start; i <= end; i++) {
            int num = numbers.get(i);
            System.out.println(num);
        }
    }
}