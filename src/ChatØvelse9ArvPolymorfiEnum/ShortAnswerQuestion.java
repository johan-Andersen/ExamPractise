package ChatØvelse9ArvPolymorfiEnum;

public class ShortAnswerQuestion extends Question {

    private String answer;

    public ShortAnswerQuestion(String text, int points) {
        super(text, points);
        this.answer = null;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
