package chapter4;

import java.util.Scanner;

public class ProjectGeometry {

	public static void main(String[] args) {
		/**
		 * 4.1 (Geometry: area of a pentagon) Write a program that prompts
		 * the user to enter the length from the center of a pentagon
		 * to a vertex and computes the area of the pentagon, as shown in the
		 * following figure.
		 * Programmer Aayush Patel
		 * Date jul 4
		 */
		double r, s, area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length from the center of the pentagon"
                + " to the vertex: ");

        r = input.nextDouble();

        s = 2 * r * Math.sin(Math.PI / 5);

        area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is: %2.2f ", area);
            
input.close();
	}

}
