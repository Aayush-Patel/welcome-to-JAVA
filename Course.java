package LAB;

class Course implements Cloneable {

    /**
     * Name: Aayush Patel
     * Date: Nov 26
     * 
     * This method overrides the clone method in the Cloneable interface.
     * It performs a shallow copy using super.clone() and then assigns the
     * reference of the original students array to the cloned course.
     * To make a deep copy, the students array should be cloned separately.
     * 
     * @return Course object with a shallow copy of students array
     * @throws CloneNotSupportedException for unsupported clone type
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Course course = (Course) super.clone();
        course.students = this.students; // Shallow copy, need to be fixed for deep copy
        return course;
    }

    // Private fields to store information about the course
    private String courseName;
    private String[] students = new String[100]; // Array to store student names
    private int numberOfStudents; // Counter for the number of students in the course

    /**
     * Constructor for the Course class.
     * Initializes the courseName and creates an array for students.
     * 
     * @param courseName the name of the course
     */
    public Course(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Adds a student to the course.
     * 
     * @param student the name of the student to be added
     */
    public void addStudent(String student) {
        students[numberOfStudents] = student; // Adds the student to the array
        numberOfStudents++; // Increments the number of students
    }

    /**
     * Gets the array of students.
     * 
     * @return the array of students
     */
    public String[] getStudents() {
        return students;
    }

    /**
     * Gets the number of students in the course.
     * 
     * @return the number of students
     */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /**
     * Gets the name of the course.
     * 
     * @return the name of the course
     */
    public String getCourseName() {
        return courseName;
    }
}
