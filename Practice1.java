/*
  Cesar Gutierrez
  CoSci 290
  
  Lab - connect every single line of code
  
  Input: I inputed 2 and 2 as operand1 and operand2 
  
  Output:The program took the the two whole numbers the user inputed and added, multiplied, divided, and minused it and gave 
  the different answers in the respected order in this case the answers where (4,4,1,0)
  
  
  */
import java.util.Scanner; 
//This line is a tool to help allow user input
public class Practice1{  
//This line is used to help recognize the title of the file with your code when you save compile and run it
  
  //entry point of app
  public static void main(String [] args){ 
  //This line is the main method of how the program will run
   
    Scanner input = new Scanner(System.in); 
    //This line is for the program to know when to allow user input when the term System.in is used 
    
    int operand1;
    int operand2;
    // These two lines are for when you need to declare variables that you will use when running the code
    
    System.out.println("Please enter in a whole number...");
    //This line is a text line that will be displayed after you run the code 
    
    operand1 = input.nextInt();
    //This line is for the user to input the variable the program will use as operand1
    
    System.out.println("Please enter in another whole number...");
    //This line is another text line that will be displayed 
    
    operand2 = input.nextInt();
    //This line is for the user to input variable the program will use as operand2
    
    System.out.println("Let's do some basic math! \n"
                       + "Here are the numbers you chose."); 
    //This is another text line this time with two different sentences that will be shown at the same time
    System.out.println("Operand1: " + operand1 + " and Operand2: " + operand2); 
    //This displays what you labled as operand1 and operand2
    System.out.println(operand1 + operand2);
    //This line takes operand1 and operand2 and adds them
    System.out.println(operand1 * operand2);
    //This line takes operand1 and operand2 and multiplies them 
    System.out.println(operand1 / operand2);
    //This line takes operand1 and operand2 and divides them
    System.out.println(operand1 - operand2);
    //This line takes operand1 and operand2 and minuses them
    }
  }