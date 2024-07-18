// In the main-method create a new HashMap<String,String> object. Store the names and nicknames of the following people in this hashmap so, that the name is the key and the nickname is the value. Use only lower case letters.

// matthew's nickname is matt
// michael's nickname is mix
// arthur's nickname is artie
// Then get Matthew's nickname from the hashmap, and print it.

// There is no automated tests for this exercise. Just submit the exercise when you think it works as it should.

import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!

        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

    }

}
