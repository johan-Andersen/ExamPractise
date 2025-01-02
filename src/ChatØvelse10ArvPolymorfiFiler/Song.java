package ChatØvelse10ArvPolymorfiFiler;

public class Song extends MediaItem {

    private String genre;

    public Song(String title, double duration, String genre) {
        super(title, duration);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + "Genre: "  + genre;
    }
}
