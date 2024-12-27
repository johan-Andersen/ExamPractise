package Øvelse16;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExamQuestion {

    private int number;
    private char grade;

    public ExamQuestion(int number) {
        this.number = number;
        this.grade = grade();
    }

    private char grade() {
        Random random = new Random();
        return getGrade(random.nextInt(6) + 1);
    }

    private char getGrade(int number) {

        switch (number) {
            case 1:
                return 'A';
            case 2:
                return 'B';
            case 3:
                return 'C';
            case 4:
                return 'D';
            case 5:
                return 'E';
            case 6:
                return 'F';
            default:
                return 'X';
        }
    }

    public void saveToFile(ArrayList<ExamQuestion> arrayList) {

        try {
            PrintWriter writer = new PrintWriter("questions.txt");
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            PrintStream output = new PrintStream(new FileOutputStream("questions.txt", true));

            for(ExamQuestion question : arrayList) {
                output.println(question);
            }
            output.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String loadFile() {

        StringBuilder stringBuilder = new StringBuilder();

        try {
            Scanner scanner = new Scanner(new File("questions.txt"));

            while (scanner.hasNextLine()) {

                stringBuilder.append(scanner.nextLine()).append("\n");

            }
            scanner.close();

        } catch (FileNotFoundException fnfe) {
            throw new RuntimeException(fnfe);
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Exam number: " + number + ", Exam grade: " + grade;
    }


}
