// The exercise template contains a base that reads numbers from 
// the user and adds them to a list. Reading is stopped once the 
// user enters the number -1.

// Continue developing the program so that it finds the 
// greatest number in the list and prints its value after 
// reading all the numbers. The programming should work in the following manner.

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        int max = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > max) {

                max = list.get(i);

            }

        }

        System.out.println("The greatest number: " + max);

        // implement finding the greatest number in the list here
    }
}
