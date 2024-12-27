package Øvelse17;

import Øvelse5.Card;

public class Candidate {

    private String name;
    private String party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes) {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return "Name: " + name + ", Party: " + party + ", Number of votes: " + numberOfVotes;

    }


}
