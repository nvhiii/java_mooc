// The project will include two code files:

// The exercise template comes with a code file called Main, which 
// contains the main method.

// Add a new class to the project called PaymentCard. Here's how
//  to add a new class: On the left side of the screen is the list
// of projects. Right-click on the project name. Select New and Java 
// Class from the drop-down menu. Name the class as "PaymentCard".

// First, create the PaymentCard object's constructor, which is
//  passed the opening balance of the card, and which then stores 
// that balance in the object's internal variable. Then, write the 
// toString method, which will return the card's balance in the form 
// "The card has a balance of X euros".

// Complement the PaymentCard class with the following methods:

// The method eatAffordably should reduce the card's balance by € 2.60, 
// and the method eatHeartily should reduce the card's balance by € 4.60.

// What happens if the card runs out of money? It doesn't make sense in 
// this case for the balance to turn negative. Change the methods 
// eatAffordably and eatHeartily so that they don't reduce the balance 
// should it turn negative.

// The purpose of the method is to increase the card's balance by 
// the amount of money given as a parameter. However, the card's 
// balance may not exceed 150 euros. As such, if the amount to be 
// topped up exceeds this limit, the balance should, in any case, become 
// exactly 150 euros.

// Change the addMoney method further, so that if there is an 
// attempt to top it up with a negative amount, the value on the 
// card will not change.

public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    public String toString() {
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        // write code here
        if (this.balance - 2.60 >= 0) {
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        // write code here
        if (this.balance - 4.60 >= 0) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        // write code here
        if (this.balance + amount > 150) {
            this.balance = 150;
        } else if (amount > 0) {
            this.balance += amount;
        }   
    }



}