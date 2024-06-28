
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();  
        System.out.println("Team: ");
        String teamName = scan.nextLine().toLowerCase();  

        int gameCounter = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] splitString = line.split(",");

                String homeTeam = splitString[0].trim();
                String awayTeam = splitString[1].trim();
                int homePoints;
                int awayPoints;

                try {
                    homePoints = Integer.parseInt(splitString[2].trim());
                    awayPoints = Integer.parseInt(splitString[3].trim());
                } catch (NumberFormatException e) {
                    continue;  
                }

                if (teamName.equals(homeTeam.toLowerCase())) {  
                    gameCounter++;
                    if (homePoints > awayPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (teamName.equals(awayTeam.toLowerCase())) {
                    gameCounter++;
                    if (awayPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + gameCounter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}