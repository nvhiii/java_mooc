public class Bird {

    // instantiate bird
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName, int observations) {
        this.name = name;
        this.latinName = latinName;
        this.observations = observations;
    }

    public void incrementObservations() {
        this.observations++;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.observations + " observations";
    }

    // name getter
    public String getName() {
        return this.name;
    }

    
}
