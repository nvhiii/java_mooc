// The program described here should be implemented in the class 
// PersonalInformationCollection. NB! Do not modify the class PersonalInformation.

// After the user has entered the last set of details 
// (they enter an empty first name), exit the repeat statement.

// Then print the collected personal information so that each 
// entered object is printed in the following format: first and 
// last names separated by a space (you don't print the 
// identification number). An example of the working program is given below:

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            // prompt 1
            System.out.println("First name: ");
            String fName = scanner.nextLine();

            // break cond
            if (fName.equals("")) {
                break;
            }

            // prompt 2
            System.out.println("Last name: ");
            String lName = scanner.nextLine();

            // prompt 3
            System.out.println("Identification number: ");
            String ID = scanner.nextLine();

            infoCollection.add(new PersonalInformation(fName, lName, ID));

        }

        for (PersonalInformation pi : infoCollection) {

            System.out.println(pi.getFirstName() + " " + pi.getLastName());

        }

    }
}
