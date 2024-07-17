// p2: Functionality
// Copy the user interface you implemented for the previous example, and modify it to use the new Container class. The main method in the class LiquidContainers2 must start the program.

// Below is some sample output. The user interface should work as follows:

public class Container2 {

    private int amount;

    public Container2() {}

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount >= 0) {
            
            if (this.amount + amount >= 100) {
                this.amount = 100;
            } else {
                this.amount += amount;
            }

        }
    }

    public void remove(int amount) {
        if (amount >= 0) {

            if (this.amount - amount <= 0) {
                this.amount = 0;
            } else {
                this.amount -= amount;
            }

        }
     }

     @Override
     public String toString() {
        return contains() + "/100";
     }
    
}
