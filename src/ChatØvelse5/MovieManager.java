package ChatØvelse5;

import java.util.ArrayList;
import java.util.Comparator;

public class MovieManager {

    private ArrayList<Movie> movieListe;

    public MovieManager(ArrayList<Movie> movieListe) {
        this.movieListe = movieListe;
    }

    public void addMovie(Movie movie) {
        movieListe.add(movie);
    }

    public ArrayList<Movie> sortByYear() {

        Comparator comparatorYear = new sortByYearComparator();

        movieListe.sort(comparatorYear);

        return movieListe;
    }

    public ArrayList<Movie> sortByRatingDescending() {

        Comparator comparatorRating = new sortByRatingComparator();

        movieListe.sort(comparatorRating);

        return movieListe;

    }

    public ArrayList<Movie> printMovies() {

        return movieListe;

    }


    @Override
    public String toString() {
        for(Movie movie : movieListe) {
            return "Titel: " + movie.getTitel() + ", År: " + movie.getÅr() + ", Rating: " + movie.getRating() + "\n";

        }
        return "";
    }
}
