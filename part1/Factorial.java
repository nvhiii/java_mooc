// Implement a program which calculates the factorial of a number given by the user.

// Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. 
// For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. 
// Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int product = 1;

        // prompts
        System.out.println("Give a number: ");
        int factorial = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= factorial; i++) {

            product *= i;

        }

        System.out.println("Factorial: " + product);

    }

}