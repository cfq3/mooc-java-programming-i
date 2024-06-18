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
            int inputPages = Integer.parseInt(sc.nextLine());

            System.out.println("Publication Year: ");
            int inputPublicationYear = Integer.parseInt(sc.nextLine());

            books.add(new Book(inputTitle, inputPages, inputPublicationYear));
        }

        System.out.println("What information will be printed?");
        String infoToBePrinted = sc.nextLine();

        if (infoToBePrinted.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (infoToBePrinted.equals("name")) {
                for (Book book : books) {
                    System.out.println(book.getTitle());
            }
        }
    }
}
