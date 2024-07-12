package Chapter13;
import java.util.Scanner;

/**
 * **13.1 (Triangle class) Design a new Triangle class that extends the abstract
 * GeometricObject class. Draw the UML diagram for the classes Triangle
 * and GeometricObject and then implement the Triangle class. Write a test
 * program that prompts the user to enter three sides of the triangle, a color, and a
 * Boolean value to indicate whether the triangle is filled. The program should create
 * a Triangle object with these sides and set the color and filled properties using
 * the input. The program should display the area, perimeter, color, and true or false
 * to indicate whether it is filled or not.
 */

abstract class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        color = "white";
        filled = false;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class C13P1 {
    public static void main(String[] args) {
        double side1, side2, side3;
        String color = "";
        boolean isFilled;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please Enter the 3 sides of the triangle now: ");
            side1 = input.nextDouble();
            side2 = input.nextDouble();
            side3 = input.nextDouble();

            // Check if the sides form a valid triangle
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                System.out.println("Now enter a color followed by true or false for if the triangle is filled: ");
                color = input.next();
                isFilled = input.nextBoolean();
            } else {
                System.out.println("The entered sides do not form a valid triangle.");
                return;
            }
        }

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setFilled(isFilled);
        triangle.setColor(color);

        System.out.println("The area of the triangle is " + triangle.getArea() +
                "\nThe Perimeter of the triangle is " + triangle.getPerimeter() +
                "\nIts color is currently " + triangle.getColor() +
                "\nIts filled status is currently " + triangle.isFilled());
    }
}
