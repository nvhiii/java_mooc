

import java.util.Scanner;

public class Message {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a message, any message.");
        String message = scanner.nextLine();

        System.out.println("Is this your message? " + message);

    }
    
}
