/*
Cesar Gutierrez
Cosci 290
Finals
*/
public class Finals{
  
  public static void main(String[] args){
    
    int[] numbers = new int[300];
    
    for(int i = 0; i < 300; i++){
      numbers[i] = (0 + (int)(Math.random() * ((14 - 0) + 1)));
      
    }
    
    for(int i = 0; i < 300; i++){
      System.out.println(numbers[i] + " ");
      
    }
    
    for(int i = 0; i < 15; i++){
      System.out.println(numbers[i] + " ");
    }
  
    int max = numbers[0];
    for(int i = 1; i < numbers.length; i++) {
      if(numbers[i] > max) {
        max = numbers[i];
      }
    }
     
    System.out.println(" ");
     System.out.println("The Max number is " + max );
  }
}

