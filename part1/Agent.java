// The exercise template defines an Agent class, having a 
// first name and last name. A print method is defined for 
// the class that creates the following string representation.

// Remove the class' print method, and create a 
// public String toString() method 
// for it, which returns the string representation shown above.

public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    
    public String toString() {
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }
    
}
