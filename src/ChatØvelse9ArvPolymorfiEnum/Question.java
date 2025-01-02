package ChatØvelse9ArvPolymorfiEnum;

public abstract class Question {

    private String text;
    private int points;

    public Question(String text, int points) {
        this.text = text;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Question: " + text + ", Points: " + points;
    }


}
