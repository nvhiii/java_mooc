// The exercise template has a predefined SimpleCollection class, 
// which is used to represent a group of values. The class is missing 
// the toString method used for printing.

// Implement a toString method for the class that will perform as demonstrated 
// in the following examples.

import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override 
    public String toString() {
        String printOutput = "The collection " + this.name + " has " + this.getElements().size() +
            " element:";
        
        if (this.getElements().size() > 1) {
            printOutput = "The collection " + this.name + " has " + this.getElements().size() +
            " elements:";
        }

        if (this.getElements().isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        for (String element: this.getElements()) {
            printOutput += "\n" + element;
        }
        
        return printOutput;
    }
    
}
