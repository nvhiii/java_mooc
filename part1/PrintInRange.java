// Create the method 
// public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) 
// in the exercise template. The method prints the numbers in the 
// given list whose values are in the range [lowerLimit, upperLimit]. 
// A few examples of using the method are supplied below.

import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

        for (int num : numbers) {

            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }

        }

    }
    
}
