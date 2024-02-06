package dictionary;

import java.util.HashMap;

public class SaveableDictionary {

    private HashMap<String, String> translation;

    public SaveableDictionary() {
        this.translation = new HashMap<>();
    }

    public void add(String words, String translation) {
        // if (this.translation.containsKey(words)) {
        // return;
        // }
        // this.translation.put(words, translation);
        this.translation.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        // if (this.translation.values().contains(word)) {
        // this.translation
        // return word + " found.";
        // }

        for (String theword : this.translation.values()) {
            if (theword.equals(word)) {
                return theword;
            }
        }

        return word + " not found";
    }
}
