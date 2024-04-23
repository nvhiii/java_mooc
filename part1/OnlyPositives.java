// Write a program that asks the user for numbers.
// If the number is negative (smaller than zero), 
// the program prints for user "Unsuitable number" 
// and asks the user for a new number. If the number 
// is zero, the program exits the loop. If the 
// number is positive, the program prints the number 
// to the power of two.

import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            // prompts
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {

                break;

            }

            if (num < 0) {

                System.out.println("Unsuitable number");
                continue;

            }

            int squared = num * num;
            System.out.println(squared);

        }

    }

}