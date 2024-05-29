// Write a program that reads user input until an empty 
// line is entered. For each non-empty line the program splits 
// the string by spaces   and prints the first part of the string.

import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();
            String[] pieces = input.split(" ");

            if (input.equals("")) {
                    break;
            }

            System.out.println(pieces[0]);

        }


    }
}
