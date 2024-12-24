package Øvelse3;

import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {

    private int antalTerninger;
    private ArrayList<Integer> sidsteKast;

    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
        this.sidsteKast = new ArrayList<>();
    }

    public int ryst() {

        Random random = new Random();
        sidsteKast.clear();
        int øjne = 0;

        for(int i = 0; i < antalTerninger; i++) {
            int terning = random.nextInt(6)+1;
            sidsteKast.add(terning);
            øjne += terning;
        }
        return øjne;
    }

    public ArrayList<Integer> se() {

        return sidsteKast;
    }
}
