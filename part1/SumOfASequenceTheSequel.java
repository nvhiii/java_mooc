// Implement a program which calculates the sum of a closed 
// interval, and prints it. Expect the user to write the 
// smaller number first and then the larger number.

import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt input
        System.out.println("First number? ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());

        int runningSum = 0;
        for (int i = first; i <= last; i++) {

            runningSum += i;

        }

        System.out.println("The sum is " + runningSum);
        scanner.close();

    }

}