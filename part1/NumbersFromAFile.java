// Write a program that prompts the user for a filename, as well as the 
// upper and lower bounds for the accepted range of numbers. Then the 
// program reads the numbers contained in the file (each number is on 
// its own line) and only accounts for the numbers which are inside the 
// given range. Finally, the program should print the number of numbers 
// that were inside the given range.

// You can convert a string-type integer read from a file into a proper 
// integer using the command Integer.valueOf (just as when handling input 
// from a user).

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inBounds = 0;

        // prompt filename
        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {

                int numLine = Integer.valueOf(fileScanner.nextLine());

                // logic to see if in bounds
                if (numLine >= lowerBound && numLine <= upperBound) {
                    inBounds++;
                }

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("Numbers: " + inBounds);

    }

}
