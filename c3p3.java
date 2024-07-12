package chapter3;

import java.util.Scanner;

public class c3p3 {

	public static void main(String[] args) {
		// Aayush Patel
		// Date jun 14
		/** This pograme will prompt user to eneter a,b,c,d,e and f 
		 * and diplay the result. If ad - bc is 0 it will report that equation has no solution.
		 */
		Scanner input =  new Scanner(System.in);
		System.out.println("please enter value for a, b, c, d, e, and f");
		
		double a = input.nextDouble();
		
        double b = input.nextDouble();
        
        double c = input.nextDouble();
        
        double d = input.nextDouble();

        double e = input.nextDouble();
        
        double f = input.nextDouble();
        
        double y = 0;
        
        double x = 0;
	
		if (a * d - b * c < 0.00001) {
			System.out.println("The equation has no solution :(");
			
            System.out.println(a + " * " + c + " - " + b + " * " + c + " = " + " 0 ");
            

		}
		else {  x = (e * d - b * f) / (a * d - b * c);
		
        y = (a * f - e * c) / (a * d - b * c);

        System.out.print("(" + e + " * " + d + " - " + b + " * " + f + ""
                + ") / (" + a + " * " + d + " - " + b + " * " + c + ")");

        System.out.print(" = x = " + x);

        System.out.print("\nand");

        System.out.print("\n(" + a + " * " + f + " - " + e + " * " + c + ""
                + ") / (" + a + " * " + d + " - " + b + " * " + c + ")");

        System.out.print(" = y = " + y);
        
         input.close();
	}

}
}
