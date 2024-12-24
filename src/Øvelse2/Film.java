package Øvelse2;

import java.time.Year;

public class Film {

    private String filmtitel;
    private int udgivelsesår;
    private Producer producer;

    public Film(String filmtitel, int udgivelsesår, Producer producer) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
        this.producer = producer;
    }

    public Film(String filmtitel) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = Year.now().getValue();
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }



}
