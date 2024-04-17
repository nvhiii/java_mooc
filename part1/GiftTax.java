import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");

        int val = Integer.valueOf(scanner.nextLine());
        

        if (val < 5000) {

            System.out.println("No tax!");

        } else if (val >= 5000 && val < 25000) {

            System.out.println(100 + (val-5000) * 0.08);

        } else if (val >= 25000 && val < 55000) {

            System.out.println(1700 + (val-25000) * 0.10);

        } else if (val >= 55000 && val < 200000) {
            
            System.out.println(4700 + (val-55000) * 0.12);

        } else if (val >= 200000 && val < 1000000) {

            
            System.out.println(22100 + (val-200000) * 0.15);

        } else {

            System.out.println(142100 + (val-1000000) * 0.17);

        }

    }

}