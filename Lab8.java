/*
Cosci 290
Cesar Gutierrez
Lab

*/
//This code imports the scanner tool from the util cache
import java.util.Scanner;

//This is to identify the title of the class of this file
public class Lab8{

//This is main method of how the program will run  
 public static void main(String[] args) {
   
   // This is creates a new scanner object
   Scanner input = new Scanner(System.in);
   
   //This line is for dialouge to prompt a users input
   System.out.println("Enter a degree in celsius: ");
   
   //This line allows user input for the degrees in celsius  
   double celsius = input.nextInt();
   
   //This line converts degrees in celsius to degrees in fahrenheit
   double fahrenheit = (9/5) * (celsius + 32);
   
   //This line shows the output of the program
   System.out.println("Celsius " + celsius + " is " + 
   fahrenheit +  " in Fahrenheit");
   
 } 
}