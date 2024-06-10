// 
// The gourmet restaurant 'Unicafe' on the Kumpula campus of the University 
// of Helsinki needs a new menu. The chef knows about programming and wants 
// a computer system to manage the menu. In this assignment, we'll implement 
// the heart of the system, the Menu class.

// The exercise template comes with a Main class that you can use to test 
// the menu. For the implementation of the menu, you'll have the following 
// boilerplate code:

// The menu object has an ArrayList as an instance variable to store 
// the names of the dishes on the menu. The menu should provide the 
// following methods:

// public void addMeal(String meal) adds a meal to the menu. 
// If the meal is already on the list, it should not be added again.

// public void printMeals() prints the meals.

// public void clearMenu() clears the menu.

// Once the menu is done, you can use it as follows.

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here

    public void addMeal(String meal) {
        if (!(meals.contains(meal))) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {

        for (String m : this.meals) {
            System.out.println(m);
        }

    }

    public void clearMenu() {
        this.meals.clear();
    }
}
