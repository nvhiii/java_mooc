import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Greeting
        System.out.println("Greetings! How are you doing?");
        // 1st reponse
        String firstResponse = scanner.nextLine();

        // Response
        System.out.println("Oh, how interesting. Tell me more!");
        // User response 2
        String secondResponse = scanner.nextLine();

        // Thanks
        System.out.println("Thanks for sharing!");

    }

}