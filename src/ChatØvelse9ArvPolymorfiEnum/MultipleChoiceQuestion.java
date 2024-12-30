package ChatØvelse9ArvPolymorfiEnum;

public class MultipleChoiceQuestion extends Question {

    private int answer;

    public MultipleChoiceQuestion(String text, int points) {
        super(text, points);
        this.answer = 0;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question: " + getText() + ", Points: " + getPoints();
    }

}
