package LAB;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Name Aayush Patel
 * Date: Nov 25 
 * Lab7part1 class contains a method to sort an ArrayList of Numbers.
 */
public class Lab7part1 {
    // ArrayList to store test data
    static ArrayList<Number> testList;

    /**
     * The main method where user input is taken, the list is sorted, and the sorted list is printed.
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testList = new ArrayList<>();

        System.out.print("Enter five integers and five doubles: ");

        // Adding integers to the list
        for (int i = 0; i < 5; i++) {
            Number n = in.nextInt();
            testList.add(n);
        }

        // Adding doubles to the list
        for (int i = 0; i < 5; i++) {
            Number n = in.nextDouble();
            testList.add(n);
        }

        // Sorting the list
        sort(testList);

        // Printing the sorted list
        System.out.print("Sorted List: ");
        for (Number n : testList) {
            System.out.print(n + " ");
        }

        // Closing the scanner
        in.close();
    }

    /**
     * Sorts an ArrayList of Numbers in ascending order.
     * @param list The ArrayList to be sorted.
     */
    public static void sort(ArrayList<Number> list) {
        boolean isSorted = false;

        // Loop until the list is sorted
        while (!isSorted) {
            isSorted = true;

            // Traverse the list
            for (int i = 0; i < list.size() - 1; i++) {
                // Compare adjacent elements and swap if necessary
                if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()) {
                    isSorted = false;
                    Number smallNum = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, smallNum);
                }
            }
        }
    }

    /**
     * Generates a random ArrayList of Numbers for testing purposes.
     * @return The generated ArrayList.
     */
    static ArrayList<Number> getRandomTestList() {
        ArrayList<Number> list = new ArrayList<>();
        Random random = new Random();

        // Populate the list with random integers
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    /**
     * Check if an ArrayList of Numbers is sorted in ascending order.
     * @param list The ArrayList to be checked.
     * @return True if the list is sorted, false otherwise.
     */
    static boolean isArraySorted(ArrayList<Number> list) {
        for (int i = 1; i < list.size(); i++) {
            // Compare each element with the previous one
            if (list.get(i).intValue() < list.get(i - 1).intValue()) {
                return false; // If any element is out of order, return false
            }
        }
        return true; // If the loop completes, the list is sorted
    }
}
