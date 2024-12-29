package Øvelse5CardVsCard;

public class Main {

    public static void main(String[] args) {

        Card card = new Card("hearts", 10);
        Card card2 = new Card("diamonds", 12);
        Card card3 = new Card("spades", 12);
        Card card4 = new Card("spades", 11);
        Card card5 = new Card("clubs", 1);


        System.out.println(card.beats(card2));
        System.out.println(card2.beats(card3));
        System.out.println(card3.beats(card4));
        System.out.println(card4.beats(card5));



    }

}
