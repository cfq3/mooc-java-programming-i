
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean isFound = false;

        // create scanner for reading the file
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                if(searchedFor.equals(row)) {
                    isFound = true;
                    break;
                }
            }
            if(isFound) {
                System.out.println("Found!");
            } else {
                System.out.println("Not Found.");
            }

        } catch(Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
