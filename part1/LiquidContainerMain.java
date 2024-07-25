// Let's create an interactive program to control two liquid containers. The containers are named "first" and "second". Each are capable of containing 100 liters of liquid at a time.

// The program offers the functionality to add, move and remove liquid. Using the "add" command will add liquid to the first container, "move" will move liquid from the first container to the second container and "remove" will remove liquid from the second container.

// The commands must be defined as following:

// add amount adds the amount of liquid specified by the parameter to the first container. The inserted amount must be specified as an integer. The container can't hold more than a hundred liters and everything added past that will go to waste.

// move amount moves the amount of liquid specified by the parameter from the first container to the second container. The given amount must be specified as an integer. If the program is requested to move more liquid than than the first container currently holds, move all the remaining liquid. The second container can't hold more than one hundred liters of liquid and everything past that will go to waste.

// remove amount removes the amount of liquid specified by the parameter from the second container. If the program is requested to remove more liquid than the container currently holds, remove all the remaining liquid.

// After every command the program will print the contents of both containers. You don't have to take negative values into consideration.

// All the functionality must be added to the method main in the class LiquidContainers (do not create new methods). The template already contains a loop which exits the program with the command "quit".

// A reminder of how to split a string below.

// part 1: adding

// Implement the functionality to add liquid to the first container. The user interface should work as follows:

// part 2: moving

// Moving
// Implement the functionality to move liquid from the first container to the second. The user interface should work as follows:

// part 3: removing
// Removing
// Implement the functionality to remove liquid from the second container. The user interface should work as follows:

import java.util.Scanner;

public class LiquidContainerMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            // split input since it has whitespace, between cmd and the val for int
            String[] split = input.split(" ");
            String command = split[0];
            int value = Integer.valueOf(split[1]);

            if (command.equals("add")) {
                
                if (value >= 0) { // negative check

                    if (firstContainer + value >= 100) {
                        firstContainer = 100;
                    } else {
                        firstContainer += value;
                    }

                }

            } else if (command.equals("move")) {

                // negative move val check
                if (value >= 0) {

                    // now compare value vs. first container
                    if (value >= firstContainer) {
                        
                        if (secondContainer + firstContainer >= 100) {
                            secondContainer = 100;
                        } else {
                            secondContainer += firstContainer;
                        }

                        firstContainer = 0;


                    } else if (value < firstContainer) {

                        // logic to "move" to 2nd container
                        firstContainer -= value;
                        if (secondContainer + value >= 100) {
                            secondContainer = 100;
                        } else {
                            secondContainer += value;
                        }

                    }

                }
            } else if (command.equals("remove")) {

                // negative check
                if (value >= 0) {

                    // compare val vs second container (if greater, do nothing)
                    if (value <= secondContainer) {

                        secondContainer -= value;

                    } 

                }

            }

        }
    }

}
