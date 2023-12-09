
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        //sum
        int sum = first + second;

        //difference
        int difference = first - second;

        //product
        int product = first * second;

        //quotient
        double quotient = 1.0 * first / second; 

        //print sum 
        System.out.println(first + " " + "+" + " " + second + " " + "=" + " " + sum);

        //print differnce
        System.out.println(first + " " + "-" + " " + second + " " + "=" + " " + difference);

        //print product
        System.out.println(first + " " + "*" + " " + second + " " + "=" + " " + product);

        //print quotient
        System.out.println(first + " " + "/" + " " + second + " " + "=" + " " + quotient);
    }
}
