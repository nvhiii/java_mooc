// In this exercise we are going to create a program that allows for 
// searching for recipes based on their name, cooking time, or the name 
// of an ingredient. The program should read the recipes from a file 
// that the user provides. It might be a good idea to brush up on reading 
// information from files (part 4) before beginning

// Each recipe consists of three or more rows in a recipe file. The first 
// row is for the name of the recipe, the second the cooking time (an integer), 
// and the third and possibly following rows list the ingredients used in the 
// recipe. An empty row follows the last ingredient row. There can be many 
// recipes in a single file. Below, an example file containing recipes is 
// described.

// Part 1
// Reading and listing recipes
// First create the functionality to read and list recipes. The user 
// interface of the program is described below. You may assume that the user 
// only enters files that exist. Below we assume that the example recipes given 
// earlier in the exercise description are stored in the file recipes.txt.

// Part 2
// Finding recipes by name
// Make it possible to find recipes by their names. Finding by name is done with the 
// command find name, after which the user is asked for the name that is used to 
// search. The search should print all the recipes whose names contain the string 
// given by the user.

// Part 3
// Searching for recipes by cooking time
// Next, implement the possibility to find recipes based on their cooking time. This 
// is done with the command find cooking time, after which the user is asked for 
// the longest acceptable cooking time. The program should react by printing all 
// the recipes whose cooking times don't exceed the cooking time given by the user 
// (so equal or less time).

// Part 4
// Finding recipes based on their ingredients
// Finally, add the functionality to search for recipes based on their ingredients. 
// This is done by choosing the command find ingredient, after which the user is asked 
// for a string. The program should then print all the recipes that contain the 
// specified string. Notice that with this option the given string must match exactly 
// the ingredient that is searched for (e.g. "ugar" will return different results than 
// "sugar").

import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.File;

public class RecipeSearch {

    public static void main(String[] args) {

        // handle keyboard inputs
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        Recipes recipes = new Recipes();

        // list cmds
        System.out.println("Commands:\n" +
                            "list - lists the recipes\n" +
                            "stop - stops the program\n" + 
                            "find name - searches recipes by name\n" +
                            "find cooking time - searches recipes by cooking time\n" +
                            "find ingredient - searches recipes by ingredient\n");

        // read n store values in file in recipes obj
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            String name = null;
            int time = -1;
            ArrayList<String> ingredients = new ArrayList<>();
            // add items to recipes obj
            while (true) {

                // iterate all lines w this
                String line = fileReader.nextLine();
                
                if (name == null) {
                    name = line;
                } else if (time == -1) {
                    time = Integer.valueOf(line);
                } else if (line.isEmpty()) { 
                    // resets the init values of each recipe
                    Recipe recipe = new Recipe(name,time,new ArrayList<>(ingredients));
                    recipes.add(recipe);
                    name = null;
                    time = -1;
                    ingredients.clear();
                    continue;

                } else {
                    ingredients.add(line);
                }

                // break cond
                if (!fileReader.hasNextLine()) {
                    Recipe recipe = new Recipe(name, time, new ArrayList<>(ingredients));
                    recipes.add(recipe);
                    break;
                }

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        // command handler
        while (true) {

            System.out.println("Enter command: ");
            String cmd = scanner.nextLine();

            if (cmd.equals("stop")) {
                break;
            }

            if (cmd.equals("list")) {

                recipes.print();

            } else if (cmd.equals("find name")) {

                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                recipes.find(word);
                
            } else if (cmd.equals("find cooking time")) { 

                System.out.println("Max cooking time");
                int cookingTime = Integer.valueOf(scanner.nextLine());
                recipes.recipesMaxtime(cookingTime);

            } else if (cmd.equals("find ingredient")) {

                System.out.println("Ingredient:");
                String ing = scanner.nextLine();
                recipes.findByIngredient(ing);
            
            } else {
                continue;
            }


        }

    }

}
