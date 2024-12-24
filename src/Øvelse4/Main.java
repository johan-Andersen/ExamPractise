package Øvelse4;

public class Main {


    public static void main(String[] args) {

        Keyword keyword = new Keyword("Dog", "Animal");
        keyword.keyWords("Mammel");

        System.out.println(keyword.udskriv());

        Keyword keyword1 = new Keyword("Snake", "Animal");
        keyword1.keyWords("reptile");

        System.out.println(keyword1.udskriv());

    }


}
