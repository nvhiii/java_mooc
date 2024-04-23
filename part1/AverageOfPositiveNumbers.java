// Write a program that asks the user for 
// input until the user inputs 0. After 
// this, the program prints the average of 
// the positive numbers (numbers that are greater than zero).

// If no positive number is inputted, the program 
// prints "Cannot calculate the average"

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;
        int sum = 0;

        while (true) {

            // prompts
            int num = Integer.valueOf(scanner.nextLine());

            // break conds
            if (num == 0) {

                break;

            }

            if (num > 0) {

                sum += num;
                numOfNums++;

            }

        }

        double avg = (1.0 * sum) / numOfNums;

        if (numOfNums == 0) {

            System.out.println("Cannot calculate the average");

        } else {

            System.out.println(avg);

        }

        scanner.close();

    }

}