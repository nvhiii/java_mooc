// Implement the decrement() method in the class body in 
// such a way that it decrements the value variable of the
// object it's being called on by one. Once you're done 
// with the decrement() method, the main program of the previous 
// example should work to produce the example output.

// Implement the decrement() in such a way that the counter's value 
// never becomes negative. This means that if the value of the 
// counter is 0, it cannot be decremented. A conditional statement 
// is useful here.

// Create the method public void reset() for the counter that 
// resets the value of the counter to 0. For example

public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if (this.value > 0) {
            this.value--;
        }
    }

    // the other methods go here

    public void reset() {

        this.value = 0;

    }
}
