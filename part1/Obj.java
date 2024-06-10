public class Obj {

    private int age;
    private String name;

    public Obj(String name) {
        this(name, 0);
    }

    public Obj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void growOlder() {
        this.growOlder(1);
    }

    public void growOlder(int years) {
        this.age += years;
    }

    @Override
    public String toString() {
        return "Hello, " + this.name + ". You are " + this.age + " years old.";
    }
    
}
