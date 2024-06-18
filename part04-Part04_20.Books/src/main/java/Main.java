import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String inputTitle = sc.nextLine();
            if (inputTitle.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int inputPages = Integer.valueOf(sc.nextInt());

            System.out.println("Publication Year: ");
            int inputPublicationYear = Integer.valueOf(sc.nextInt());

            books.add(new Book(inputTitle, inputPages, inputPublicationYear));
        }

        System.out.println("What information will be printed?");

        String infoToBePrinted = sc.nextLine();

        if (infoToBePrinted.toLowerCase().equals("everything")) {
            for (Book element : books) {
                System.out.print(element);
            }
        }
            if (infoToBePrinted.toLowerCase().equals("name")) {
                for (Book element : books) {
                    System.out.println(element.getTitle());
                }
            } else {
                return;
            }
        }
    }
}
