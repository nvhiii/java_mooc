// Write a program that reads user input until an empty line is entered. 
// For each non-empty line the program splits the string by spaces   
// and prints the last part of the string.

import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String userInput = scanner.nextLine();

            if (userInput.equals("")) {
                break;
            }

            String[] pieces = userInput.split(" ");
            System.out.println(pieces[pieces.length-1]);

        }


    }
}
