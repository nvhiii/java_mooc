// The exercise template contains the already familiar classes Book and Program. In the class Program implement the following class methods:

// public static void printValues(HashMap<String,Book> hashmap), which prints all the values in the hashmap given as a parameter using
// the toString method of the Book objects.

// public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text), which prints only the Books in the given hashmap which name contains the given string. You can find out the name of a Book with the method getName.
// An example of using the class methods:

// public static void printValueIfNameContains(HashMap<String,Book> hashmap, 
// String text), which prints only the Books in the given hashmap which name contains 
// the given string. You can find out the name of a Book with the method getName.

import java.util.HashMap;

public class ValueMapping {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashmap) {

        for (Book b : hashmap.values()) {

            System.out.println(b);

        }

    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {

        for (Book b : hashmap.values()) {

            if (b.getName().contains(text)) {
                System.out.println(b);
            }

        }

    }

}
