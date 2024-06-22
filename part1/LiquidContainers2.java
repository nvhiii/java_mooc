// Functionality
// Copy the user interface you implemented for the previous example, and modify 
// it to use the new Container class. The main method in the class LiquidContainers2 
// must start the program.

// Below is some sample output. The user interface should work as follows:

import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        // initialize values for both containers as ints for liters
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = scan.nextLine();
            // break cond
            if (input.equals("quit")) {
                break;
            }

            // functionality to add to first cont
            String[] split = input.split(" ");
            int num = Integer.valueOf(split[1]);

            if (split[0].equals("add") && num >= 0) {

                firstContainer.add(num);

            }

            if (split[0].equals("move") && num >= 0 && firstContainer.contains() > 0) {

                if (num >= firstContainer.contains()) {

                    secondContainer.add(firstContainer.contains()); // doesn't add the num bc num exceeds firstcont val
                    firstContainer.remove(firstContainer.contains()); // remove all the contents of 1st container
                    
                } else {
                    
                    firstContainer.remove(num);
                    secondContainer.add(num);

                }

            }

            if (split[0].equals("remove") && num >= 0 && secondContainer.contains() > 0) {

                // makes sure second container cannot be negative
                secondContainer.remove(num);

            }

            System.out.println();

        }
    }
}
