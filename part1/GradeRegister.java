// The exercise base includes the previously constructed program to 
// store grades. In this exercise you will further develop the class 
// GradeRegister so that it can calculate the average of grades and exam results.

// Average grade
// Create the method public double averageOfGrades() for the class 
// GradeRegister. It should return the average of the grades. If the 
// register contains no grades, the method should return -1. Use the 
// grades list to calculate the average.

// Example:

// Average points
// Give the class GradeRegister a new object variable: a list where 
// you will store the exam points every time that the method 
// addGradeBasedOnPoints is called. After this addition, create a 
// method public double averageOfPoints() that calculates and returns 
// the average of the exam points. If there are no points added to the 
// register, the method should return the number -1.

import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> rawGrades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.rawGrades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.rawGrades.add(points);

    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {

        if (this.grades.isEmpty()) {
            return -1;
        }

        int total = 0;
        for (int num : this.grades) {
            total += num;
        }

        return 1.00 * total / this.grades.size();

    }

    public double averageOfPoints() {

        if (this.rawGrades.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (int pts : this.rawGrades) {

            sum += pts;

        }

        return 1.0 * sum / this.rawGrades.size();

    }



}
