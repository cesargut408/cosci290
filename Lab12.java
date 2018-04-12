/*
Cesar Gutierrez
Lab 12
Debuging code

*/
//This is for importing an Scanner from the java.util package
import java.util.Scanner;

//This code is for identifying the codes class
public class Lab12{

	//This code is the main method on how the code will run
	public static void main(String[] args){

		//This code creates a new scanner object 
		Scanner input = new Scanner(System.in);
		
		//This code is for stating variables that will be used later
		int num;

		//This code is a print statement that adds dialogue too the program
		System.out.println("This program will check if a number is even or odd...");
		System.out.println("Please enter in a whole number...");
	  
		//This code is used to get a user input once the program runs
		num = input.nextInt();
		
		//These are the if and else statements that will determine the output from the user input using math logic
		if(num % 2 == 0){
			System.out.println("The number " + num + " is even...");
		}
			
		else 
			System.out.println("The number " + num + " is odd...");
			
		
	}
	}
