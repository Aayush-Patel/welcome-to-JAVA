package LAB;

import java.util.Scanner;

/**
 * Name: Aayush Patel
 * Date: October 22, 2023
 * Lab 5 - Part 1
 * This program generates an array with 100 random integers and allows the user to
 * enter an index to display the corresponding element value. It handles ArrayIndexOutOfBoundsException.
 */

/**
 * 12.3 (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
 * Creates an array with 100 randomly chosen integers
 * Prompts the user to enter the index of the array, then displays the corresponding element value.
 * If the specified index is out of bounds, display the message Out of Bounds.
 */

public class lab5Part1 {
	  public static void main(String[] args) {
		  
		  // Create an array to store random integers
	        int[] randomArray = new int[100];
	        
	     // Generate and populate the array with random integers
	        for (int i = 0; i < randomArray.length; i++) {
	            randomArray[i] = (int) (1 + Math.random() * 10_000);
	        }
	        // Create a scanner to take user input
	        Scanner input = new Scanner(System.in);
	        
	        // Try to access and print the value at the specified index
	        System.out.println("Enter an index in the array for which to display it's value: ");

	        try {
	        	// Read the index from the user
	            int indexValue = input.nextInt();
	            System.out.println(randomArray[indexValue]);

	        } catch (ArrayIndexOutOfBoundsException ex) {
	        	// Handle the exception if the specified index is out of bounds
	            System.out.println("Out Of Bounds");
	        }
	     // Close the input scanner
	        input.close();
	    }

}
