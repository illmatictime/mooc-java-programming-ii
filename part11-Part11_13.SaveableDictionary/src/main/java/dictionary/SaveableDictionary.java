package dictionary;

import java.util.Map.Entry;
import java.util.HashMap;

public class SaveableDictionary {

    private HashMap<String, String> translation;
    private String filename;

    public SaveableDictionary() {
        this.translation = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this.filename = file;
    }

    public boolean load(){
        if(this.filename.isEmpty() || this.filename.equals(null)){
            return false;
        }
        return true;
    }

    public void add(String words, String translation) {
        this.translation.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        for (Entry<String, String> aword : translation.entrySet()) {
            if (aword.getValue().equals(word)) {
                return aword.getKey();
                }
            }
        return this.translation.get(word);
    }

    public void delete(String word){
        this.translation.remove(word);
        this.translation.remove(this.translate(word));
    }
}
