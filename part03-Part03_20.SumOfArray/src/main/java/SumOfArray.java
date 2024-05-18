
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int index = 0; // declare counter
        int sum = 0; // initialize sum
        while (index < array.length) { // loop continues as long as index is < array length
            int number = array[index]; // retrieves current element from array
            sum += number; // adds current element to sum
            index = index + 1; // increment index counter
        }
        return sum; // returns the sum
    }
}
