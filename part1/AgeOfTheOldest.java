// Write a program that reads names and ages from the user 
// until an empty line is entered. The name and age are separated 
// by a comma.

// After reading all user input, the program prints the age 
// of the oldest person. You can assume that the user enters at 
// least one person, and that one of the users is older than the others.

import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {

            String nameAge = scanner.nextLine();

            if (nameAge.equals("")) {
                break;
            }

            String[] split = nameAge.split(",");
            // age convert
            int age = Integer.valueOf(split[1]);

            if (age > oldest) {
                oldest = age;
            }

        }

        System.out.println("Age of the oldest: " + oldest);


    }
}
