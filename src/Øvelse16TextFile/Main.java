package Øvelse16TextFile;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ExamQuestion> arrayList = new ArrayList<>();
        for(int i = 1; i < 15; i++) {
            arrayList.add(new ExamQuestion(i));
        }

        ExamQuestion examQuestion = new ExamQuestion(0);

        examQuestion.saveToFile(arrayList);

        System.out.println(examQuestion.loadFile());


    }

}
