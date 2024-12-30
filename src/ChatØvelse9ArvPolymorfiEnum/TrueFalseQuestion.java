package ChatØvelse9ArvPolymorfiEnum;

public class TrueFalseQuestion extends Question {

    private boolean answer;


    public TrueFalseQuestion(String text, int points) {
        super(text, points);
        this.answer = false;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
