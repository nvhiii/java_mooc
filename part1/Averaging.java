// Create a method called average that calculates the average of the 
// numbers passed as parameters. The previously created method sum
//  must be used inside this method!

public class Averaging {

    // implement the sum method here again
    public static int sum(int num1, int num2, int num3, int num4) {
        // write some code here
        return num1 + num2 + num3 + num4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        return 1.0 * sum(number1, number2, number3, number4) / 4;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
