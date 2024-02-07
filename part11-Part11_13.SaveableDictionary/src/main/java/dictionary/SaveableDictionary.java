package dictionary;

import java.util.Map.Entry;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> translation;
    private String filename;

    public SaveableDictionary() {
        this.translation = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this();
        this.filename = file;
    }

    public boolean load(){
        try {
            //read file
        } catch (IOException e) {
            return false;
        }
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
