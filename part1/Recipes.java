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

    public void find(String name) {

        for (Recipe r : recipes) {

            if (r.getRecipeName().contains(name)) {
                System.out.println(r);
            }

        }

    }

    public void recipesMaxtime(int time) {

        for (Recipe r : recipes) {

            if (r.getCookingTime() <= time) {
                System.out.println(r);
            }

        }

    }
    
    public void findByIngredient(String ingredient) {

        for (Recipe r : recipes) {

            if (r.getIngredients().contains(ingredient)) {
                System.out.println(r);
            }

        }

    }

}   