
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {

            System.out.print("*");

        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        int temp = size;

        // iterate for x rows
        while (i <= size) {

            // size decrements bc it is largest when at tip of triangle
            printSpaces(--temp);
            printStars(i++);

        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        // start at iteration 0, more simple
        int i = 0;
        int temp = height;
        while (i < height) {

            printSpaces(--temp);
            printStars(2 * i + 1);
            i++;

        }

        // calculate max width, then substract 3
        int maxWidth = (height - 1) * 2 + 1;
        int spaceCalc = (maxWidth - 3) / 2;

        for (int j = 0; j < 2; j++) {

            printSpaces(spaceCalc); // hiehgt - 1 * 2 + 1
            printStars(3);
        }
    
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
