// each storage unit can have many items, so hashmap w keys w/ many values

// p1:
// Adding items and examining contents
// Your task is creating a class called StorageFacility that can be used to keep track of storage units and their contents. The class is to implement the following methods:

// public void add(String unit, String item) adds the parameter item to the storage unit that is also given as a parameter.
// public ArrayList<String> contents(String storageUnit) returns a list that contains all the items in the storage unit indicated by the parameter. If there is no such storage unit or it contains no items, the method should return an empty list.
// Here's an example:
// import java.util.ArrayList;

// p2
// Listing the units and removing from unit
// Now the class StorageFacility contains the functionality to add an item to a storage unit and to list the contents of a unit. Next add the possibilities to remove an item from a storage unit and to list all the units.
// public void remove(String storageUnit, String item) removes the given item from the given storage unit. NB! Only removes one item — if there are several items with the same name, the rest still remain. If the storage unit would be empty after the removal, the method also removes the unit.
// public ArrayList<String> storageUnits() returns the names of the storage units as a list. NB! Only the units that contain items are listed.
// An example:

import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {

        this.facility = new HashMap<>();

    }
    
    public void add(String unit, String item) {

        // first init the arraylist first
        this.facility.putIfAbsent(unit, new ArrayList<>()); // arraylist is auto typed to string

        // now add if arraylist exists
        this.facility.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {

        return this.facility.getOrDefault(storageUnit, new ArrayList<>());

    }

    public void remove(String storageUnit, String item) {

        // remove item from specified storageunit
        int size = this.facility.get(storageUnit).size();
        int removedSize = size - 1;

        if (removedSize == 0) {
            this.facility.remove(storageUnit);
        } else {
            this.facility.get(storageUnit).remove(item);
        }

    }

    public ArrayList<String> storageUnits() {

        ArrayList<String> notEmptyUnits = new ArrayList<>();

        for (String key : this.facility.keySet()) {

            // implement check for if the key contains items
            if (!this.facility.get(key).isEmpty()) {

                notEmptyUnits.add(key);

            }

        }

        return notEmptyUnits;

    }

}
