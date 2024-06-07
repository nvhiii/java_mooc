// In the exercise base there is the class Person, which we are already 
// quite familiar with. There is also an outline for the class HealthStation. 
// Health station objects process people in different ways, they e.g. 
// weigh and feed people. In this exercise we will construct a health 
// station. The code of the Person class should not be modified in this exercise!

// The method receives a person as a parameter, and it is meant to 
// return to its caller the weight of that person. The weight information 
// can be found by calling a suitable method of the person person. So your 
// task is to complete the code of the method!

// Here is a main program where a health station weight two people:

public class HealthStation {

    private int weighings;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);;
    }

    public int weighings() {
        return this.weighings;
    }

}
