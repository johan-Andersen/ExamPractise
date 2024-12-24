package Øvelse5;

public class Card {

    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }


    private int getValue() {
        return value;
    }

    public boolean beats(Card card) {

        if(rank(suit) > card.rank(card.suit)) {
            return true;
        }
        else if(rank(suit) < card.rank(card.suit)) {
            return false;
        }
        else {
            if (value > card.getValue()) {
                return true;
            } else {
                return false;
            }
        }
    }

    private int rank(String card) {

        switch(card) {
            case "hearts" :
                return 4;
            case "diamonds" :
                return 3;
            case "clubs" :
                return 2;
            case "spades" :
                return 1;
            default:
                return 0;
        }
    }




}
