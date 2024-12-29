package Øvelse17StringBuilder;

import java.util.List;

public class Election {

    private List<Candidate> candidateList;

    public Election (List<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    public int getTotalVotes() {

        int count = 0;
        for(Candidate c : candidateList) {
            count += c.getNumberOfVotes();
        }
        return count;
    }

    public StringBuilder getCandidatesFromParty() {

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < candidateList.size(); i++) {

            builder.append(candidateList.get(i).getName());

            if(i < candidateList.size() - 1) {
                builder.append(", ");
            }
        }
        return builder;
    }


}
