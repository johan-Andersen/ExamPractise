package ChatØvelse5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> arrayList = new ArrayList<>();
        MovieManager movieManager = new MovieManager(arrayList);

        Movie badguys = new Movie("Bad Guys", 2002, 6);
        Movie harrypotter = new Movie("Harry potter", 2004, 10);
        Movie wardogs = new Movie("War Dogs", 2010, 10);

        movieManager.addMovie(badguys);
        movieManager.addMovie(harrypotter);
        movieManager.addMovie(wardogs);

        System.out.println(movieManager.printMovies());


    }


}
