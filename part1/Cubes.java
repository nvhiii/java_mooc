// Write a program that reads strings from the user until the 
// user inputs the string "end". As long as the input is not "end", 
// the program should handle the input as an integer and print the cube 
// of the number provided (i.e., number _ number _ number). Below 
// are some sample outputs

import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String num = scanner.nextLine();

            if (num.equals("end")) {
                break;
            }

            int intNum = Integer.valueOf(num);

            System.out.println(Math.pow(intNum, 3));

        }

    }
}
