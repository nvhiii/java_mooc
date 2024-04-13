import java.util.Scanner;

public class Avg3Num {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // first prompt
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());

        // second prompt
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // third prompt
        System.out.println("Give the second number:");
        int thirdNumber = Integer.valueOf(scanner.nextLine());

        double avg = 1.0 * (firstNum + secondNumber + thirdNumber) / 3;

        System.out.println("The average is " + avg);

    }

}