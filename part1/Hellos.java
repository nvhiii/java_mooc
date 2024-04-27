// Rewrite TenHellos.java to make a program Hellos.java that 
// takes the number of lines to print as a command-line argument. 
// You may assume that the argument is less than 1000. 
// Hint: consider using i % 10 and i % 100 to determine whether 
// to use "st", "nd", "rd", or "th" for printing the ith Hello.

public class Hellos {

    public static void main(String[] args) {

        int numLines = Integer.parseInt(args[0]);
        for (int i = 1; i <= numLines; i++) {

            // this accounts for the 11-20th spots between each 100
            if (i % 100 >= 11 && i % 100 <= 20) {

                System.out.println(i+"th Hello");

            } else if (i % 10 == 1) {

                System.out.println(i+"st Hello");

            } else if (i % 10 == 2) {

                System.out.println(i+"nd Hello");

            } else if (i % 10 == 3) {

                System.out.println(i +"rd Hello");

            } else {

                System.out.println(i + "th Hello");

            }
        }

    }

}