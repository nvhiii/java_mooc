// The exercise contains a base that asks the user for strings 
// and adds them to a list. The program stops reading when the 
// user enters an empty string. The program then prints the first
// element of the list.

// Your assignment is to modify the program so that instead of 
// the first value, the third value on the list is printed. Remember 
// that programmers start counting from zero! The program is allowed 
// to malfunction if there are fewer than three entries on the list, 
// so you don't need to prepare for such an event at all.

import java.util.Scanner;
import java.util.ArrayList;

public class ThirdElement {

    public static void main(String[] args) {

        // scanner
        Scanner scanner = new Scanner(System.in);
        // array list declaration
        ArrayList<String> stringAL = new ArrayList<>();

        while (true) {

            String userInput = scanner.nextLine();

            // break cond
            if (userInput.equals("")) {
                break;
            }

            // handle valid input
            stringAL.add(userInput);

        }

        // print out third element of list, don't need to worry abt size for
        // this exercise
        System.out.println(stringAL.get(2));

    }

}