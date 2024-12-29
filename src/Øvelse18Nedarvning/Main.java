package Øvelse18Nedarvning;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Media> list = new ArrayList<>();

        list.add(new Audio("Clara", 1000 , "very loud"));
        list.add(new Video("emil", 1000, "annoying"));

        Media media = new Audio("mor", 1, "loud");

        System.out.println(media.info(list));

    }

}
