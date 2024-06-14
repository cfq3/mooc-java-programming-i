
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Get user's first name 
            System.out.println("First name: ");
            String userFirstName = scanner.nextLine();

            // If user input's nothing, break loop
            if(userFirstName.isEmpty()) {
                break;
            }

            // Get user's last name
            System.out.println("Last name: ");
            String userLastName = scanner.nextLine();

            // Get id number
            System.out.println("Identification number: ");
            String idNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(userFirstName, userLastName,idNumber));
        }

        for (PersonalInformation e : infoCollection) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }
    }
}
