// Write a program SumOfTwoDice.java that prints the sum 
// of two random integers between 1 and 6 (such as you might
// get when rolling dice).

public class SumOfTwoDice {

    public static void main(String[] args) {

        int min = 1;
        int max = 6;
        int range = max - min;

        int dice1 = (int)(Math.random() * range) + min;
        int dice2 = (int)(Math.random() * range) + min;

        int sumOfDice = dice1 + dice2;

        System.out.println("Dice 1 rolled: " + dice1 + " and dice 2 rolled: " + dice2 + ". The sume is: " + sumOfDice);
        

    }

}