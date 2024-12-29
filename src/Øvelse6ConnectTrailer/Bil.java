package Øvelse6ConnectTrailer;

public class Bil {

    private Trailer trailer;
    private double vægt;

    public Bil(double vægt)  {
        this.vægt = vægt;
        this.trailer = null;
    }

    public double totalVægt() {
        return vægt + trailer.getVægt();
    }

    public void setTrailer(Trailer trailer) {

        if((vægt + trailer.getVægt()) <= 3500) {
            this.trailer = trailer;
        }
        else {
            throw new RuntimeException("The total weight exceeds the allowed 3500kg");
        }
    }
}
