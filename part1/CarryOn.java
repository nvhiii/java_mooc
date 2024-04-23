// Write a program by using the loop example that
// asks "Shall we carry on?" until the user inputs
// the string "no".

import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            // prompts
            System.out.println("Shall we carry on?");
            String response = scanner.nextLine();

            if (response.equals("no")) {

                break;

            }

        }

        scanner.close();

    }

}