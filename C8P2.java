package Chapter8;

import java.util.Scanner;
/**
 * Name Aayush Patel
 * Date 08/14/23
 * 8.2 (Sum the major diagonal in a matrix)
 */


public class C8P2 {
	
	// Method to calculate the sum of elements on the major diagonal of a matrix
	public static double sumMajorDiagonal(double[][] m) {

        double sum = 0;
        int row = 0;
        
        // Loop through each row of the matrix
        for (int column = 0; column < m.length; column++) {
        	
        	// Add the value at the current row and column to the sum
            sum += m[row++][column];
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Create a 2 by 10 matrix to hold the user's input
        double[][] twoByTen = new double[2][10];

        System.out.println("Enter a 2 by 10 matrix row by row: ");
        
     // Loop through each row and column to get user input for the matrix
        for (int row = 0; row < twoByTen.length; row++) {
            for (int column = 0; column < twoByTen[row].length; column++) {

               twoByTen[row][column] = input.nextDouble();
            }
        }
        input.close();
        
        // Calculate and display the sum of elements in the major diagonal
        System.out.println("The sum of the elements in the major diagonal is"
                + ": " + sumMajorDiagonal(twoByTen));
    }
}
	
	