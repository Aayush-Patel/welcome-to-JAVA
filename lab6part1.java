package LAB;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Name: Aayush Patel
 * Date: October 22, 2023
 * Lab 6 - Part 1
 * This program demonstrates reading and writing data to a text file, generating random integers,
 * and sorting them.
 */

/**
 * 12.15 (Write/read data) Write a program to create a file named Exercise12_15.txt if
 * it does not exist.
 * <p>
 * Write 100 integers created randomly into the file using text I/O.
 * <p>
 * Integers are separated by spaces in the file.
 * <p>
 * Read the data back from the file and display the data in increasing order.
 */

public class lab6part1 {
    static ArrayList<Integer> lines = new ArrayList<>();

    public static void main(String[] args) {
        boolean success = true;
        File file = new File("Exercise12_15.txt");
        
        // Check if the file exists, if not, create it
        if (!file.exists()) {
            try {
                success = file.createNewFile();
            } catch (IOException ioe) {
                success = false;
                ioe.printStackTrace();
            }
        }
        // If file creation was successful or it already exists
        if (success) {
            try (PrintWriter printWriter = new PrintWriter(file)) {
            	 // Generate 100 random integers and write them to the file
                for (int i = 0; i < 100; i++) {
                    int random = (int) (1 + Math.random() * 9999);
                    printWriter.print(random);
                    printWriter.print(" ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (Scanner fileIn = new Scanner(file)) {
            	// Read integers from the file and store them in the 'lines' ArrayList
                while (fileIn.hasNext()) {
                    String num = fileIn.next();
                    lines.add(Integer.parseInt(num));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
         // Sort the integers in increasing order
            lines.sort((i1, i2) -> i1 - i2);
         // Display the sorted integers and the count
            System.out.println(Arrays.toString(lines.toArray()));
            System.out.println("Integer count= " + lines.size());
        }
    }
}
