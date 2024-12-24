package Øvelse10;

public class Main {

    public static void main(String[] args) {

        BMI bmi = new BMI(192, 60);

        System.out.println(bmi.calculate());

        System.out.println(bmi.isUnderWeight());
        System.out.println(bmi.isNormalWeight());
        System.out.println(bmi.isOverWeight());

    }

}
