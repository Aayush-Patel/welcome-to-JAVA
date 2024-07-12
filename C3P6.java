package Chapter6;

import java.util.Scanner;

/**
 * Name Aayush Patel
 * Date July 12
 * 6.3 (Palindrome integer) Write the methods with the following headers
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 * public static int reverse(int number)
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome.
 * A number is a palindrome if its reversal is the same as itself.
 * Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 */

public class C3P6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
        System.out.println("Enter an integer: ");
        
        int num = in.nextInt();
        
     // Check if the entered number is a palindrome
        
        if (isPalindrome(num)) {
        	
            System.out.println("Is a palindrome");
            
        } else {
        	
            System.out.println("Is not a palindrome");
        }
    }
	 // Method to reverse the digits of a number
	
    public static int reverse(int number) {
        String temp = "";
        
        while (number > 0) {
        	
        	// Extract the last digit of the number
        	
            int t = number % 10;
            
         // Remove the last digit from the number
            
            number /= 10;
            
            // Append the last digit to the temporary string
            
            temp += t;

        }
     // Convert the reversed string back to an integer and return it
        
        return Integer.parseInt(temp);
    }
 // Method to check if a number is a palindrome
    
    public static boolean isPalindrome(int number) {
    	
    	 // Convert the number to a string
    	
        String n1 = String.valueOf(number);
        
     // Get the reversed number as a string
        
        String n2 = String.valueOf(reverse(number));
        
     // Compare the original number and the reversed number
        
        return n1.equals(n2);


	}

}
