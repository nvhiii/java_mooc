import java.util.Scanner;

public class DiffInputs {

    public static void main(String[] args) {

        // initialize scanner var
        Scanner scanner = new Scanner(System.in);

        // read in string, so no conversion needed
        System.out.println("Give a string:");
        String input = scanner.nextLine();

        // read in int, need conversion + nesting
        System.out.println("Give an integer:");
        int numInt = Integer.valueOf(scanner.nextLine());

        // read in double, need conversion + nesting
        System.out.println("Give a double:");
        double numDouble = Double.valueOf(scanner.nextLine());

        // read in boolean, need conversion + nesting
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scanner.nextLine());

        // print values
        System.out.println("You gave the string " + input);
        System.out.println("You gave the integer " + numInt);
        System.out.println("You gave the double " + numDouble);
        System.out.println("You gave the boolean " + bool);

    }

}