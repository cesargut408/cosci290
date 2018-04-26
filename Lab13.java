/*
Cesar Gutierrez
CoSci290


*/


public class Lab13{
  
  public static void main(String [] args){
  int a = 5;
  int b = 8;
  int c = 9;
  int d = 3;
  int e = 
  System.out.println("operations on ")  
  System.out.println("operations on a = " + a + " and b = " + b + " :");
  System.out.println("operations on c = " + c + " and d = " + d + " :");
  System.out.println("multiplication = " + multiply(a, b));
  System.out.println("division = " + divide(c, d));
 
  }
 //this custom method adds two integers
  public static int add(int num1, int num2){
    
      //declare variables
      int sum = 0;

      //add num1 and num2 and assign to sum
      sum = num1 + num2;

      //return sum of num1 and num2
      return sum;
    
  }//end of add
  
  
  //this custom method subtracts two integers
  public static int subtract(int num1, int num2){
    
    //declare variables
    int difference = 0;
    
    //substract num1 by num2 and assign to difference
    difference = num1 - num2;
    
    //return the difference of num1 and num2
    return difference;
    
  }
 
 public static int multiply(int num1, int num2){
    
 int remainder = 0;
    
 remainder = num1 * num2;
    
 return remainder;  

 }
 public static int divide(int num1, int num2){
   int quotient = 0;
    
   quotient = num1 / num2;
   
   return quotient;
 }   

}  