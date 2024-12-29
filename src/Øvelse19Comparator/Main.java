package Øvelse19Comparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {




        ArrayList<Dream> arrayList = new ArrayList<>();

        arrayList.add(new Dream(10, "mareridt", "2024-12-12"));
        arrayList.add(new Dream(2, "neutral", "2023-01-01"));
        arrayList.add(new Dream(11, "problemløsende", "2023-10-10"));

        Dream test = new Dream(1, "mareridt", "2025-02-02");

        System.out.println(test.sort(arrayList));

        System.out.println(test.isPleasant());


    }
}
