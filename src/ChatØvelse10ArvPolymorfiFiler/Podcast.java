package ChatØvelse10ArvPolymorfiFiler;

public class Podcast extends MediaItem {

    private String topic;

    public Podcast(String title, double duration, String topic) {
        super(title, duration);
        this.topic = topic;
    }

    @Override
    public String toString() {
        return super.toString() + ", Topic: " + topic;
    }
}
