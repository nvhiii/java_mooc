// Finding the smallest value
// Create in the class MainProgram a class method smallest that takes an 
// integer array as a parameter. It should return the smallest value in 
// the array.

// Here is the structure of the method:

// Index of the smallest value
// Create a method called indexOfSmallest in the class MainProgram. It should 
// return the index of the smallest number in the array that it receives as a 
// parameter.

// Here is the structure of the method:

// Index of the smallest value after a certain value
// Create in the class MainProgram a class method called indexOfSmallestFrom. 
// It works similarly to the method in the previous section, but only considers 
// the table values from a certain index forwards. In addition to the table, 
// it receives this start index as a parameter.

// The structure of the method is the following:

// Swapping numbers
// Create a class method swap in the class MainProgram. It receives as
// its parameters an array and two indices inside it. The method swaps the numbers 
// in these indices with each other.

// The basic structure of the method is:

// Sorting
// We have now assembled a set of useful methods. With their help, we can 
// implement a sorting algorithm known by the name of selection sort.

// The idea of selection sort is:

// Move the smallest number in the array to index 0.
// Move the second smallest number to index 1.
// Move the third smalles number in the array to index 2.
// Etc.
// In other words:

// Examine the array starting from index 0. Swap the following two numbers with 
// each other: the number at index 0, and the smallest number in the array starting 
// from index 0.
// // Examine the array starting from index 1. Swap the following two numbers with 
// each other: the number at index 1, and the smallest number in the array starting 
// from index 1.
// // Examine the array starting from index 2. Swap the following two numbers with 
// each other: the number at index 2, and the smallest number in the array starting 
// from index 2.
// // Etc.
// // Implement a class method called sort based on the idea above in the class 
// MainProgram. It should include a loop that goes through the indices of the 
// array. Certainly the method indexOfSmallestFrom and swap will come in handy. 
// Additionally, print the contents of the array before sorting and after every 
// iteration of the loop to ensure that the algorithm works as you expect it to.

// The definition of the method looks like this:

public class MainProg {

    public static int smallest(int[] array) {

        int smallNum = array[0];

        for (int num : array) {

            if (num < smallNum) {

                smallNum = num;

            }

        }

        return smallNum;

    }

    public static int indexOfSmallest(int[] array) {

        int smallest = smallest(array); // logic returns smallest of array
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == smallest) {

                smallestIndex = i;

            }

        }

        return smallestIndex;
        

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        // use for loop to indicate index
        
        int smallest = table[startIndex];
        int smallestIdx = startIndex;

        for (int i = startIndex; i < table.length; i++) {

            if (table[i] < smallest) {

                smallest = table[i];
                smallestIdx = i;

            }

        }

        return smallestIdx;

    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1]; // stores val at index1
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            swap(array, i, indexOfSmallestFrom(array, i));

        }

    }

}
