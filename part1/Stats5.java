// Uniform random numbers. Write a program Stats5.java that 
// prints five uniform random values between 0 and 1, their average 
// value, and their minimum and maximum value. Use Math.random(), 
// Math.min(), and Math.max().

import java.util.ArrayList;

public class Stats5 {

    public static void main(String[] args) {

        ArrayList<Double> rand5 = new ArrayList<>();

        // make 5 diff rando nums between 0 and 1
        double min = 0;
        double max = 0;

        for (int i = 0; i < 5; i++) {

            double rand = Math.random();
            System.out.println(rand);
            rand5.add(rand);

            if (i == 0) {

                max = rand;
                min = rand;

            } else if (rand > max) {

                max = rand;

            } else {

                min = rand;

            }

        }

        System.out.println("Maximum of the 5 random nums from 0 to 1: " + max);
        System.out.println("Minimum of the 5 random nums from 0 to 1: " + min);

        
    }

}