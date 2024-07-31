// In this exercise, we create the classes Item, Suitcase and Hold to practise the use of objects containing other objects.

// Item-class
// Create an Item class from which objects can be instantiated to represent different items. The information to store is the name and weight of the item (kg).

// Add the following methods to the class:

// Constructor that takes the name and the weight of the item as parameters

// Method public String getName(), which returns the item's name

// Method public int getWeight(), which returns the item's weight

// Method public String toString(), which returns the string "name (weight kg)"

// The following is an example of the class in use:

public class Item3 {

    private String name;
    private int weight;

    public Item3(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return getName() + "(" + getWeight() + " kg)";
    }

}