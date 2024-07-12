package LAB;

import java.util.Scanner;

/**
 * Name: Aayush Patel
 * Date: October 22, 2023
 * Lab 5 - Part 2
 * This program converts a binary string into a decimal number, with error handling for invalid binary strings.
 */

/**
 * *12.7 (NumberFormatException) Write the bin2Dec(String binaryString)
 * method to convert a binary string into a decimal number. Implement the
 * bin2Dec method to throw a NumberFormatException if the string is not a
 * binary string.
 */

public class lab5part2 {

	 public static void main(String[] args) {
		 // Test the bin2Dec method
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter a binary number as a string: ");
	        String bStr = in.nextLine().trim();
	        try {

	            System.out.println("Binary number: " + bStr + " converted to decimal is " + bin2Dec(bStr));

	        } catch (NumberFormatException numberFormatException) {
	            System.out.println("Runtime Exception Caught: " + numberFormatException.getMessage());
	        }
	        in.close();


	    }
	 /**
	     * Converts a binary string to a decimal number.
	     * Throws a NumberFormatException if the string is not a binary string.
	     *
	     * @param binaryString The binary string to be converted.
	     * @return The decimal equivalent of the binary string.
	     */
	 
	  public static int bin2Dec(String binaryString) {
	        int decimalValue = 0;
	        // Check if the binary string contains invalid characters
	        if (!checkBinaryChars(binaryString)) {
	            throw new NumberFormatException("Binary String contains invalid characters.");
	        }
	        char[] binChars = binaryString.toCharArray();
	        // Calculate the decimal value of the binary string
	        for (int i = binChars.length - 1, binaryIndex = 0; i >= 0; i--, binaryIndex++) {
	            decimalValue += getBinaryValue(binChars[i], binaryIndex);
	        }


	        return decimalValue;
	    }
	  /**
	     * Checks if the given binary string contains only '0' and '1' characters.
	     *
	     * @param binaryString The binary string to check.
	     * @return True if the binary string is valid, otherwise false.
	     */
	  static boolean checkBinaryChars(String binaryString) {
	        char[] binStrValues = binaryString.toCharArray();
	        for (char c : binStrValues) {
	            if (c != '0' && c != '1') {
	                return false;
	            }
	        }
	        return true;
	    }
	  /**
	     * Calculates the decimal value of a binary character (0 or 1) at a specific index.
	     *
	     * @param binaryChar The binary character.
	     * @param index      The index of the binary character in the string.
	     * @return The decimal value of the binary character.
	     */

	    static int getBinaryValue(char binaryChar, int index) {
	        int weight = (int) Math.pow(2, index);
	        if (binaryChar == '1') {
	            return weight;
	        }
	        return 0;
	    }


	}
