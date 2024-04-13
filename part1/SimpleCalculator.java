import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // first prompt
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());

        // second prompt
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " + (1.0 * firstNum / secondNum));

    }

}