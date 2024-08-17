// p3 + p4: Change History, step 1
// Sometimes it might be useful to know how the inventory of a product changes over time: Is the inventory often low? Are we usually at the limit? Are the changes in inventory big or small? Etc. Thus we should give the ProductWarehouse class the ability to remember the changes in the amount of a product.

// Let's begin by creating a tool that aids in the desired functionality.

// The storing of the change history could of course have been done using an ArrayList<Double> object in the class ProductWarehouse, however, we want our own specialized tool for this purpose. The tool should be implemented by encapsulating the ArrayList<Double> object.

// Public constructors and methods of the ChangeHistory class:

// public ChangeHistory() creates an empty ChangeHistory object.
// public void add(double status) adds provided status as the latest amount to remember in the change history.
// public void clear() empties the history.
// public String toString() returns the string representation of the change history. The string representation provided by the ArrayList class is sufficient.
// Change History, step 2
// Build on the ChangeHistory class by adding analysis methods:

// public double maxValue() returns the largest value in the change history. If the history is empty, the method should return zero.
// public double minValue() returns the smallest value in the change history. If the history is empty, the method should return zero.
// public double average() returns the average of the values in the change history. If the history is empty, the method should return zero.
// The methods should not modify the order of the encapsulated list.

import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> log;

    public ChangeHistory() {

        this.log = new ArrayList<>();

    }

    public void add(double status) {

        this.log.add(status);

    }

    public void clear() {
        this.log.clear();
    }

    @Override
    public String toString() {

        return log.toString();

    }

    public double maxValue() {

        // using arraylist is not as eff as hashmap
        double max = this.log.get(0);

        for (double val : this.log) {

            if (max < val) {

                max = val;

            }

        }

        return max;

    }
    
    public double minValue() {

        double min = this.log.get(0);

        for (double val : this.log) {

            if (val < min) {

                min = val;

            }

        }

        return min;

    }

    public double average() {

        if (!this.log.isEmpty()) {

            double sum = 0;
            int numVals = this.log.size();

            for (double val : this.log) {

                sum += val;
    
            }

            return sum / numVals;

        } else {

            return 0;

        }
        

    }

}
