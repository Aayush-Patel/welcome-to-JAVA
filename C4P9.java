package chapter4;

import java.util.Scanner;

public class C4P9 {
/** Aayush Patel
 * 28 jun 
 * This program will prompt user to type in a Character
 * and will display  character's Unicode
 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		 System.out.println("Enter a character: ");
		 
	        String s = in.next("[A-Za-z\\d]");
	        
	        char myChar = s.charAt(0);
	        
	        System.out.println("The Unicode for the character " + myChar + " is " + (int) myChar);
	        
	        in.close();
	         
	        System.out.println("Program complete");
	}

}
