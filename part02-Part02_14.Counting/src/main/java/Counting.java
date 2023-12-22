
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextInt());
        number = number + 1;
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }
}