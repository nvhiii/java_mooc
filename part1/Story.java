import java.util.Scanner;

public class Story {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Computer initial text
        System.out.println("I will tell you a story, but I need some information first.\nWhat is the main character called?");
        // User response
        String name = scanner.nextLine();

        System.out.println("What is their job?");
        String job = scanner.nextLine();

        System.out.println("Here is the story:\nOnce upon a time there was " + name + ", who was " + job + ".\nOn the way to work, " + name + " reflected on life.\nPerhaps " + name + " will not be " + job + " forever.");

    }

}