package ChatØvelse5;

import java.util.Comparator;

public class sortByYearComparator implements Comparator<Movie> {


    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.compare(o1.getÅr(), o2.getÅr());
    }
}
