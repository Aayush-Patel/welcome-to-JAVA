package Chapter9;
import java.util.Date;
/**
 * Name Aayush Patel
 * Date August 21 2023
 * *9.3 (Use the Date class) Write a program that creates a Date object, sets its elapsed
 * time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
 * 10000000000, and 100000000000, and displays the date and time using the
 * toString() method, respectively.
 */
public class C9P3 {
    // Define the starting and ending elapsed time values
	// Starting elapsed time in milliseconds
	private static final long startElapsedTime=1000;
	 // Ending elapsed time in milliseconds

	private static final long endElapsedTime=100000000000L;
	

	public static void main(String[] args) {
        // Create a new Date object

		Date date = new Date();
		for (long elapsedTime=startElapsedTime; elapsedTime < endElapsedTime; elapsedTime *= 10) {
			 // Set the elapsed time for the Date object
			date.setTime(elapsedTime);
			 // Display the formatted date and time using the toString() method
            System.out.println(date.toString());
        }

    }
}
		