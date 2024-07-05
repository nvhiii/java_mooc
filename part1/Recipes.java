import java.util.ArrayList;

public class Recipes {

    private ArrayList<Recipe> recipes;

    public Recipes() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {

        this.recipes.add(recipe);

    }

    public void print() {

        for (Recipe r : recipes) {

            System.out.println(r);

        }

    }
    
}
