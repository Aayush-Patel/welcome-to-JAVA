package chapter2;

import java.util.Scanner;

public class Projectprojectile {

	public static void main(String[] args) {
		/** This program will prompt the user to enter the number of years
         * and display the population after the numbers of years.
         */
        
        int currentPopulation = 312_032_486;

        Scanner projectile = new Scanner(System.in);
        
        System.out.print("Enter the number of years to display the population growth: ");

        int numberOfYears =projectile.nextInt();

        double secondsInYear = 365 * 24 * 60 * 60;

        int birthsPerYear = (int) secondsInYear / 7;
        
        int deathsPerYear = (int) secondsInYear / 13;
        
        int immigrantsPerYear = (int) secondsInYear / 45;

        for (int i = 1; i <= numberOfYears; i++) {
        	
            currentPopulation += birthsPerYear + immigrantsPerYear - deathsPerYear;
        }
        System.out.println("The population in " + numberOfYears + " years is " +  currentPopulation);
        
        System .out.println("Program population projection close 2.11");
        
        projectile.close();
		
	}

}
