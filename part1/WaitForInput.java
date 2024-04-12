/*
 * When the program's execution comes a statement that 
 * attempts to read input from the user (the command reader.nextLine()), 
 * the execution stops and waits. The execution continues only after 
 * the user has written some input and pressed enter.

 * In the example below, the program prompts the user for three strings. 
 * First, the program prints Write the first string: , and 
 * then waits for user input. When the user writes some text, 
 * the program prints Write the second string: , and then waits 
 * for user input again. This continues for a third time, after 
 * which the program prints all three strings.
 */

import java.util.Scanner;

public class WaitForInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // first str
        System.out.println("Write the first string:");
        String firstMessage = scanner.nextLine();

        // second str
        System.out.println("Write the second string:");
        String secondMesage = scanner.nextLine();

        // third str
        System.out.println("Write the third string:");
        String thirdMessage = scanner.nextLine();

        // output
        System.out.println("You wrote: ");
        System.out.println(firstMessage);
        System.out.println(secondMesage);
        System.out.println(thirdMessage);

    }

}
