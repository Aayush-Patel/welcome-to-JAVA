package Chapter5;

public class Project5Part3 {

	public static void main(String[] args) {
		/**
		 * **5.33 (Perfect number) A positive integer is called a perfect number if it is equal to
		 * the sum of all of its positive divisors, excluding itself. For example, 6 is the first
		 * perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
		 * + 1. There are four perfect numbers less than 10,000. Write a program to find all
		 * these four numbers
		 * Name Aayush Patel
		 * date July 11 
		 */
				// Find perfect numbers less than 10,000

				// Iterate through numbers from 6 to 10,000
		
		 for (int number = 6; number <= 10000; number++) {
			 
			// Variable to hold the sum of divisors
			 
	            int total = 0;
	         // Start with the number minus 1
	            
	            int divisor = number - 1;
	         // Start with the number minus 1
	            while (divisor > 0) {
	            	
	         // Check if the current number is divisible by the current divisor
	            	
	                if (number % divisor == 0) {
	                	// Add the divisor to the total sum
	                	
	                    total += divisor;
	                }
	             // Move to the next divisor
	                divisor--;
	            }
	         // Check if the number is a perfect number
	            if (number == total) {
	            	
	            	// Print the perfect number
	                System.out.println(number);
	}
		 }
	}
}
