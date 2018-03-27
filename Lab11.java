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
    int fivedigit;
    
    //This prompts for a user input
    System.out.println("Enter a fivedigit number:");
    fivedigit = input.nextInt();
    
    //A series of modding that allows for all three digits to obtained
    int digit5 = fivedigit % 10;
    int num = fivedigit / 10;
    int digit4 = num % 10;
    int num2 = num / 10;
    int digit3 = num2 % 10;
    int num3 = num2 / 10;
    int digit2 = num3 % 10;
    int digit1 = num3 / 10;
    
       //Using If to compare the vsriable for the first digit to the last one to give a output of it being palindome
    if (digit5 == digit1 && digit4 == digit2)
        System.out.println(fivedigit + " is a palindrome");
    
    //Using else to give a different output if the previous one isn't correct 
    else
      System.out.println(fivedigit + " is not a palindrome");
 
     
  }
}