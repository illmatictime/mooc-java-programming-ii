package dictionary;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;

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
        try (Scanner fileReader = new Scanner(this.filename)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character
            
                System.out.println(parts[0]);     // part of line before :
                System.out.println(parts[1]);     // part of line after :
            }
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
