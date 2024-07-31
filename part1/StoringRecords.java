// In this exercise, we'll be working with files stored in CSV 
// format, which contain names and ages separated by commas. The 
// file format may look like this:

// The exercise template already has a Person class, and the class 
// StoringRecords has a body for the method 
// public static ArrayList<Person> readRecordsFromFile(String file). 
// Implement the readRecordsFromFile method such that it reads the persons 
// from the file passed as a parameter, and finally returns them in the list 
// returned by the method.

// The exercise template has a main method that you can use to test how 
// your program works. In this exercise, only modify the method 
// readRecordsFromFile.

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine();

                // split line
                String[] split = line.split(",");
                // partition
                String name = split[0];
                int age = Integer.valueOf(split[1]);

                persons.add(new Person3(name, age));

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return persons;

    }
}
