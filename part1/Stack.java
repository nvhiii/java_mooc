import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    // use default constructor
    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {

        return stack.isEmpty();

    }
    
    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {

        return this.stack;

    }

    public String take() {
        String temp = this.stack.get(this.stack.size()-1);
        this.stack.remove(this.stack.size()-1);
        return temp;
    }

}