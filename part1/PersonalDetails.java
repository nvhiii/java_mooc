// Write a program that reads names and birth years from the user 
// until an empty line is entered. The name and birth year are 
// separated by a comma.

// After that the program prints the longest name and the average 
// of the birth years. If multiple names are equally longest,
// you can print any of them. You can assume that the user enters 
// at least one person.

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longest = "";

        while (true) {

            String nameYear = scanner.nextLine();

            if (nameYear.equals("")) {
                break;
            }

            // handle
            String[] split = nameYear.split(",");

            // find longest name
            if (split[0].length() > longest.length()) {

                longest = split[0];

            }

            // convert years
            int year = Integer.valueOf(split[1]);
            sum += year;
            count++;

        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
