/*
 
 Cesar Gutierrez
 Co Sci 290

Testing datatypes and input from the user

*/
import.java,util,Scanner; //is a Java object that allows you to take user input

public class TestInput{

 //main method - starting point of application
 public static void main(String[] args){
   //datatypes variableName = expression
   //1. Identifiers can only start with a letter, _, or S
   //2. Idemtifiers with multiple words are camelCased
   //e.g. - numofStudents, name, interestRate,
   
   //primitive datatypes
   //int - integer - whole number => 3, 2147483647, 102, -11
   //double - dcecimal number => 3.33, 0.2, 0.33333, -33.33
   //char - single character imside quotation  => '3', '!', ' '
   //boolean - true or false => true, false
   
   //object/reference datatypes
   //String  characters surrounded with double quotation => "skldfjsldk", "cat" "3"
   /*There are other objects in Java that comes with Java and that are custom
     => Objects/class that comes with Java: Scanner, System, etc.Objects
     => Customer classes: Zombie, SpaceInvader, Person, etc.
   */  
   
   
   final double PI_VALUE = 3.1415; //constants are all capital.
                                   //multiples words seperated by underscores
   int numberOfStudents = 29;
   double avgGPA = 3.78;
   String name = "";
   boolean gameOver = false; //or true
   int age = 0;
   
   Scanner input = new Scanner(System.in);
 
   System.out.println("Hi give me your name " );
   
   name = input.net(); //net() is for String types
   
   System.out.println("Hi, give me your name; ");
   
   

 
 
 
 
 
 
 
 
 
 
 }


}