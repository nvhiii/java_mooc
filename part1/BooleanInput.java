import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {

        // initialize scanner var
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");

        // wrap the read line with a boolean conversion
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote " + trueOrFalse);

    }

}