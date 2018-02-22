/*
  Cesar Gutierrez
  Co Sci 290
  
  Lab 3
  */

public class TestScenario{
  
  public static void main(String[] args){
    
    int minimum = 1;
    int maximum = 100;
    int randomNum = minimum + (int)(Math.random() * maximum);
    
    if (randomNum >= 90){
      System.out.println("You found a gun off a dead police officer");
    }
    else if(randomNum <= 80 && randomNum >= 70){
      System.out.println("You found a Hammer in a hardware store");
    }
    else{
      System.out.println("You pull out your pocket knife");
    }
  
  
  }
}