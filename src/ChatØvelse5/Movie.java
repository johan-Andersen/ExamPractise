package ChatØvelse5;

public class Movie {

    private String titel;
    private int år;
    private int rating;


    public Movie(String titel, int år, int rating) {
        this.titel = titel;
        this.år = år;
        this.rating = rating;
    }

    public String getTitel() {
        return titel;
    }

    public int getÅr() {
        return år;
    }

    public int getRating() {
        return rating;
    }


    @Override
    public String toString() {
        return "Titel: " + titel + ", År: " + år + ", Rating: " + rating + "\n";
    }
}
