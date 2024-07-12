package chapter2;
import java.util.Scanner;
public class Projecttemp {

	public static void main(String[] args) {
		// Programmer Aayush Patel
		
		// Date June 19 2023
		
		// This program will reads Celsius value from the console and convert into fahrenheit.
		
		

			
			System.out.println(" Convert Celsius to Fahrenheit 2.1");
			
			double Celsius; 
			
			double Fahrenheit;
			
			System.out.println("Enter degrees in Celsius");
			
			Scanner input = new Scanner(System.in);
			
			Celsius = input.nextDouble();
			
			Fahrenheit = (9.0/5.0 * Celsius + 32);

			System.out.println(Fahrenheit + "F");
			
			
			System.out.println("Convert celsius to Fahrenheit programe close 2.1");
			
			System.out.println("Start of Program Convert Feet to Meters 2.3");
			input.close();
			
	}

}
