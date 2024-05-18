
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int index = 0; // initialize counter
        while (index < array.length) { // loop through until end of array
            int number = array[index]; // get current element from the array
            System.out.print(number); // print current element
            if (index < array.length - 1) { // check if the current element is not the last element
                System.out.print(", "); // print comma and space after the current element
            }
            index = index + 1; // increment counter
        }
    }
}
