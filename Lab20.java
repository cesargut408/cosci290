/*
Cesar Gutierrez
Cosci 290
Lab20
Create an array of strings
contributor:Francisco Delgado
*/
//declaring the class
public class Lab20{
  
  //start of program
  public static void main(String[] args){
    
    //declaring an array of integers
    String[] colors = new String[5];
    
    //declaring what each integer equals to
    colors[0] = "red";
    colors[1] = "blue";
    colors[2] = "yellow";
    colors[3] = "green";
    colors[4] = "pink";
    
    //using a for loop to print out each integer in order
    for(int i = 0; i < 5; i++){
      System.out.println(colors[i] + " ");
    }
    
  }
  
}