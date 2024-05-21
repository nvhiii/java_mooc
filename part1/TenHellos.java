// Rewrite TenHellos.java to make a program Hellos.java that 
// takes the number of lines to print as a command-line 
// argument. You may assume that the argument is less than 
// 1000. Hint: consider using i % 10 and i % 100 to determine 
// whether to use "st", "nd", "rd", or "th" for printing the ith Hello.

public class TenHellos {

    public static void main(String[] args) {

        int numOfLines = Integer.parseInt(args[0]);

        // definite iteration for-loop
        for (int i = 1; i <= numOfLines; i++) {

            if (i >= 11 && i <= 20) {

                System.out.println(i + "th");

            } else if (i % 10 == 1) {

                System.out.println(i+"st");

            } else if (i % 10 == 2) {

                System.out.println(i + "nd");

            } else if (i % 10 == 3) {

                System.out.println(i + "rd");

            } else {

                System.out.println(i + "th");

            }

        }

    }

}