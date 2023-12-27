

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne(int number) {
        // start at number, end at 1, i--
        for (int i = number; i >= 1; i--){
            System.out.println(i);
        }
    }
}
