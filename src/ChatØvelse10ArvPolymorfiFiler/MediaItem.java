package ChatØvelse10ArvPolymorfiFiler;

public class MediaItem {

    private String title;
    private double duration;

    public MediaItem(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Title: " + title + ", Duration: " + duration;
    }
}
