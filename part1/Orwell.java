import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt
        System.out.println("Give a number: ");
        int year = Integer.valueOf(scanner.nextLine());

        if (year == 1984) {

            System.out.println("Orwell");

        }

    }

}