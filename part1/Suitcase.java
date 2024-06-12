// Suitcase-class
// Create a Suitcase class. The suitcase has items and a maximum weight 
// that determines the maximum total weight of the items.

// Add the following methods to the class:

// Constructor, to which the maximum weight is provided

// The method public void addItem(Item item), which adds the item passed 
// as a parameter to the suitcase. The method does not return a value.

// The method public String toString(), which returns the string "x items (y kg)"

// It's advisable to store the items in an ArrayList object:

// The class Suitcase should ensure that the total weight of the items 
// within it does not exceed the maximum weight limit. If that limit 
// would be exceeded as a result of the item to be added, the method 
// addItem should not add the new item to the suitcase.

// The following is an example use case of the class:

// Language Formatting
// The statement "1 items" is not exactly proper English — a better form would 
// be "1 item". The lack of items could also be expressed as "no items". 
// Implement this change to the toString method of the Suitcase class.

// The output of the previous program should now look as follows:

// All items
// Add the following methods to the Suitcase class:

// a printItems method, which prints all the items in the suitcase

// a totalWeight method, which returns the total weight of the items

// The following is an example use case of the class:

// Heaviest item
// Add to the Suitcase class a heaviestItem method, which returns the 
// largest item based on weight. If several items share the heaviest 
// weight, the method can return any one of them. The method should return 
// an object reference. If the suitcase is empty, return the value null.

// The following is an example of the class in use:

import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item2> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {

        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();

    }

    public void addItem(Item2 item) {

        if (this.totalWeight() + item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
        }

    }

    public int totalWeight() {

        int total = 0;

        for (Item2 a : this.items) {
            total += a.getWeight();
        }

        return total;

    }

    @Override
    public String toString() {

        String format = this.items.size() + " items (" + totalWeight() + " kg)";

        if (this.items.isEmpty()) {
            format = "no items (0 kg)";
        } else if (this.items.size() == 1) {
            format = this.items.size() + " item " + totalWeight() + " kg)";
        }

        return format;
    }

    public void printItems() {
        for (Item2 a : items) {
            System.out.println(a);
        }
    }

    public Item2 heaviestItem() {

        if (this.items.isEmpty()) {
            return null;
        }

        Item2 heaviest = this.items.get(0);
        for (Item2 a : this.items) {
            if (heaviest.getWeight() < a.getWeight()) {
                heaviest = a;
            }
        }

        return heaviest;

    }

}