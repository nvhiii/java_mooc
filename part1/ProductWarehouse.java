// p1: Product warehouse, step 1
// The class Warehouse handles the functions related to the amount of a product. Now we want a product name for the product and a way to handle the name. Let's write ProductWarehouse as a subclass of Warehouse! First, we'll just create a private object variable for the product name, a constructor, and a getter for the name field:

// public ProductWarehouse(String productName, double capacity) - Creates an empty product warehouse. The name of the product and the capacity of the warehouse are provided as parameters.
// public String getName() - Returns the name of the product.
// Remind yourself of how a constructor can run the constructor of the superclass as its first action!

// Example usage:

// p2: Product warehouse, step 2
// As we can see from the previous example, the toString() inherited by the ProductWarehouse object doesn't (obviously!) know anything about the product name. Something must be done! Let's also add a setter for the product name while we're at it:

// public void setName(String newName) - sets a new name for the product.
// public String toString() - Returns the state of the object represented as a string like this Juice: balance = 64.5, space left 123.5
// The new toString() method could be written using the getters inherited from the superclass, which would give access to values of inherited, but still hidden fields. However, the superclass already has the desired functionality to provide a string representation of the warehouse state, so why bother recreating that functionality? Just take advantage of the inherited toString().

// Remind yourself of how to call an overridden method in a subclass!

// Usage example:

// p3: Change History, step 1
// Sometimes it might be useful to know how the inventory of a product changes over time: Is the inventory often low? Are we usually at the limit? Are the changes in inventory big or small? Etc. Thus we should give the ProductWarehouse class the ability to remember the changes in the amount of a product.

// Let's begin by creating a tool that aids in the desired functionality.

// The storing of the change history could of course have been done using an ArrayList<Double> object in the class ProductWarehouse, however, we want our own specialized tool for this purpose. The tool should be implemented by encapsulating the ArrayList<Double> object.

// Public constructors and methods of the ChangeHistory class:

// public ChangeHistory() creates an empty ChangeHistory object.
// public void add(double status) adds provided status as the latest amount to remember in the change history.
// public void clear() empties the history.
// public String toString() returns the string representation of the change history. The string representation provided by the ArrayList class is sufficient.

public class ProductWarehouse extends Warehouse {

    private String objName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.objName = productName;
    }

    public String getName() {
        return this.objName;
    }

    public void setName(String newName) {
        this.objName = newName;
    }

    @Override
    public String toString() {

        return getName() + ": " + super.toString();

    }

    
    
}
