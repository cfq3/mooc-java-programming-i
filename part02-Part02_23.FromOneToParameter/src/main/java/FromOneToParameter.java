

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        // i used to count # of times the loop has been executed. value set to 1
        // loop condition i <= number
        // i++ (increase value of variable i = i + 1)
        for (int i = 1; i <= number; i++) {
            System.out.print(i);
        }
    }
}