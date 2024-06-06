// The exercise template has a class Product, which represents a product in a shop. Every product has a name, location and weight.

// Add the following three constructors to the Product class:

// public Product(String name) creates a product with the given name. 
// Its location is set to "shelf" and its weight is set to 1.
// public Product(String name, String location) creates a product with
//  the given name and the given location. Its weight is set to 1.
// public Product(String name, int weight) creates a product with the 
// given name and the given weight. Its location is set to "shelf".

public class Products {

    private String name;
    private String location;
    private int weight;

    public Products(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Products(String name) {
        this(name, "shelf", 1);
    }

    public Products(String name, String location) {
        this(name, location, 1);
    }

    public Products(String name, int weight) {
        this(name, "shelf", weight);
    }

    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
