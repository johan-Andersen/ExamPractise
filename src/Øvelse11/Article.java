package Øvelse11;

import java.util.ArrayList;

public class Article {

    private String heading;
    private String body;
    private String author;

    public Article (String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getLongestWord() {

        String[] splitted = body.split(" ");
        String longestWord = "";

        for(String word : splitted) {

            String cleanWord = word.replaceAll("[^a-zA-Z]", "");

            if(cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }
        return longestWord;
    }




}
