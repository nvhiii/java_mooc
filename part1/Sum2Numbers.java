import java.util.Scanner;

public class Sum2Numbers {

    public static void main(String[] args) {

        // initialize scanner
        Scanner scanner = new Scanner(System.in);

        // first prompt
        System.out.println("Give the first number:");
        // read first value and nest inside conversion
        int firstNum = Integer.valueOf(scanner.nextLine());

        // second prompt
        System.out.println("Give the second number:");
        // read second value and nest inside conversion
        int secondNum = Integer.valueOf(scanner.nextLine());

        // calculation
        System.out.println("The sum of the numbers is " + (firstNum + secondNum));

    }

}