
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);
    }

    // takes beginning and end as parameters
    public static void divisibleByThreeInRange(int beginning, int end) {
        // for number i in range 'int beginning' to 'int end' print if divisible by 3
        // increases from value of 'int beginning' to value of 'int end'
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
