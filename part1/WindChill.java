// Wind chill. Given the temperature t (in Fahrenheit) and 
//the wind speed v (in miles per hour), the National Weather 
// Service defines the wind chill to be:

// w = 35.74 + 0.6215 t + (0.4275 t - 35.75) (v^0.16)

// Write a program WindChill.java that takes two double 
//command-line arguments t and v and prints the wind chill. 
//Use Math.pow(a, b) to compute a^b. Note: the formula is not
// valid if t is larger than 50 in absolute value or if v is 
// larger than 120 or less than 3 (you may assume that the values you 
// get are in that range).

public class WindChill {

    public static void main(String[] args) {

        // temperature
        double t = Double.parseDouble(args[0]);
        // wind speed
        double v = Double.parseDouble(args[1]);

        if (-t > 50 || t > 50) {

            System.out.println("Formula invalid with the given temp.");

        } else if (v > 120 || v < 3) {

            System.out.println("Formula invalid with those wind speeds.");

        } else {

            // wind chill
            double w = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * (Math.pow(v, 0.16)));
            System.out.println("The wind chill is: " + w);

        }

    }

}

