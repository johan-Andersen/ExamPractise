package ChatØvelse9ArvPolymorfiEnum;

import java.util.List;

public class Quiz {

    private List<Question> questionList;

    public Quiz(List<Question> questionList) {
        this.questionList = questionList;
    }

    public int runQuiz() {

        StringBuilder stringBuilder = new StringBuilder();

        for(Question q : questionList) {

           answer();

        }
    }

    private void answer(String answer, Question q) {

        if(q instanceof MultipleChoiceQuestion) {

            ((MultipleChoiceQuestion) q).setAnswer(Integer.parseInt(answer));

        } else if (q instanceof TrueFalseQuestion) {

            ((TrueFalseQuestion) q).setAnswer(Boolean.parseBoolean(answer));

        } else if (q instanceof ShortAnswerQuestion) {
            ((ShortAnswerQuestion) q).setAnswer(answer);
        }

    }

}
