import java.util.ArrayList;

public class BirdDatabase {

    // arraylist for all birds
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void printAll() {
        for (Bird b : birds) {
            System.out.println(b);
        }
    }

    public void add(Bird b) {
        this.birds.add(b);
    }

    public boolean isABird(String animal) {

        for (Bird b : birds) {

            if (b.getName().equals(animal)) {
                return true;
            }

        }

        return false;

    }

    public void observeBird(String animal) {

        if (isABird(animal)) {

            for (Bird b : birds) {

                if (b.getName().equals(animal)) {
                    b.incrementObservations();
                }
    
            }

        } else {

            System.out.println("Not a bird!");

        }

    }

    public void printBird(String name) {

        for (Bird b : birds) {

            if (b.getName().equals(name)) {
                System.out.println(b);
            }

        }

    }
    
}
