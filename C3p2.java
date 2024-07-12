package chapter3;

import java.util.Scanner;
// Aayush Patel
// Date 14 June 
// This program will generate two integers and will prompt user to enter sum of two integers.


public class C3p2 {

	public static void main(String[] args)
	{
		 int a = (int) (System.currentTimeMillis() % 10);
		 
	        int b = (int) (System.currentTimeMillis() / 7 % 10);
	        
	        int c = (int) (System.currentTimeMillis() / 5 % 10);
	        
int correctAnswer = a + b + c;

Scanner input = new Scanner(System.in);

System.out.print(" Fill in your answer and press enter:" + a + "+" + b + "+" + c + "=");

int userAnswer = input.nextInt();

if (userAnswer == correctAnswer) 
	
{ System.out.println("Great! That is correct!");
} 
else System.out.println("Sorry! That is incorrect, please try again");

System.out.println("Program Close");

input.close();


}

	}


