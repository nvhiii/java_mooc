// Write a program Distance.java that takes two integer 
//command-line arguments x and y and prints the Euclidean 
// distance from the point (x, y) to the origin (0, 0).

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        // distance formula: d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        Scanner scanner = new Scanner(System.in);

        // prompt(s)
        System.out.println("Enter the x-coordinate");
        int xCoord = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the y-coordinate");
        int yCoord = Integer.valueOf(scanner.nextLine());

        // in relation to origin distance formula
        double distance = Math.sqrt(1.0 * ((xCoord - 0) * (xCoord - 0)) + ((yCoord - 0) * (yCoord - 0)));
        System.out.println("The Euclidean distance from the point (" + xCoord + ", " + yCoord + ") to the origin (0,0) is " + distance);

    }

}