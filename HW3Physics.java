/*
Cesar Gutierrez
CoSci 290
Homework 3 Physics finding runway length

*/
import java.util.Scanner;

public class HW3Physics{
 
  public static void main(String[] args){
      
    Scanner input = new Scanner (System.in);
   
    int speed;
    int acceleration;
      
    System.out.println("Enter speed and acceleration:");
    speed = input.nextInt();
    acceleration = input.nextInt();

    
    double minlength = (speed * speed) / (2 * acceleration);
    System.out.println("The minimum runway length is: " + minlength);
     
  }
}
