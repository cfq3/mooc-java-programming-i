
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        int isFound = 0;
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                if(searchedFor.equals(fileScanner.nextLine())) {
                    System.out.println("Found!");
                    isFound = 1;
                    break;
                }
            }
            if (isFound == 0) {
                System.out.println("Not found.");
            }
        } catch(Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
