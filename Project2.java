package chapter2;

import java.util.Scanner;

public class Project2 {
// Programmer Aayush Patel
	
	// Date June 19 2023
	
	// This program will reads Celsius value from the console and convert into fahrenheit.
	
	
	public static void main(String[] args) {
		
		System.out.println(" Convert Celsius to Fahrenheit 2.1");
		
		double Celsius; 
		
		double Fahrenheit;
		
		System.out.println("Enter degrees in Celsius");
		
		Scanner input = new Scanner(System.in);
		
		Celsius = input.nextDouble();
		
		Fahrenheit = (9.0/5.0 * Celsius + 32);

		System.out.println(Fahrenheit + "F");
		
		
		System.out.println("Convert celsius to Fahrenheit programe close 2.1");
		
		System.out.println("Start of Program Convert Feet to Meters 2.3");
		
		/**  This program will read a number in feet and will convert
		 * that given number to meters, and will display the result.
		 */
	
		 Scanner meter = new Scanner(System.in);

	        System.out.println("Enter a value for number of feet now: ");

	        double numFeet = input.nextDouble();
	        
	        double numMeters = numFeet * 0.305;

            System.out.println(numFeet + " feet is equal to " + numMeters + " meters");
	        
	        System.out.println("Convert Feet to meters program close 2.3");
	        
	        System.out.println("Start of program population projection 2.11");
	        
	        /** This program will prompt the user to enter the number of years
	         * and display the population after the numbers of years.
	         */
	        
	        int currentPopulation = 312_032_486;

	        Scanner projectile = new Scanner(System.in);
	        
	        System.out.print("Enter the number of years to display the population growth: ");

	        int numberOfYears = input.nextInt();

	        double secondsInYear = 365 * 24 * 60 * 60;

	        int birthsPerYear = (int) secondsInYear / 7;
	        
	        int deathsPerYear = (int) secondsInYear / 13;
	        
	        int immigrantsPerYear = (int) secondsInYear / 45;

	        for (int i = 1; i <= numberOfYears; i++) {
	        	
	            currentPopulation += birthsPerYear + immigrantsPerYear - deathsPerYear;
	        }
	        System.out.println("The population in " + numberOfYears + " years is " +  currentPopulation);
	        
	        System .out.println("Program population projection close 2.11");
	        
	        input.close();
	        meter.close();
	        projectile.close();

	}

}
