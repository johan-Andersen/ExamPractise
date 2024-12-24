package Øvelse10;

public class BMI {

    private double height;
    private double weight;

    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }


    public double calculate() {
        double BMI = weight / Math.pow(height / 100, 2);
        return BMI;
    }

    public boolean isUnderWeight() {

        if(calculate() < 18.5) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isNormalWeight() {

        if(calculate() >= 18.5 && calculate() < 25) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isOverWeight() {

        if(calculate() >= 25) {
            return true;
        }
        else {
            return false;
        }
    }


}
