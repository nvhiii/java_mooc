// Write a program, that reads a string from the user and then prints it three times.

import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt
        System.out.println("Give a word: ");
        String userString = scanner.nextLine();

        for (int i = 0; i < 3; i++) {

            System.out.print(userString);

        }

    }
}
