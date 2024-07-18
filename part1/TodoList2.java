// In this exercise we are going to create a program that can be used to create and modify a to-do list. The final product will work in the following manner.

// p1: TodoList

// TodoList
// Create a class called TodoList. It should have a constructor without parameters and the following methods:

// public void add(String task) - add the task passed as a parameter to the todo list.
// public void print() - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
// public void remove(int number) - removes the task associated with the given number; the number is the one seen associated with the task in the print.

import java.util.ArrayList;

public class TodoList2 {

    private ArrayList<String> tasks;

    public TodoList2() {

        this.tasks = new ArrayList<>();

    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {

        for (int i = 0; i < tasks.size(); i++) {

            System.out.println((i+1) + ": " + tasks.get(i));

        }

    }
    
    public void remove(int number) {

        tasks.remove(number-1);

    }

}
