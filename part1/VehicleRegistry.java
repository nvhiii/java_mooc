// Expanded vehicle registry
// Add the following methods to the VehicleRegistry:

// public void printLicensePlates()prints the license plates in the registry.

// public void printOwners() prints the owners of the cars in the registry. Each name should only be printed once, even if a particular person owns more than one car.

// Useful tip! In the printOwners method, you can create a list used for remembering the owners that were already printed. If an owner is not on the list, their name is printed and they are added to the list; conversely, if an owner is on the list, their name isn't printed.

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;  // If already contains the license plate, return false
        } else {
            this.registry.put(licensePlate, owner);
            return true;  // Successfully added, return true
        }
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);  // Returns null if not found, as desired
    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;  // Successfully removed, return true
        } else {
            return false;  // Not found, return false
        }
    }

    public void printLicensePlates() {

        for (LicensePlate lp : registry.keySet()) {

            System.out.println(lp);

        }

    }

    public void printOwners() {

        ArrayList<String> onlyOne = new ArrayList<>();

        for (String owner : registry.values()) {

            if (!onlyOne.contains(owner)) {

                onlyOne.add(owner);
                System.out.println(owner);

            }

        }
        
    }

}
