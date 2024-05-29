// Write a program that reads user input until an empty line. 
// For each non-empty string, the program splits the string 
// by spaces   and then prints the pieces that contain av, each 
// on a new line.

import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            // prompt
            String userString = scanner.nextLine();
            String[] splitString = userString.split(" ");

            if (userString.equals("")) {
                break;
            }

            for (String word : splitString) {

                if (word.contains("av")) {

                    System.out.println(word);

                }

            }

        }

    }
}
