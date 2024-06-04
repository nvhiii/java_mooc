// In this exercise, we'll be working with files stored in CSV-format 
// that contain names and ages separated by commas. The file format may 
// look like this:

// Your task is to write a program that first prompts the user for the name 
// of the file they want to read. The program then prints the content of 
// the file in the following way (we're assuming below that the output is 
// from the above-mentioned file):

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read file name
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {

                String csvLine = fileScanner.nextLine();

                // split line
                String[] split = csvLine.split(",");
                String name = split[0];
                int age = Integer.valueOf(split[1]);

                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }


    }
}
