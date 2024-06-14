// // In this exercise we are going to create a program that can 
// be used to create and modify a to-do list. The final product will 
// work in the following manner.

// We will build the program in parts.

// TodoList
// Create a class called TodoList. It should have a constructor without 
// parameters and the following methods:

// public void add(String task) - add the task passed as a parameter to the 
// todo list.
// public void print() - prints the exercises. Each task has a number 
// associated with it on the print statement — use the task's index here (+1).
// public void remove(int number) - removes the task associated with 
// the given number; the number is the one seen associated with the 
// task in the print.

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todo;

    public TodoList() {
        this.todo = new ArrayList<>();
    }

    public void add(String task) {
        todo.add(task);
    }

    public void print() {
        int i = 1;
        for (String task: this.todo) {
            System.out.println(i + ": " + task);
            i += 1;
        }
    }

    // since remove removes at index
    public void remove(int number) {

        this.todo.remove(number-1);

    }

}