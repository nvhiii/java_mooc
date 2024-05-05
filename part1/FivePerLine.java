// Write a program FivePerLine.java that, using one for 
// loop and one if statement, prints the integers from 1000 to 
// 2000 with five integers per line. Hint: use the % operator.

public class FivePerLine {

    public static void main(String[] args) {

        int START = 1000;
        int END = 2000;
        int perLine = 5;

        for (int i = START; i <= END; i++) {

            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }

        }

    }

}