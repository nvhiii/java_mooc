import java.util.ArrayList;

// class for each individual recipe
public class Recipe {

    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String recipeName, int cookingTime, ArrayList<String> ingredients) {

        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;

    }

    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }
    
}
