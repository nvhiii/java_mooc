// In this exercise you will design and implement a database for bird-watchers. 
// The database contains birds, each of which has a name (string) and a name in 
// Latin (string). The database also counts the observations of each bird.

// The program must implement the following commands:

// Add - adds a bird
// Observation - adds an observation
// All - prints all birds
// One - prints one bird
// Quit - ends the program
// Incorrect input must also be handled. The following is an example of 
// the program functionality:

import java.util.Scanner;

public class mainProgram3 {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();

        while (true) {

            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            // handle valid input
            if (command.equals("Add")) {

                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                db.add(new Bird(name, latinName, 0));

            } else if (command.equals("Observation")) {

                System.out.print("Bird? ");
                String animal = scan.nextLine();
                db.observeBird(animal);

            } else if (command.equals("All")) {

                db.printAll();

            } else if (command.equals("One")) {

                System.out.print("Bird? ");
                String name = scan.nextLine();
                db.printBird(name);

            }

        }

    }

}
