package ChatØvelse9ArvPolymorfiEnum;

public class ShortAnswerQuestion extends Question {

    private String answer;

    public ShortAnswerQuestion(String text, int points, String answer) {
        super(text, points);
        this.answer = answer;
    }


    @Override
    public String toString() {
        return super.toString() + ", Answer: " + answer;
    }

}
