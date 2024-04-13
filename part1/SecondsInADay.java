/*
 * In the exercise template, implement a program that 
 * asks the user for the number of days. After that, 
 * the program prints the number of seconds in the given
 *  number of days.
 */
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt
        System.out.println("How many days would you like to convert to seconds?");
        // user input as int and nesting nextline input
        int days = Integer.valueOf(scanner.nextLine());

        // calculation
        int secondsInOneDay = 24 * (60 * 60);
        int seconds = days * secondsInOneDay;

        // print out seconds
        System.out.println(seconds);

    }

}