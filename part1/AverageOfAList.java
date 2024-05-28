// The exercise template contains a base that reads numbers 
// from the user and adds them to a list. Reading is stopped 
// once the user enters the number -1.

// When reading ends, calculate the average of the numbers 
// in it, and then print that value.

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> nums = new ArrayList<>();
        int sum = 0;

        while (true) {

            int num = Integer.valueOf(scanner.nextLine());

            // break cond
            if (num == -1) {
                break;
            }

            // handle valid input
            nums.add(num);
            sum += num;

        }

        System.out.println("Average: " + ((1.00 * sum)/(nums.size())));
        
    }
}
