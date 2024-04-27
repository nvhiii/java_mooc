// Write a program RollLoadedDie.java that prints the 
// result of rolling a loaded die such that the probability 
// of getting a 1, 2, 3, 4, or 5 is 1/8 and the probability of 
// getting a 6 is 3/8.

public class RollLoadedDie {

    public static void main(String[] args) {

        double rand = Math.random();

        int roll;
        if (rand < 1.0/8) {
            roll = 1;
        } else if (rand < 2.0/8) {
            roll = 2;
        } else if (rand < 3.0/8) {
            roll = 3;
        } else if (rand < 4.0/8) {
            roll = 4;
        } else if (rand < 5.0/8) {
            roll = 5;
        } else {

            roll = 6;

        }

        System.out.println(roll);

    }

}