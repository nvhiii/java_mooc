// Count
// Create a class Statistics that has the following functionality
// (the file for the class is provided in the exercise template):

// a method addNumber adds a new number to the statistics
// a method getCount tells the number of added numbers
// The class does not need to store the added numbers anywhere, 
// it is enough for it to remember their count. At this stage, 
// the addNumber method can even neglect the numbers being added 
// to the statistics, since the only thing being stored is 
// the count of numbers added.

public class Statistics {

    private int count;

    // can use default as well
    public Statistics() {

        this.count = 0;

    }

    public void addNumber(int number) {

        this.count++;

    }

    public int getCount() {

        return this.count;

    }

}
