package Øvelse8;

public class Main {

    public static void main(String[] args) {

        DateAgeCalculator dateAgeCalculator = new DateAgeCalculator(22, 19);

        System.out.println(dateAgeCalculator.acceptableAge());

        System.out.println(dateAgeCalculator.tooYoungOrNot());


    }

}
