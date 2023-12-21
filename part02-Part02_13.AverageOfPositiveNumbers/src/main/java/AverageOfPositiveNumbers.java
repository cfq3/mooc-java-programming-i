
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize variable for sum, count, average
        int count = 0;
        double sum = 0;
        double average = 0;

        while (true) {
            // for getting user input
            int number = Integer.valueOf(scanner.nextInt());

            // exit if input is '0'
            if (number == 0) {
                break;
            }

            // if no positive numbner
            if (number < 0) {
                System.out.println("Cannot calculate the average");
                continue;
            }        

            // increase counter for postive numbers only
            count = count + 1;
            
            // caculate sum for postive numbers only
            sum = number + sum;
        }
        // check if there are postitive numbers before calculating and printing out average
        if (count > 0) {
            average = (sum / count) * 1.0;
            System.out.println(average);
        } else {
            System.out.println("Cannot caclulate the average");
        }
    }
}
