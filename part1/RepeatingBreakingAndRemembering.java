// Implement a program that asks the user for numbers 
// (the program first prints "Write numbers: ") until the user gives 
// the number -1. When the user writes -1, the program prints "Thx! Bye!" 
// and ends.

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int runningSum = 0;
        int numCount = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {

            // prompt
            int num = Integer.valueOf(scanner.nextLine());

            // break cond
            if (num == -1) {
                break;
            }

            runningSum += num;
            numCount++;

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }


        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + runningSum);
        System.out.println("Numbers: " + numCount);
        System.out.println("Average: " + (double) runningSum/numCount);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);



    }

}

