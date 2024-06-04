// In this exercise, we'll be working with files stored in CSV format. 
// Each line of the file contains the home team, visiting team, home team 
// points, and visiting team points, all separated by commas.

// You can see an example below of the file's contents. The file shown 
// below is also included in the exercise template with the name "data.csv".

// Write a program that prompts the user for a filename, after which it reads 
// the match statistics from the file. The program then prompts the user 
// for the name of a team, and prints the data specified in the following 
// parts for that team.

// Games Played
// Implement the ability to output the number of games played by any 
// given team. We're using the above-mentioned data.csv file.

// Extend the program so that it has the ability to print the number
// of wins and losses of a given team. The winner of a game is the team 
// that has gained more points from it.

// You may assume that the games cannot be tied. Below, we're using the 
// above-mentioned data.csv file.

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = 0;
        int wins = 0;

        // file name input
        System.out.println("File: ");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();

        // read all match stats
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine();
                // split
                String[] split = line.split(",");
                String home = split[0];
                String away = split[1];
                int homePoints = Integer.valueOf(split[2]);
                int awayPoints = Integer.valueOf(split[3]);

                if (home.equals(team) || away.equals(team)) {

                    if (homePoints > awayPoints && home.equals(team)) {
                        wins++;
                    } else if (awayPoints > homePoints && away.equals(team)) {
                        wins++;
                    }

                    games++;

                }


            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (games-wins));


    }

}
