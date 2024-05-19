
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int index = 0; // initialize counter
        while (index < array.length) { // through through until the end of the array
            int number = array[index]; // get element from array
            for (int i = 0; i < number; i++) { // loop to print number of stars equal to current element
                System.out.print("*"); // print star
            }
            System.out.println(); // move to next line after printing stars for the current element
            index = index + 1; // increment counter
        }
    }
}
