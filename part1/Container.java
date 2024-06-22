// Let's redo the previous program for handling two liquid containers. 
// This time we'll create a class "Container", which is responsible for 
// managing the contents of a container.

// Container
// Make a class called Container. The class must have a constructor which 
// does not take any parameters, and the following methods:

// public int contains() which returns the amount of liquid in a container
// as an integer.
// public void add(int amount) which adds the amount of liquid given as a 
// parameter to the container. If the amount is negative, no liquid is added. 
// A container can hold a maximum of 100 units of liquid.
// public void remove(int amount) which removes the amount of liquid given as 
// a parameter from the container. If the amount is negative, no liquid is 
// removed. A container can never hold less than 0 units of liquid.
// public String toString() which returns the container as a string formatted 
// "amount of liquid/100, for example "32/100".
// The class should work as follows:

public class Container {

    private int amt;

    public int contains() {
        return this.amt;
    }

    public void add(int amount) {

        if (amount >= 0) {

            if (this.amt + amount > 100) {

                this.amt = 100;

            } else {

                this.amt += amount;

            }

        }

    }

    public void remove(int amount) {

        if (amount >= 0) {

            if (this.amt - amount < 0) {

                this.amt = 0;

            } else {

                this.amt -= amount;

            }

        }

    }

    @Override
    public String toString() {
        return contains() + "/100";
    }

}