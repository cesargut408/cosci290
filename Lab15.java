/*
Cesar Gutierrez
CoSci 290
Lab 15
Sum the digits in integers
Sort three numbers
*/

public class Lab15{
public static int sumDigits (int n){
System.out.println("Please enter a three digit integer:");
  n = input.nextInt();
  int thirddigit = n % 10;
  int num = n / 10;
  int seconddigit = num % 10;
  int firstdigit = num / 10;
  
  System.out.println("The sum of the intergers = " + sum);
  sum = firstdigit + seconddigit + firstdigit;
  

}  
 }