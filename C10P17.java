package Chapter10;

import java.math.BigInteger; 
import java.util.Arrays;

/**
 * Name: Aayush Patel
 * Date: September 11 
 * 10.17 (Square numbers) Find the first ten square numbers that are greater than
 * Long.MAX_VALUE. A square number is a number in the form of n2. For example, 4, 9, and 16 are square numbers.
 * Find an efficient approach to run your program fast.
 */

public class C10P17 {

	public static void main(String[] args) {
		// Start with the biggest number a 'long' data type can hold.
		
		BigInteger maxLongVal = BigInteger.valueOf(Long.MAX_VALUE );
		// Initialize a counter for how many square numbers we've found.
		
		int count = 0;
		// Calculate the square root of the biggest long number and convert it to a big number.
		
		long rootNum = (long) Math.sqrt(maxLongVal.doubleValue());
		BigInteger root = BigInteger.valueOf(rootNum);
		  // Prepare a place to store the first 10 square numbers bigger than Long.MAX_VALUE.
		
        BigInteger[] result = new BigInteger[10];
        // Keep searching until we find 10 such square numbers.
        
        while (count < 10) {
        	 // Move to the next potential square root.
        	
            root = root.add(BigInteger.ONE);
         // Calculate the square of this potential root.
            
            BigInteger n2 = root.pow(2);
            // Check if it's bigger than Long.MAX_VALUE.
            
            if (n2.compareTo(maxLongVal) > 0) {
            	// If yes, store it in the result array and count it.
                result[count] = n2;
                count++;
            }

        }
        // Print the biggest long value.
        System.out.println("LongMaxValue = " + Long.MAX_VALUE);
        
        // Print the square numbers that are larger than Long.MAX_VALUE.
        System.out.println("The square numbers greater than LongMaxValue are: ");
        
        System.out.println(Arrays.toString(result));
	}

}
