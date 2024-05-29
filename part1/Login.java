// Write a program that recognizes the following users:
// user: alex, pwd: sunshine
// user: emma, pwd: haskell
// The program either shows a personal message or informs
// of an incorrect username or password.

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompts
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("alex") && password.equals("sunshine")) {

            System.out.println("You have successfully logged in!");

        } else if (username.equals("emma") && password.equals("haskell")) {

            System.out.println("You have successfully logged in!");

        } else {

            System.out.println("Incorrect username or password!");

        }
    }
}
