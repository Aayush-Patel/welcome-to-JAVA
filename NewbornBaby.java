package chapter3;

import java.util.Random;

import java.util.Scanner;
/** Programmer Aayush Patel
 * Date June 26 2023
 * Exam-1
 * Program regarding Newbornbaby 
 * This program will prompt user to enter baby's name 
 * it will randomly selected the weight of baby
 * it will display "Below average weight" if the weight is less than 6.0 pounds.
 * it will display "Average weight" if weight is between 6.0 and 8.0 pounds.
 * it will display "Above Average weight" if weight is above 8.0 Pounds.
 *  
 */


public class NewbornBaby {
	
    private double weight;
    
    private String name;

    public NewbornBaby() {
    	
        Random random = new Random();
        
      //will  randomly weight between 5.0 and 9.0
        weight = 5.0 + random.nextDouble() * 4.0; 
        
        Scanner weight = new Scanner(System.in);
        
        //will prompt to enter name
        System.out.print("Enter the baby's name: ");
        
        name = weight.nextLine();
    }

    public void displayInfo() {
    	
        String formattedWeight = String.format("%.2f", weight);
        
        System.out.println(name + " weighed " + formattedWeight + " pounds when born.");

        if (weight < 6.0) {
        	
            System.out.println("Below average weight");
            
        } else if (weight <= 8.0) {
        	
            System.out.println("Average weight");
            
        } else {
        	
            System.out.println("Above average weight");
        }
    }

    public static void main(String[] args) {
    	
        NewbornBaby baby = new NewbornBaby();
        
        baby.displayInfo();
        
        
        System.out.println("program close");
    
       
       
}



}
