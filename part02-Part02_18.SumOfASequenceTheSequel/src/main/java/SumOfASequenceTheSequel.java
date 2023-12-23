
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize sum
        int sum = 0;
        
        // get user input to use in loop
        System.out.println("First number?");
        int firstNum = Integer.valueOf(scanner.nextInt());
        System.out.println("Last number?");
        int lastNum = Integer.valueOf(scanner.nextInt());

        // loop starts at firstNum, ends at lastNum and adds all numbers starting from firstNum -> lastNum
        int i = firstNum;
        while (i <= lastNum) {
            sum = sum + i;
            i++;
        }
        // print out sum
        System.out.println("The sum is: " + sum);
    }
}
