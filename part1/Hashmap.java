// Exercise template contains a class Program. Implement the following class methods in the class:

// public static void printKeys(HashMap<String,String> hashmap), prints all the keys in the hashmap given as a parameter.
// public static void printKeysWhere(HashMap<String,String> hashmap, String text) prints the keys in the hashmap given as a parameter, which contain the string given as a parameter.
// public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text), prints the values in the given hashmap whichs keys contain the given string. 

import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String, String> hashmap) {

        for (String s : hashmap.keySet()) {

            System.out.println(s); // prints keys

        }

    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {

        for (String s : hashmap.keySet()) {

            if (s.contains(text)) {
                System.out.println(s); // print keys
            }

        }

    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {

        for (String s : hashmap.keySet()) {

            if (s.contains(text)) {

                System.out.println(hashmap.get(s));

            }

        }

    }

}
