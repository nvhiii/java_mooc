// Write a program that asks the user for a string, and then 
// prints the contents of a file with a name matching the string 
// provided. You may assume that the user provides a file name 
// that the program can find.

// The exercise template contains the files "data.txt" and "song.txt", 
// which you may use when testing the functionality of your program. 
// The output of the program can be seen below for when a user has 
// entered the string "song.txt". The content that is printed comes 
// from the file "song.txt". Naturally, the program should also work 
// with other filenames, assuming the file can be found.

import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {

        // user input scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed? ");
        String filePath = scanner.nextLine();

        // try catch file read
        try (Scanner fileReader = new Scanner(Paths.get(filePath))) {

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();
                System.out.println(line);

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}