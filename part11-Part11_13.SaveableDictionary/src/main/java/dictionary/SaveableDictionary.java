package dictionary;

import java.util.Map.Entry;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class SaveableDictionary {

    private HashMap<String, String> translation;
    private String filename;

    public SaveableDictionary() {
        this.translation = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.filename = file;
    }

    public boolean save() {
        try {
            BufferedWriter filewriter = new BufferedWriter(new FileWriter(this.filename, false));
            for (Entry<String, String> entry : this.translation.entrySet()) {
                filewriter.write(entry.getKey() + ":" + entry.getValue());
                // System.out.println(entry.getKey() + ":" + entry.getValue());
                filewriter.newLine();
            }
            filewriter.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.filename))
                    .map(row -> row.split(":"))
                    .forEach(parts -> {
                        this.translation.put(parts[0], parts[1]);
                    });
            return true;
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

    public void delete(String word) {
        this.translation.remove(word);
        this.translation.remove(this.translate(word));
    }
}
