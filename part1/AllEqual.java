// Write a program AllEqual.java that takes three integer 
// command-line arguments and prints equal if all three are 
// equal, and not equal otherwise.

public class AllEqual {

    public static void main(String[] args) {

        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        if (num0 == num1 && num1 == num2) {

            System.out.println("equal");

        }

    }

}