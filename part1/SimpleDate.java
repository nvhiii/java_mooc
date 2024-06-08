// With the exercise base the class SimpleDate is supplied. The date 
// is stored with the help of the object variables year, month, and day:

// Next day
// Implement the method public void advance() that moves the date by one day. 
// In this exercise we assume that each month has 30 day. NB! In certain 
// situations you need to change the values of month and year.

// Advance specific number of days
// Implement the method public void advance(int howManyDays) that moves the 
// date by the number of days that is given. Use the method advance() that 
// you implemented in the previous section to help you in this.

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        
        if (this.day == 30) {

            this.day = 1;
            if (this.month == 12) {
                this.month = 1;
                this.year += 1;
            } else {
                this.month += 1;
            }

        } else {
            this.day += 1;
        }

    }

    // overload advance method
    public void advance(int howManyDays) {
        this.day += howManyDays;
        if (this.day > 30) {

            this.day = this.day %= 30;
            this.month += this.day /= 30;
            if (this.month > 12) {
                this.month = 1;
                this.year += this.month/12;
            }

        }
    }

}
