import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());

        if (firstNum > secondNum) {

            System.out.println("Greater number is: " + firstNum);

        } else if (secondNum > firstNum) {

            System.out.println("Greater number is: " + secondNum);

        } else {

            System.out.println("The numbers are equal!");

        }

    }

}