package Chapter5;

public class Lab5Part1 {
	/**
	 * 5.3 (Conversion from kilograms to pounds)
	 * Write a program that displays the following table (note that 1 kilogram is 2.2 pounds):
	 * Kilograms Pounds
	 * 1 2.2
	 * 3 6.6
	 * 197 433.4
	 * 199 437.8
	 * Name Aayush PAtel
	 * Date July 11 2023
	 */
	    public static void main(String[] args) {

	        final double POUNDS_PER_KILOGRAM = 2.2;
	        
	        System.out.println("Kilograms      Pounds");
	        
	        for (int i = 1; i <= 199; i += 2) {
	        	
	            System.out.printf(
	            		
	                    "%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM));
	            
	     
	        }
	        
	        System.out.println ("Program complete");
	    }
	    }
