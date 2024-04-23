// Write a program that reads values from the
// user until they input a 0. After this, the 
// program prints the total number of inputted 
// values. The zero that's used to exit the loop
// should not be included in the total number count.

import java.util.Scanner;

public class NumberOfNumbers {

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

            iterator++;

        }

        System.out.println("Number of numbers: " + iterator);

        scanner.close();

    }

}