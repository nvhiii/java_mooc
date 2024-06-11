// Create a Package class to which gifts can be added, and that keeps track 
// of the total weight of the gifts in the package. The class should contain:

// A parameterless constructor

// Method public void addGift(Gift gift), which adds the gift 
// passed as a parameter to the package. The method returns no value.

// Method public int totalWeight(), which returns the total weight 
// of the package's gifts.

// It's recommended to store the items in an ArrayList object.

import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {

        int total = 0;
        for (Gift g : gifts) {
            total += g.getWeight();
        }
        return total;

    }

}