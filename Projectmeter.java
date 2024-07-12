package chapter2;

import java.util.Scanner;

public class Projectmeter {

	public static void main(String[] args) {
		/**  This program will read a number in feet and will convert
		 * that given number to meters, and will display the result.
		 */
	
		 Scanner meter = new Scanner(System.in);

	        System.out.println("Enter a value for number of feet now: ");

	        double numFeet = meter.nextDouble();
	        
	        double numMeters = numFeet * 0.305;

            System.out.println(numFeet + " feet is equal to " + numMeters + " meters");
	        
	        System.out.println("Convert Feet to meters program close 2.3");
	        
meter.close();
	}

}
