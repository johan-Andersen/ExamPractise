package Øvelse17;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Johan", "SF", 1000));
        candidates.add(new Candidate("Emil", "A", 1000));

        Election election = new Election(candidates);

        System.out.println(election.getCandidatesFromParty());
        System.out.println(election.getTotalVotes());


    }

}
