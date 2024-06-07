// Payment terminal and cash

// When visiting a student cafeteria, the customer pays either with 
// cash or with a payment card. The cashier uses a payment terminal 
// to charge the card or to process the cash payment. First, let's create 
// a terminal that's suitable for cash payments.

// The outline of the payment terminal. The comments inside the methods 
// tell the wanted functionality:

// Card payments

// Let's extend our payment terminal to also support card payments. We are going 
// to create new methods for the terminal. It receives a payment card as a parameter, 
// and decreases its balance by the price of the meal that was purchased. Here are the 
// outlines for the methods, and instructions for completing them.

// Let's create a method for the terminal that can be used to add money to a payment
//  card. Recall that the payment that is received when adding money to the 
// card is stored in the register. The basis for the method:

public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and 
        // return the change
        // if the payment parameter is not large enough, no meal is sold and the 
        // method should return the whole payment
        if (payment >= 2.50) {
            this.money += 2.50;
            affordableMeals++;
            // return change
            return payment - 2.50;
        } else {
            return payment;
        }

    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is 
        // decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= 2.50) {
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        } else {
            return false;
        }

    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 4.30) {
            this.money += 4.30;
            heartyMeals++;
            // return change
            return payment - 4.30;
        } else {
            return payment;
        }

    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= 4.30) {
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
