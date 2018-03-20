/*
Cesar Gutierrez
CosSci290
Lab10 sort three intergers

*/
import java.util.Scanner;

public class Lab10{

  public static void main(String[] args) {
   
    Scanner input = new Scanner (System.in);
    
    int num1;
    int num2; 
    int num3;
    
    System.out.println("Enter three intergers: ");
    num1 = input.nextInt();
    num2 = input.nextInt();
    num3 = input.nextInt();
    
    
    
    if (num1 < num2){
    System.out.println(num1);  
    }
    else {
      System.out.println(num2);
    }
    
    if (num3 < num2){
      System.out.println(num3);
    }
    else {
      System.out.println(num2);
    }
   
    if (num3 < num1){
      System.out.prinln(num3);
    }
    
      
      
  
      
   
    
    
   
  }
}