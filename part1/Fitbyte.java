// The Karvonen method allows you to calculate your target heart rate for 
// physical exercise. The target heart rate is calculated with the 
// formula (maximum heart rate - resting heart rate) * (target heart 
// rate percentage) + resting heart rate, where the target heart rate 
// is given as a percentage of the maximum heart rate.
// For example, if a person has a maximum heart rate of 200, a resting 
// heart rate of 50, and a target heart rate of 75% of the maximum heart 
// rate, the target heart rate should be about ((200-50) * (0.75) + 50), 
// i.e., 162.5 beats per minute.

// Create a class called Fitbyte. Its constructor takes both an age 
// and a resting heart rate as its parameters. The exercise assistant 
// should provide a method targetHeartRate, which is passed a number of 
// type double as a parameter that represents a percentual portion of the 
// maximum heart rate. The proportion is given as a number between zero 
// and one. The class should have:

// A constructor public Fitbyte(int age, int restingHeartRate)
// A method public double targetHeartRate(double percentageOfMaximum) 
// that calculates and returns the target heart rate.
// Use the 206.3 - (0.711 * age) formula to calculate the maximum heart rate.

public class Fitbyte {

    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate) {

        this.age = age;
        this.restingHeartRate = restingHeartRate;

    }

    public double targetHeartRate(double percentageOfMaximum) {
        double max = 206.3 - (0.711 * this.age);
        return (max - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate;
    }

}
