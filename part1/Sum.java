// Create the method public static int sum(ArrayList<Integer> numbers)
//  in the exercise template. The method is to return the sum of 
// the numbers in the parameter list. 

import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }

    public static int sum(ArrayList<Integer> numbers) {

        int sum = 0;

        for (int num : numbers) {

            sum += num;

        }

        return sum;

    }

}
