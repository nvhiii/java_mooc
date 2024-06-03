// Write a program that reads strings from the user until the user 
// inputs the string "end". At that point, the program should 
// print how many strings have been read. The string "end" 
// should not be included in the number strings read. You can find 
// some examples below of how the program works.

import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strCount = 0;

        while (true) {

            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            strCount++;

        }

        System.out.println(strCount);

    }
}
