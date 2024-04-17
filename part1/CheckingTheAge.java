import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt
        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());

        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }

}