// 
// Point averages
// Write a program that reads integers representing course point 
// totals from the user. Numbers between [0-100] are acceptable and the 
// number -1 ends the reading of input. Other numbers are erroneous input, 
// which should be ignored. When the user enters the number -1, the program 
// should print the average of the point totals that were input.

// Point average for points giving a passing grade
// Extend the program, such that it in addition to giving the point average of 
// all totals also provides the point average for points giving a passing grade.

// A passing grade is achieved by getting a minimum of 50 course points. You 
// may assume that the user always provides at least one integer between [0-100].
//  If there are no numbers giving a passing grade, the program should print a 
//  line "-" where the average would be.

// Pass percentage
// Extend the program from the previous part, such that it also print the 
// pass percentage. The pass percentage is calculated using the formula 100 * 
// passing / participants.

// Grade distribution
// Extend the program, such that it also prints the grade distribution. 
// The grade distribution is as follows:

import java.util.Scanner;

public class Stats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        // will first write program in main

        System.out.println("Enter point totals, -1 stops:");
        int sum = 0;
        int sumPassing = 0;

        int numValues = 0;
        int numPassing = 0;

        // converted grade thresholds
        int gradeFive = 0;
        int gradeFour = 0;
        int gradeThree = 0;
        int gradeTwo = 0;
        int gradeOne = 0;
        int failed = 0;

        while (true) {

            int points = Integer.valueOf(scanner.nextLine());

            // break cond
            if (points == -1) {
                break;
            }

            // handle erroneous input
            if (points < -1 || points > 100) {
                continue;
            }

            // handle valid input
            sum += points;
            numValues++;

            if (points >= 90) {

                gradeFive++;

            } else if (points < 90 && points >= 80) {

                gradeFour++;

            } else if (points < 80 && points >= 70) {

                gradeThree++;

            } else if (points < 70 && points >= 60) {

                gradeTwo++;

            } else if (points < 60 && points >= 50) {
                
                gradeOne++;

            } else {

                failed++;

            }

            if (points >= 50) {

                sumPassing += points;
                numPassing++;

            }

        }

        System.out.println("Point average (all): " + 1.0 * sum / numValues);
        
        if (numPassing == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + 1.0 * sumPassing / numPassing);
        }

        System.out.println("Pass percentage: " + 100.0 * numPassing / numValues);
        System.out.println("Grade Distribution: ");
        String five = "";
        for (int i = 0; i < gradeFive; i++) {

            five += "*";

        }
        System.out.println("5: " + five);
        String four = "";
        for (int i = 0; i < gradeFour; i++) {

            four += "*";

        }
        System.out.println("4: " + four);
        String three = "";
        for (int i = 0; i < gradeThree; i++) {

            three += "*";

        }
        System.out.println("3: " + three);
        String two = "";
        for (int i = 0; i < gradeTwo; i++) {

            two += "*";

        }
        System.out.println("2: " + two);
        String one = "";
        for (int i = 0; i < gradeOne; i++) {

            one += "*";

        }
        System.out.println("1: " + one);
        String zero = "";
        for (int i = 0; i < failed; i++) {

            zero += "*";

        }
        System.out.println("0: " + zero);


    }
}
