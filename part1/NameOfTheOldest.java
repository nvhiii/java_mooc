// Write a program that reads names and ages from the user 
// until an empty line is entered. The name and age are separed 
// by a comma.

// After reading all user input, the program prints the name of 
// the oldest person. You can assume that the user enters at least 
// one person, and the that one of the users is older than the others.

import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";

        while (true) {

            String nameAge = scanner.nextLine();

            if (nameAge.equals("")) {
                break;
            }

            String[] split = nameAge.split(",");
            // convert age to int
            int age = Integer.valueOf(split[1]);

            if (age > oldest) {

                oldest = age;
                oldestName = split[0];

            }

        }

        System.out.println("Name of oldest: " + oldestName);


    }
}
