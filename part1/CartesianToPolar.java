// Polar coordinates. Write a program CartesianToPolar.java 
// that converts from Cartesian to polar coordinates. 
// Your program should take two real numbers x and y on 
// the command line and print the polar coordinates r 
// and θ. Use the Java method Math.atan2(y, x), which computes 
// the arctangent value of y/x that is in the range from -π to π.

import java.lang.Math;

public class CartesianToPolar {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // radial x-coord calculation (r)
        double radX = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // theta calculation using Math.atan2(y, x)
        double radY = Math.atan2(y, x);

        System.out.println("The polar coordinates for your cartesian coords are: " + radX + " and " + radY);

    }

}