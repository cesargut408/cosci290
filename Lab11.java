/*
Cesar Gutierrez
CoSci290
Lab 11 Palindome intergers

*/
//this code is to import a Scanner from java.util package
import java.util.Scanner;

//this code is to identify the class
public class Lab11{
  
  //The main method of how the program will run
  public static void main(String[] args){
    
    //This creates a new scanner object
    Scanner input = new Scanner (System.in);
    
    //This identifies the variable that will be used for user input
    int threedigit;
    
    //This prompts for a user input
    System.out.println("Enter a three digit number:");
    threedigit = input.nextInt();
    
    //A series of modding that allows for all three digits to obtained
    int digit3 = threedigit % 10;
    int num = threedigit / 10;
    int digit2 = num % 10;
    int digit1 = num / 10; 
    
    //Using If to compare the vsriable for the first digit to the last one to give a output of it being palindome
    if (digit1 == digit3)
        System.out.println(threedigit + " is a palindrome");
    
    //Using else to give a different output if the previous one isn't correct 
    else
      System.out.println(threedigit + " is not a palindrome");
     
  }
}