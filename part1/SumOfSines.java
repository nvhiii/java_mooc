// Write a program SumOfSines.java that takes a double 
// command-line argument t (in degrees) and prints the 
// value of sin(2t) + sin(3t).

public class SumOfSines {

    public static void main(String[] args) {

        // A type-double command-line arg "t"
        double t = Double.parseDouble(args[0]); // parse method w/ wrapper class of Double

        // Since we get input as degrees, first need to convert for Math.sin method
        double converted = Math.toRadians(t);

        // value calculation

        double sum = Math.sin(2 * converted) + Math.sin(3 * converted);

        System.out.println(sum);

    }

}