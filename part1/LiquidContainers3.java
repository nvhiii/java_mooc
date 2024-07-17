// Let's redo the previous program for handling two liquid containers. This time we'll create a class Container, which is responsible for managing the contents of a container.

// p1: Container
// Make a class called Container. The class must have a constructor which does not take any parameters, and the following methods:

// public int contains() which returns the amount of liquid in a container as an integer.
// public void add(int amount) which adds the amount of liquid given as a parameter to the container. If the amount is negative, no liquid is added.

// A container can hold maximum of 100 units of liquid.

// public void remove(int amount) which removes the amount of liquid given as a parameter from the container. If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
// public String toString() which returns the container as a string formatted "amount of liquid/100", for example "32/100".
// The class should work as follows:

import java.util.Scanner;

public class LiquidContainers3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container2 c1 = new Container2();
        Container2 c2 = new Container2();

        while (true) {
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);

            String input = scan.nextLine();
            if (input.equals("quit")) { // if only 1 strict val
                break;
            }

            // handle valid input
            // split the command
            String[] vals = input.split(" ");
            String command = vals[0]; // this is the command eng word
            int value = Integer.valueOf(vals[1]);

            if (command.equals("remove")) {
                c2.remove(value);
            } else if (command.equals("add")) {
                c1.add(value);
            } else if (command.equals("move")) {
                if (value >= c1.contains()) {
                    c2.add(c1.contains());
                } else {
                    c2.add(value);
                }
                c1.remove(value); // this removes the value 
            }
            
        }
    }

}
