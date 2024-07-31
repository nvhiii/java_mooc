// Your assignment is to create the class DictionaryOfManyTranslations. In it can be stored one or more translations for each word. The class is to implement the following methods:

// public void add(String word, String translation) adds the translation for the word and preserves the old translations.
// public ArrayList<String> translate(String word) returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.
// public void remove(String word) removes the word and all its translations from the dictionary.
// It's probably best to add the translations to an object variable that is of the type HashMap<String, ArrayList<String>>

// An example:

import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {

        // first init inner arraylist
        this.translations.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> words = this.translations.get(word);
        words.add(translation);

    }

    public ArrayList<String> translate(String word) {

        // we want the translations for the specified word
        // have to add getOrDefault
        return this.translations.getOrDefault(word, new ArrayList<>());

    }

    public void remove(String word) {

        translations.remove(word);

    }

}