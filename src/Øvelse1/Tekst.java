package Øvelse1;

import java.util.ArrayList;

public class Tekst {

    private ArrayList<String> tekstLinjer;

    public Tekst(ArrayList<String> tekstLinjer) {
        this.tekstLinjer = tekstLinjer;
    }

    public void tilføj(String tekststreng) {
        tekstLinjer.add(tekststreng);
    }

    public int findAntalUnikke() {


        int resultat = 0;
        for(int i = 0; i < tekstLinjer.size(); i++) {
            int current = i;
            int count = 0;

            for(int j = 0; j < tekstLinjer.size(); j++) {

                if(tekstLinjer.get(current).equals(tekstLinjer.get(j))) {
                    count++;
                }
            }
            if(count == 1) {
                resultat++;
            }
        }
        return resultat;
    }



}
