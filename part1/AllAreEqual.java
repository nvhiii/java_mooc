// Write a program AllEqual.java that takes three integer 
// command-line arguments and prints equal if all three are 
// equal, and not equal otherwise.

public class AllAreEqual {

    public static void main(String[] args) {

        int intOne = Integer.parseInt(args[0]);
        int intTwo = Integer.parseInt(args[1]);
        int intThree = Integer.parseInt(args[2]);

        if (intOne == intTwo && intTwo == intThree) {

            System.out.println("Equal");

        } else {

            System.out.println("Not equal");

        }

    }

}