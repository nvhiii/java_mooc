import java.util.Scanner;

public class Sum3Numbers {

    public static void main(String[] args) {

        // initialize scanner var
        Scanner scanner = new Scanner(System.in);

        // first prompt
        System.out.println("Give the first number:");
        // initialize next line as an int
        int firstNum = Integer.valueOf(scanner.nextLine());

        // second prompt
        System.out.println("Give the second number:");
        // initialize next line as an int
        int secondNum = Integer.valueOf(scanner.nextLine());

        // third prompt
        System.out.println("Give the third number:");
        // initialize next line as an int
        int thirdNum = Integer.valueOf(scanner.nextLine());

        // sum of all nums
        System.out.println("The sum of the numbers is " + (firstNum + secondNum + thirdNum));


    }

}