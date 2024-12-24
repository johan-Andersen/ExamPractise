package Øvelse1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        Tekst tekst = new Tekst(arrayList);

        tekst.tilføj("johan");
        tekst.tilføj("johan");
        tekst.tilføj("johan");
        tekst.tilføj("malek");
        tekst.tilføj("mau");
        tekst.tilføj("Mau");



        System.out.println(tekst.findAntalUnikke());


    }


}
