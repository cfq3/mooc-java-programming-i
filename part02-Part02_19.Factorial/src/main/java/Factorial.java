
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // get number from user
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextInt());

         // initialize factorial variable (start at 1)
         // start i at fact; i ends at num
        int fact = 1;
        for (int i = fact; i <= num; i++) {
            fact = fact * i;
        }

        // print out factorial
        System.out.println("Factorial: " + fact);
    }
}
