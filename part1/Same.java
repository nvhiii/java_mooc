import java.util.Scanner;

public class Same {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt
        System.out.println("Enter the first string:");
        String input1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String input2 = scanner.nextLine();

        if (input1.equals(input2)) {

            System.out.println("Same");

        } else {

            System.out.println("Different");

        }

    }

}