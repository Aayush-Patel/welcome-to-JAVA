package Chapter5;

public class C5P6 {

	public static void main(String[] args) {
		/**
		 * 5.6 (Conversion from miles to kilometers) Write a program that displays the following two tables side by side:
		 * Miles Kilometers | Kilometers Miles
		 * Name Aayush Patel
		 * Date 5 jul
		 */
	
/** Defines a constant with a value of 1.609, Representing the conversion 
 * factor from miles to Km
 */
		        final double Kilo_Per_Mile = 1.609;

// Will print the header for the distance conversion table 
		        System.out.println("Miles       Kilometers  |  Kilometers     Miles");
		        
//Loop to generate distance conversions
		        for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) {

// Convert and print miles to Km
		            System.out.printf("%-11d%10.3f", i, (i * Kilo_Per_Mile));
		            
// separator between columns	           
		            System.out.print("   |   ");
		            
// convert and print Km to Miles 		            
		            System.out.printf("%-15d%-6.3f\n", j, (j / Kilo_Per_Mile));
		            
		            
		       //     System.out.println("Program complete");
	}
		        
			          System.out.println("Program complete");
	}
	}
