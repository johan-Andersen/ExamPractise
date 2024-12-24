package Øvelse4;

import java.util.ArrayList;

public class Keyword {

    private String name;
    private String description;
    private ArrayList<String> seeAlso;

    public Keyword(String name, String description) {
        this.name = name;
        this.description = description;
        this.seeAlso = new ArrayList<>();
    }

    public void keyWords(String word) {
        seeAlso.add(word);
    }
    public String udskriv() {

        if(!seeAlso.isEmpty()) {
            return "Word: " + name + ", definition: " + description + ", keywords: " + seeAlso + "\n";
        }
        else {
            return "Word: " + name + ", definition: " + description + "\n";
        }
    }
}
