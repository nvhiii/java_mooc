// Create a class Abbreviations for managing common abbreviations. The class must have a constructor, which does not take any parameters. The class must also provide the following methods:

// public void addAbbreviation(String abbreviation, String explanation) adds a new abbreviation and its explanation.
// public boolean hasAbbreviation(String abbreviation) checks if an abbreviation has already been added; returns true if it has and false if it has not.
// public String findExplanationFor(String abbreviation) finds the explanation for an abbreviation; returns null if the abbreviation has not been added yet.
// Example:

import java.util.HashMap;

public class Abbreviations {

    // instance var
    private HashMap<String, String> explainer;

    // constructor
    public Abbreviations() {
        this.explainer = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        explainer.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return explainer.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return explainer.get(abbreviation);
    }

}