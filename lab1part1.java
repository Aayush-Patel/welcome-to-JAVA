package LAB;

import java.util.Scanner;

 	//	Name Aayush Patel 
	// Date sep 4 2023
/**Design a solution that requests and receives student names and an exam score for each. Use one-
	dimensional arrays to solve this.
	
 The program should continue to accept names and scores until the user inputs a student
	whose name is “alldone”.
	
 After the inputs are complete determine which student has the highest score and display
	that student’s name and score.
	
 Finally sort the list of names and corresponding scores in ascending orde
*/
public class lab1part1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxSize = 100; // Maximum number of students
        String[] studentNames = new String[maxSize];
        int[] examScores = new int[maxSize];
        
        int currentIndex = 0;
        
        // Input loop
        while (true) {
            System.out.print("Enter student name (or 'alldone' to finish): ");
            String name = scanner.nextLine();
            
            if (name.equals("alldone")) {
                break;
            }
            
            System.out.print("Enter exam score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            
            studentNames[currentIndex] = name;
            examScores[currentIndex] = score;
            currentIndex++;
        }
        
        // Find student with the highest score
        int maxScore = -1;
        int maxScoreIndex = -1;
        for (int i = 0; i < currentIndex; i++) {
            if (examScores[i] > maxScore) {
                maxScore = examScores[i];
                maxScoreIndex = i;
            }
        }
        
        // Display student with highest score
        if (maxScoreIndex != -1) {
            System.out.println("Student with the highest score:");
            System.out.println("Name: " + studentNames[maxScoreIndex]);
            System.out.println("Score: " + examScores[maxScoreIndex]);
        } else {
            System.out.println("No students entered.");
        }
        
        // Sort the list of names and corresponding scores in ascending order (using bubble sort)
        for (int i = 0; i < currentIndex - 1; i++) {
            for (int j = 0; j < currentIndex - i - 1; j++) {
                if (studentNames[j].compareTo(studentNames[j + 1]) > 0) {
                    // Swap names
                    String tempName = studentNames[j];
                    studentNames[j] = studentNames[j + 1];
                    studentNames[j + 1] = tempName;
                    
                    // Swap scores
                    int tempScore = examScores[j];
                    examScores[j] = examScores[j + 1];
                    examScores[j + 1] = tempScore;
                }
            }
        }
        
        // Display sorted list
        System.out.println("\nSorted list of student names and scores:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(studentNames[i] + ": " + examScores[i]);
        }
    }
}
