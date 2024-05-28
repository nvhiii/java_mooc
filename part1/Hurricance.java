// Write a program Hurricane.java that that takes the wind 
// speed (in miles per hour) as an integer command-line argument
// and prints whether it qualifies as a hurricane, and if so, 
// whether it is a Category 1, 2, 3, 4, or 5 hurricane. Below 
// is a table of the wind speeds according to the Saffir-Simpson scale.

public class Hurricance {

    public static void main(String[] args) {

        int windSpeed = Integer.valueOf(args[0]);
        boolean isHurricane = false;

        // in mph, not knots
        if (windSpeed >= 74 && windSpeed <= 95) {
            System.out.println("category 1");
        } else if (windSpeed >= 96 && windSpeed <= 110) {
            System.out.println("category 2");
        } else if (windSpeed >= 111 && windSpeed <= 130) {
            System.out.println("category 3");
        } else if (windSpeed >= 131 && windSpeed <= 155) {
            System.out.println("category 4");
        } else {
            System.out.println("category 5");
        }
    }

}