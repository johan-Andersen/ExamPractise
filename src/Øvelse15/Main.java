package Øvelse15;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Square(12));
        shapes.add(new Square(1.4));
        shapes.add(new Square(9));
        shapes.add(new Circle(1));
        shapes.add(new Circle(12.3));
        shapes.add(new Circle(3.14));

        for(Shape shape : shapes) {

            DecimalFormat format = new DecimalFormat(".00");

            System.out.println("Area: " + format.format(shape.getArea()));
        }

    }

}
