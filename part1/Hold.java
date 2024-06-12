// Hold-class
// Make a Hold class with the following methods:

// a constructor, to which the maximum weight is given

// method public void addSuitcase(Suitcase suitcase) that adds the specified 
// luggage to the hold

// method public String toString() that returns the string "x suitcases (y kg)"

// Store your suitcases in a suitable ArrayList structure.

// The class Hold has to ensure that the total weight of the suitcases 
// it contains does not exceed the maximum weight. Should the maximum 
// weight be exceeded due to the addition of new luggage, the addSuitcase 
// method should not add the new suitcase.

// The following is an example of the class in use:

// The Hold's Contents
// Add to the Hold class the method public void printItems() 
// that prints all the items contained in the hold's suitcases.

// The following is an example of the class in use:

import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> hold;
    private int weight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.hold = new ArrayList<>();
        this.weight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {

        if (suitcase.totalWeight() + this.weight <= this.maximumWeight) {
            this.hold.add(suitcase);
            this.weight += suitcase.totalWeight();
        }

    }

    @Override
    public String toString() {
        return this.hold.size() + " suitcases (" + this.weight + " kg)";
    }

    public void printItems() {
        for (Suitcase s : this.hold) {
            s.printItems();
        }
    }

} 