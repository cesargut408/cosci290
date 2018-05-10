/*
Cesar Gutierrez
Cosci 290
Lab 18

*/
import java.util.Scanner;

public class Lab18{
 
  public static void main(String[] args){
  
    //5.10 (find the numbers divisible by 5 and 6)
    
    //
     int counter = 0;
    
    for(int i = 100; i <= 1000;i++){
     
      if(i % 5 == 0){
        counter ++;
        System.out.print(i + " ");
        }
      
      if(counter % 10 == 0){
        System.out.println();
        
      }
    }
    
    // 5.16 (find the factors of the intergers)
    Scanner input = new Scanner(System.in);
    
    int n;
    
    System.out.println("Enter a integer =");
    n = input.nextInt();
    
   /* int factor = 2;
      while (n % factor != 0) {
        factor++;*/
        int counter2 = 0;
        for(int i2 = 2; i <= 10;i2++){
          if(i2 % 3 == 0){
            counter ++;
            System
          }
          
        }
      }
    System.out.println("The smallest factors for " + n + 
     " is " + factor);
    
    
    }
    }
  