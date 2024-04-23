// Write a program SpringSeason.java that takes two int values 
// m and d from the command line and prints true if day d of month
// m is between March 20 (m = 3, d =20) and June 20 (m = 6, d = 20),
// false otherwise.

public class SpringSeason {

    public static void main(String[] args) {

        // months
        int m = Integer.parseInt(args[0]);
        // days
        int d = Integer.parseInt(args[1]);

        // first find edge cases, in this case it is min and max dates

        if ((m == 3 && d >= 20) || (m == 6 && d <= 20) || (m > 3 && m < 6)) {

            System.out.println("Given date is between March 20 and June 20. - TRUE");

        } else {

            System.out.println("Given date is not between. - FALSE");

        }

    }

}