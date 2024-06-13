
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get user input
            System.out.println("Name: ");
            String itemName = scanner.nextLine();

            // Break while loop if empty
            if (itemName.isEmpty()) {
                break;
            }

            // Add to items list
            items.add(new Item(itemName));
        }
        for (Item item: items) {
            System.out.println(item);
        }
    }
}
