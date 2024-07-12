package Chapter7;

import java.util.Scanner;

/**
 * Name Aayush Patel
 * Date July 24 
 * 7.1 (Assign grades) Write a program that reads student scores, gets the best score,
 * and then assigns grades based on the following scheme:
 * Grade is A if score is >= best 10
 * Grade is B if score is >= best 20;
 * Grade is C if score is >= best 30;
 * Grade is D if score is >= best 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts
 * the user to enter all of the scores, and concludes by displaying the grades.
 */

public class C7P1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter Number of Students Now:");
        final int numofStudents = in.nextInt();

        // Create an array to store the students' scores
        int[] grades = new int[numofStudents];

        // Prompt the user to enter space-separated scores for each student
        System.out.println("Now enter " +  numofStudents + " space separated scores: " );

        // Read the scores and store them in the 'grades' array
        for (int i = 0; i < numofStudents; i++) {
            grades[i] = in.nextInt();
        }

        // Find the best score (highest score) among all the students
        int bestGrade = findBestGrade(grades);

        // Calculate and display the letter grade for each student based on the best score
        printLetterGrades(grades, bestGrade);
    }

    // Method to calculate and print the letter grade for each student
    static void printLetterGrades(int[] grades, int bestGrade) {
        for (int j = 0; j < grades.length; j++) {
            char letterGrade;
            // Assign letter grades based on the given scheme and the best score
            if (grades[j] >= (bestGrade - 10)) {
                letterGrade = 'A';
            } else if (grades[j] >= (bestGrade - 20)) {
                letterGrade = 'B';
            } else if (grades[j] >= (bestGrade - 30)) {
                letterGrade = 'C';
            } else if (grades[j] >= (bestGrade - 40)) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
            // Print the student's score and corresponding letter grade
            System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letterGrade);
        }
    }
	        
    // Method to find the best score (highest score) among all the students
    static int findBestGrade(int[] grades) {
        int best = grades[0];
        // Iterate through the 'grades' array to find the highest score
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > best) {
                best = grades[i];
            }
        }
        // Return the best score found
        return best;
        
    }
}
