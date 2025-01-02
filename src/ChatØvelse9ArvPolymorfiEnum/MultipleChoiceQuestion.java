package ChatØvelse9ArvPolymorfiEnum;

import java.util.List;

public class MultipleChoiceQuestion extends Question {

    private List<String> choices;
    private int answer;

    public MultipleChoiceQuestion(String text, int points, List<String> choices, int answer) {

        super(text,points);
        this.choices = choices;
        this.answer = answer;
    }


    @Override
    public String toString() {
        return super.toString() + ", Choices: " + choices + ", Answer: " + answer;
    }

}
