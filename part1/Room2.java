// A Person class is included in the exercise template. A person has 
// a name and a height. In this exercise, we'll implement a Room class, 
// which can be used to add people and order them according to their 
// height — taking a person out of the room always returns the shortest person.

// The class should eventually work in the following way.

// Room
// Create Room class. The class should contain a list of persons as an 
// instance variable, and it should have a parameterless constructor. 
// In addition, add the following methods to the class:

// public void add(Person person) - add the person passed as a 
// paramter to the list.

// public boolean isEmpty() - returns a boolean-type value true or false, 
// that tells whether the room is empty or not.

// public ArrayList<Person> getPersons() - returns a list of the persons 
// in the room.

// Shortest person
// Add a public Person shortest() method to the Room class, which returns the 
// shortest person added to the room. If the room is empty, a null reference 
// is returned. The method should not remove a person from the room.

// Taking from a room
// Add a public Person take() method to the Room class, which takes the 
// shortest person in the room. When a room is empty, it returns a null 
// reference.

import java.util.ArrayList;

public class Room2 {

    private ArrayList<Person> persons;

    public Room2() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {

        this.persons.add(person);

    }

    public boolean isEmpty() {

        return this.persons.isEmpty();

    }

    public ArrayList<Person> getPersons() {

        return this.persons;

    }

    public Person shortest() {

        if (isEmpty()) {
            return null;
        }

        // now make first one shortest
        Person shortest = this.persons.get(0);

        for (Person n : this.persons) {

            if (n.getHeight() < shortest.getHeight()) {

                shortest = n;

            }

        }

        return shortest;

    }

    public Person take() {

        if (isEmpty()) {
            return null;
        }
        Person toBeRemoved = shortest();
        this.persons.remove(shortest());
        return toBeRemoved;

    }


}