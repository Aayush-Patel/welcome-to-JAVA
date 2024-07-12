package LAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Name: Aayush Patel
 * Date: October 22, 2023
 * Lab 6 - Part 2
 * This program counts the number of words in President Abraham Lincoln's Gettysburg Address
 * from a provided URL.
 */

/**
 * 12.19 (Count words) Write a program that counts the number of words in President
 * Abraham Lincoln’s Gettysburg address 
 */

public class lab6part2 {
	  public static void main(String[] args) {
	        try {
	        	  // Create a URL object to access the Gettysburg Address text
	            URL url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");
	         // Open a BufferedReader to read the content from the URL
	            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
	         // Call the countWords method to count the words and display the result
	            System.out.println("Number of words in the Gettysburg Address is " + countWords(bufferedReader));
	        } catch (MalformedURLException malformedURLException) {
	            malformedURLException.printStackTrace();
	        } catch (IOException ioException) {
	            ioException.printStackTrace();
	        }

	    }
	  
	  /**
	     * Counts the number of words in the given BufferedReader.
	     *
	     * @param br The BufferedReader containing the text to count words from.
	     * @return The number of words in the text.
	     * @throws IOException if there is an issue with reading from the BufferedReader.
	     */
	    static int countWords(BufferedReader br) throws IOException {
	        int wordCount = 0;
	        String line;
	        while ((line = br.readLine()) != null) {
	        	// Split the line into words using whitespace as a delimiter
	            String[] words = line.split("\\s");
	            if (words.length == 0) continue;
	            
	            // Iterate through the words and count them	           
	            for (String word : words) {
	                word = word.trim();
	                if (word.length() > 0 && !word.equals(" ")) {
	                    wordCount++;
//	                    System.out.println("Word: " + word + " Count = " + wordCount);
	                }
	            }
	        }
	        return wordCount;
	    }
	}

