/*
Cesar Gutierrez
Cosci 290
Lab 22
contributors:Francisco Delgado
*/
public class Lab22{
 
  public static void main(String[] args){
    
    int[] numbers = new int[200];
      
   
    
    for(int i = 0; i < 200; i++){
      numbers[i] = (0 + (int)(Math.random() * ((14 - 0) +1)));
        
      }
    
    for(int i = 0; i < 200; i++){
      System.out.println(numbers[i] + " ");
    }
  
    for(int i = 0; i < 15; i++){
      System.out.print(numbers[i] + " ");
  }
    int max = numbers[0];
    for(int i = 1; i < numbers.length; i++) {
      if(numbers[i] > max) {
        max = numbers[i];
      }
    }
    
    System.out.println(" ");
    System.out.println("The Max number is " + max );
    
    max = numbers[0];
    int indexOfMax = 0;
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max){
        max = numbers[i];
        indexOfMax = i;
      }
    }
    
    System.out.println(" ");
    System.out.println("The Minimum number is " + indexOfMax);
    
  }
}