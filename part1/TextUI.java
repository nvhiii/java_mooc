// The exercise base contains a class SimpleDictionary that allows 
// for storing words and their translations. The internal implementation 
// of the class contains some techniques not (yet) covered on the course. 
// Nevertheless, it's fairly simple to use it:

// Starting and stopping the UI
// Implement the class TextUI that receives as constructor parameters a Scanner 
// and SimpleDictionary 
// objects. Then give the class a method called public void start(). The 
// method should work as follows:

// The method asks the user for a command
// If the command is end, the UI prints the string "Bye bye!" and the 
// execution of the start method ends.
// Otherwise the text UI prints the message Unknown command and asks 
// for a new command, so it loops back to step 1.

// Adding a translation
// Modify the method public void start() so that it works in the following way:

// The method asks the user for a command.
// If the command is end, the UI prints the string "Bye bye!" and the execution 
// of the start method ends.
// If the command is add, the text UI asks the user for a word and a translation, 
// each on its own line. After this the words are stored in the dictionary, and 
// the method continues by asking for a new command (loops back to stage 1).
// Otherwise the text UI prints the message Unknown command and asks for a 
// new command, so it loops back to step 1.

// Translating a word
// Modify the method public void start() so that it works in the following:

// The method asks the user for a command.
// If the command is end, the UI prints the string "Bye bye!" and the 
// execution of the start method ends.
// If the command is add, the text UI asks the user for a word and a translation, 
// each on its own line. After this the words are stored in the dictionary, 
// and the method continues by asking for a new command (loops back to stage 1).
// If the command is search, the text UI asks the user for the word to be 
// translated. After this it prints the translation of the word, and the 
// method continues by asking for a new command (loops back to stage 1).
// Otherwise the text UI prints the message Unknown command and asks for a 
// new command, so it loops back to step 1.

import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDict;

    public TextUI(Scanner scanner, SimpleDictionary simpleDict) {
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }

    public void start() {

        // loop for input
        while (true) {

            System.out.println("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {

                System.out.println("Bye bye!");
                break;

            } else if (command.equals("add")) {

                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                simpleDict.add(word, translation);

            } else if (command.equals("search")) {

                System.out.println("To be translated: ");
                String translate = scanner.nextLine();
                if (!(simpleDict.translate(translate) == null)) {
                    System.out.println("Translation: " + simpleDict.translate(translate));
                } else {
                    System.out.println("Word " + translate + " was not found.");
                }

                

            }

            System.out.println("Unknown command");

        }

    }



}