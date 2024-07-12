package LAB;

//Name: Aayush Patel 
	// Date: oct 22 2023
/**
 * 11.5 (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
 * to replace an array to store students.
 * <p>
 * Draw the new UML diagram for the class.
 * <p>
 * You should not change the original contract of the Course class
 * (i.e., the definition of the constructors and methods should not be changed, but the private
 * members may be changed.)
 */

public class Lab4part1 {

	public static void main(String[] args)  {
		// Create a new Course object for "Linear Algebra"
        Course course = new Course("Linear Algebra");
        // Define student names
        String studentName = "Thala Akram";
        String studentName2 = "Aayush Patel";
        String studentName3 = "Mousa Darhna";
        String studentName4 = "Sahaj Patel";
        // Add students to the course
        course.addStudent(studentName);
        course.addStudent(studentName2);
        course.addStudent(studentName3);
        course.addStudent(studentName4);

        course.dropStudent(studentName);

    }
}