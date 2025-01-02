package ChatØvelse9ArvPolymorfiEnum;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Question> list = new ArrayList<>();

        ArrayList<String> multipleChoice = new ArrayList<>();
        multipleChoice.add("1. Denmark");
        multipleChoice.add("2. Norway");
        multipleChoice.add("3. Sweden");
        list.add(new MultipleChoiceQuestion("Which country has the largest area", 5, multipleChoice, 0));
        list.add(new TrueFalseQuestion("are dogs mammels?", 1, true));
        list.add(new ShortAnswerQuestion("What is the german heavy metal band called who made the song 'sonne'?", 2, "ramstein"));

        Quiz quiz = new Quiz(list);




    }


}

