// Write a program that reads two integers from the user.
// If the first number is greater than the second, the
// program prints "(first) is greater than (second)." 
// If the first number is less than the second, the 
// program prints "(first) is smaller than (second)." 
// Otherwise, the program prints "(first) is equal to 
// (second)." The (first) and (second) should always be 
// replaced with the actual numbers that were provided 
// by the user.

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt
        int firstNum = Integer.valueOf(scanner.nextLine());
        int secondNum = Integer.valueOf(scanner.nextLine());

        if (firstNum > secondNum) {

            System.out.println(firstNum + " is greater than " + secondNum + ".");

        } else if (firstNum < secondNum) {

            System.out.println(firstNum + " is smaller than " + secondNum + ".");

        } else {

            System.out.println(firstNum + " is equal to " + secondNum + ".");

        }

        scanner.close();


    }

}