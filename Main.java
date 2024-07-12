package ch_13.exercise13_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * Name: Aayush Patel
 * Date: Dec 3 
 *(The Octagon class) Write a class named Octagon that extends
 * GeometricObject and implements the Comparable and Cloneable interfaces.
 * Assume that all eight sides of the octagon are of equal length. The area can
 * be computed using the following formula:
 * area = (2 + 4/22)* side * side
 * Draw the UML diagram that involves Octagon, GeometricObject,
 * Comparable, and Cloneable.
 * @see Octagon
 * <p>
 * Write a test program that creates an Octagon
 * object with side value 5 and displays its area and perimeter. Create a new object
 * using the clone method and compare the two objects using the compareTo
 * method.
 */

// Abstract class representing a geometric object
abstract class GeometricObject {
    abstract double getArea(); // Abstract method to calculate the area
}

// Circle class, a subclass of GeometricObject
class Circle extends GeometricObject {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method to calculate the area for a Circle
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    // String representation of a Circle for display purposes
    @Override
    public String toString() {
        return String.format("Circle\t\t%.2f\t\tradius %.2f", getArea(), radius);
    }
}

// Rectangle class, a subclass of GeometricObject
class Rectangle extends GeometricObject {
    private double height;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Implementation of the abstract method to calculate the area for a Rectangle
    @Override
    double getArea() {
        return height * width;
    }

    // String representation of a Rectangle for display purposes
    @Override
    public String toString() {
        return String.format("Rectangle\t%.2f\t\theight %.2f, width %.2f", getArea(), height, width);
    }
}

// Octagon class, a subclass of GeometricObject
class Octagon extends GeometricObject {
    private double side;

    // Constructor for Octagon
    public Octagon(double side) {
        this.side = side;
    }

    // Implementation of the abstract method to calculate the area for an Octagon
    @Override
    double getArea() {
        return 2 * (1 + Math.sqrt(2)) * side * side;
    }

    // String representation of an Octagon for display purposes
    @Override
    public String toString() {
        return String.format("Octagon\t\t%.2f\t\tside %.2f", getArea(), side);
    }
}

// Main class where the program execution begins
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store geometric objects
        ArrayList<GeometricObject> shapes = new ArrayList<>();

        // Create a Random object to generate random values
        Random random = new Random();

        // Generate 10 random geometric objects and add them to the list
        for (int i = 0; i < 10; i++) {
            int choice = random.nextInt(3);
            switch (choice) {
                case 0:
                    shapes.add(new Circle(random.nextDouble() * 9 + 1));
                    break;
                case 1:
                    shapes.add(new Rectangle(random.nextDouble() * 4 + 1, random.nextDouble() * 4 + 1));
                    break;
                case 2:
                    shapes.add(new Octagon(random.nextDouble() * 4 + 1));
                    break;
            }
        }

        // Sort the list of shapes based on area in descending order
        Collections.sort(shapes, Comparator.comparingDouble(GeometricObject::getArea).reversed());

        // Display the sorted list with object type, total area, and variable(s)
        System.out.println("Object Type\tTotal Area\tVariable(s)");
        for (GeometricObject shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
