package LAB;

import static Chapter10.MyInteger.parseInt;

import java.util.Scanner;

import Chapter10.MyInteger;

public class lab3part1 {

	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner input = new Scanner(System.in);
	        
	        // Create two MyInteger objects for testing
	        MyInteger testObj = new MyInteger(123);
	        MyInteger testObj2 = new MyInteger(24);
	        String str = "";

	        // Check if the first MyInteger object is even, odd, or prime
	        if (testObj.isEven()) {
	            str += "Even";
	        } else if (testObj.isOdd()) {
	            str += "Odd";
	        } else if (testObj.isPrime()) {
	            str += "Prime";
	        }
	        
	        // Display the result of the first MyInteger object
	        System.out.println("The first MyInteger test object " + testObj.getValue() + " is found to be " + str);

	        String str2 = "";

	        // Check if the second MyInteger object is even, odd, or prime
	        if (testObj2.isEven()) {
	            str2 += "Even";
	        } else if (testObj2.isOdd()) {
	            str2 += "Odd";
	        } else if (testObj2.isPrime()) {
	            str2 += "Prime";
	        }
	        
	        // Display the result of the second MyInteger object
	        System.out.println("The second MyInteger test object " + testObj2.getValue() + " is found to be " + str2);

	        // Prompt the user to enter an integer for comparison
	        System.out.println("Please enter an integer number to compare with test object one:");

	        String str3 = "";

	        // Read an integer from the user
	        int j = input.nextInt();

	        // Check if the first MyInteger object is equal to the user's input
	        if (testObj.equals(j)) {
	            str3 += "equal";
	        } else if (!testObj.equals(j)) {
	            str3 += "not equal";
	        }
	        
	        // Display the comparison result
	        System.out.println("Integer " + j + " and test object one " + testObj.getValue() + " are found to be " + str3);

	        // Create an array of numeric characters
	        char[] testArray = {1, 2, 3, 4, 5};

	        // Calculate the sum of integers in the character array
	        System.out.println("The test array of numeric characters 1 2 3 4 5 "
	                + "has a sum integer value of: " + parseInt(testArray));
	        
	        // Prompt the user to enter a string for conversion to an integer
	        System.out.println("Enter a string to convert to an Integer: ");

	        // Read a string from the user
	        String testString = input.next();

	        // Convert the string to an integer and display the result
	        System.out.println("The test string " + testString + " is now the integer number " + parseInt(testString));

	        // Close the Scanner object to release resources
	        input.close();
	    }
	}
