package Øvelse18;

public class Audio extends Media {

    private String loudness;

    public Audio(String name, double duration, String loudness) {
        super(name, duration);
        this.loudness = loudness;
    }


    @Override
    public String toString() {
        return "Name: " + getName() + ", Duration: " + getDuration() + ", Loudness: " + loudness;
    }

}
