package ChatØvelse9ArvPolymorfiEnum;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Question> quizList = new ArrayList<>();

        quizList.add(new MultipleChoiceQuestion("how many sides does a triangle have? 1: 1, 2: 5, 3: 3", 1));
        quizList.add(new TrueFalseQuestion("Are horses blue?", 1));
        quizList.add(new ShortAnswerQuestion("who has the biggest podcast worldwide?", 5));

        Quiz quiz = new Quiz(quizList);






    }

}
