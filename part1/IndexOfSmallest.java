// Write a program that reads numbers from the user. When 
// number 9999 is entered, the reading process stops. After this 
// the program will print the smallest number in the list, and also 
// the indices where that number is found. Notice: the smallest 
// number can appear multiple times in the list.

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = 0;
        int smallestIDX = 0;

        ArrayList<Integer> intAL = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {

            int num = Integer.valueOf(scanner.nextLine());

            if (num == 9999) {
                break;
            }

            // handle valid input
            intAL.add(num);

        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        for (int i = 0; i < intAL.size(); i++) {

            if (i == 0) {
                smallest = intAL.get(i);
                smallestIDX = i;
            } else if (intAL.get(i) < smallest) {
                smallest = intAL.get(i);
                smallestIDX = i;
            }

        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + smallestIDX);

        
    }
}
