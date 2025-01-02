package Øvelse20;

public class Car {

    private String model;
    private String color;
    private int mileage;
    private int wheels;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.mileage = 0;
        this.wheels = 4;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void newMileage(int miles) {
        this.mileage += miles;
    }




}
