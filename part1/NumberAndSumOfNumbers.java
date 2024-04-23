// Write a program that asks the user for 
// input until the user inputs 0. After this
//  the program prints the amount of numbers 
// inputted and the sum of the numbers. The number 
// zero does not need to be added to the sum, but 
// adding it does not change the results.

// You need two variables to keep track of the 
// information. Use one for keeping track of the 
// numbers inputted and other for keeping track of the sum

import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;
        int sum = 0;

        while (true) {

            // prompts
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {

                break;

            }

            sum += num;
            numOfNums++;

        }

        System.out.println("Number of numbers: " + numOfNums);
        System.out.println("Sum of the numbers: " + sum);
        scanner.close();

    }

}