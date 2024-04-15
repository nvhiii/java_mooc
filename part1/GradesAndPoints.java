import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt
        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scanner.nextLine());

        if (grade < 0) {
            System.out.println("impossible!");
        } else if (grade >= 0 && grade <= 49) {
            System.out.println("failed");
        } else if (grade >= 50 && grade <= 59) {
            System.out.println("1");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("2");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("3");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("4");
        } else if (grade >= 90 && grade <= 100){
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }

    }

}