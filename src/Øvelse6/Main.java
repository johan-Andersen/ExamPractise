package Øvelse6;

public class Main {

    public static void main(String[] args) {

        Trailer trailer = new Trailer(5000);
        Bil bil = new Bil(2000);

        bil.setTrailer(trailer);
        System.out.println(bil.totalVægt());


    }

}
