// Create the method 
// public static void removeLast(ArrayList<String> strings)
// in the exercise template. The method should remove the last 
// value in the list it receives as a parameter. If the list is 
// empty, the method does nothing.

import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }

    public static void removeLast(ArrayList<String> strings) {

        if (strings.size() == 0) {

            return;

        }

        strings.remove(strings.size()-1);

    }

}
