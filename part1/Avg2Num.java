import java.util.Scanner;

public class Avg2Num {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt 1
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());

        // prompt 2
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());

        double quotient = 1.0 * (firstNum + secondNum) / 2;

        System.out.println("The average is " + quotient);

    }

}