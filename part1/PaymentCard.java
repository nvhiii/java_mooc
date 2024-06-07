// "Dumb" payment card
// In a previous part we created a class called PaymentCard. The card had 
// methods for eating affordably and heartily, and also for adding money to 
// the card.

// However, there was a problem with the PaymentCard class that is implemented 
// in this fashion. The card knew the prices of the different lunches, and 
// therefore was able to decrease the balance by the proper amount. What 
// about if the prices are raised? Or new items are added to the list of 
// offered products? A change in the pricing would mean that all the existing 
// cards would have to be replaced with new cards that are aware of the new prices.

// An improved solution is to make the cards "dumb"; unaware of the prices 
// and products that are sold, and only keeping track of their balance. All 
// the intelligence is better placed in separate objects, payment terminals.

// Let's first implement the "dumb" version of the PaymentCard. The card only 
// has methods for asking for the balance, adding money, and taking money. 
// Complete the method public boolean takeMoney(double amount) in the class 
// below (and found in the exercise template), using the following as a guide:

public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
        // returns true if successful and false otherwise
    }
}
