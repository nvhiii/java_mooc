// In the Payment card exercise we used a double-type object variable to 
// store the amount of money. In real applications this is not the approach 
// you want to take, since as we have seen, calculating with doubles is not 
// exact. A more reasonable way to handle amounts of money is create an 
// own class for that purpose. Here is a layout for the class:

// The word final used in the definition of object variables catches 
// attention. The result of this word is that the values of these object 
// variables cannot be modified after they have been set in the 
// constructor. The objects of Money class are unchangeable so immutable 
// — if we want to e.g. increase the amount of money, we must create a 
// new object to represent that new amount of money.

// Next we'll create a few operations for processing money.

// Plus
// First create the method public Money plus(Money addition) that returns 
// a new money object that is worth the total amount of the object whose 
// method was called and the object that is received as the parameter.

// The basis for the method is the following:

// Less
// Create the method public boolean lessThan(Money compared) that returns 
// true if the money-object on which the method is called on has a lesser 
// value than the money object given as a parameter.

// Minus
// Write the method 
// public Money minus(Money decreaser) that returns a new money object 
// worth the difference of the object whose method was called and the 
// object received as the parameter. If the difference would be negative, 
// the worth of the created money object is set to 0.

// Here are examples of how the method works.

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {

        return new Money(euros + addition.euros, cents + addition.cents);

    }

    public boolean lessThan(Money compared) {

        return this.euros < compared.euros || this.euros == compared.euros && this.cents < compared.cents;

    }

    public Money minus(Money decreaser) {

        if (this.lessThan(decreaser)) {
            return new Money(0, 0);
        } else {
            
            // logic for substraction
            if (this.cents < decreaser.cents) {

                return new Money(euros - decreaser.euros - 1, 100 + (cents - decreaser.cents));

            } else {

                return new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);

            }

        }

        

    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
