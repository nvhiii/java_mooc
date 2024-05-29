// Write a program that reads strings from the user. If the 
// input is empty, the program stops reading input and halts. 
// For each non-empty input it splits the string input by whitespaces 
// and prints each part of the string on a new line.

import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String userString = scanner.nextLine();

            if (userString.equals("")) {
                break;
            }

            String[] split = userString.split(" ");
            for (String word : split) {
                System.out.println(word);
            }

        }

    }
}
