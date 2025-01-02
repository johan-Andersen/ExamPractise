package ChatØvelse9ArvPolymorfiEnum;

public class TrueFalseQuestion extends Question {

    private boolean answer;

    public TrueFalseQuestion(String text, int points, boolean answer) {
        super(text, points);
        this.answer = answer;

    }

    @Override
    public String toString() {
        return super.toString() + ", Choice: " + answer;
    }

}
