// Write a program that reads values from the 
// user until they input a 0. After this, the program 
// prints the total number of inputted values that 
// are negative. The zero that's used to exit the 
// loop should not be included in the total number count.

import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int iterator = 0;

        while (true) {

            // prompt
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {

                break;

            }

            if (num < 0) {

                iterator++;

            }

        }

        System.out.println("Number of negative numbers: " + iterator);

    }

}