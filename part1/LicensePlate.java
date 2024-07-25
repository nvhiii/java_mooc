// p1
// Equals and hashCode for the LicensePlate class
// European license plates have two parts: a two letter country code and a 
// nationally unique license number. The license number is made up of numbers 
// and characters. License plates are represented by the following class:

import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object other) {

        // ref check
        if (this == other) {
            return true;
        }

        if (!(other instanceof LicensePlate)) {
            return false;
        }

        LicensePlate smth = (LicensePlate) other;
        if (this.liNumber.equals(smth.liNumber) && this.country.equals(smth.country)) {
            return true;
        }

        return false;

    }

    @Override
    public int hashCode() {

        return this.liNumber.hashCode();
    }

}
