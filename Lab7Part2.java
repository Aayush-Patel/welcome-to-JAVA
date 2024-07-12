package LAB;



/**
 * Name Aayush Patel 
 * Date Nov 26
 * 13.13 (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
 * to add a clone method to perform a deep copy on the students field.
 */

public class Lab7Part2 {

	public static void main(String[] args) {
		 // Creating an instance of the Course class
		Course course = new Course("Linear Algebra");
		 // Adding students to the course
        course.addStudent("Simon");
        course.addStudent("Valerie");
        course.addStudent("Terrance");
        course.addStudent("Shiva");
        course.addStudent("Rajesh");
        course.addStudent("Mollie");
        // Printing information about the cloning process
        System.out.print("Cloning the Course object where course name = " + course.getCourseName());
        System.out.println(" . And students is cloned as a deep copy.");
        try {
        	 // Attempting to clone the Course object
            Course courseCopy = (Course) course.clone();
            // Checking if the students field is deep-copied
            System.out.println("Result of courseCopy.getStudents() == course.getStudents() is " + (course.getStudents() == courseCopy.getStudents()));
        } catch (CloneNotSupportedException cnse) {
        	 // Handling the exception if cloning is not supported
            System.out.println("Clone not supported....");
        }

	}

}
