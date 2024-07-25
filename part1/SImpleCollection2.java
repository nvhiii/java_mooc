
import java.util.ArrayList;

public class SImpleCollection2 {

    private String name;
    private ArrayList<String> elements;

    public SImpleCollection2(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {

        if (this.elements.isEmpty()) {
            return null;
        }

        // set 1st var as longest
        String biggestString = this.elements.get(0);

        for (String a : this.elements) {

            if (a.length() > biggestString.length()) {
                biggestString = a;
            }

        }

        return biggestString;

    }

}
