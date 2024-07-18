// p2: ui

// User interface
// Next, implement a class called UserInterface. It should have a constructor with two parameters. The first parameter is an instance of the class TodoList, and the second is an instance of the class Scanner. In addition to the constructor, the class should have the method public void start() that is used to start the text user interface. The text UI works with an eternal looping statement (while-true), and it must offer the following commands to the user:

// The command stop stops the execution of the loop, after which the execution of the program advances out of the start method.

// The command add asks the user for the next task to be added. Once the user enters this task, it should be added to the to-do list.

// The commmand list prints all the tasks on the to-do list.

// The command remove asks the user to enter the id of the task to be removed. When this has been entered, the specified task should be removed from the list of tasks.

// Below is an example of how the program should work.

import java.util.Scanner;

public class UserInterface2 {

    private TodoList list;
    private Scanner scanner;

    public UserInterface2(TodoList list, Scanner scanner) {

        this.list = list;
        this.scanner = scanner;

    }

    public void start() {


        while (true) {

            System.out.print("Command: ");
            String cmd = scanner.nextLine();

            // break
            if (cmd.equals("stop")) {
                break;
            }

            // valid
            if (cmd.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                list.add(task);
            } else if (cmd.equals("list")) {
                list.print();
            } else if (cmd.equals("remove")) {
                System.out.print("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                list.remove(index);
            }


        }

    }
    
}
