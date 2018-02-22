/*
 Cesar Gutierrez
 Co Sci 290
 
 Demo topics on:
    - increment/decrement operators
    - augemented assignment operators
*/

public class DemoBoolean{
  

//start of apllication
  public static void main(String[] args){
    
    
    //line 17 and line 18 are equivalent
    int num = 1;
    num = num + 1; //imcrement num by 1
    num++; //post-increment
    ++num; //pre-increment
   
  
    
    num = 1;
    int count = ++num; //pre-increment, count 2, num 2
    System.out.println("count " + count + " num " + num);
    num = 1;
    count = num++; //post-imcrement, 1
    System.out.println("count " + count + " num " + num);
    
    count = num--; //post-decrement
    count = --num;//pre-decrement
    
    //example of augmented assignment operators
    num += 2; //equivalent to => num = num + 2;
    //num *= 2; // num = num * 2;
   // num /= 2; // num = num / 2;
    num -= 2; // num = num - 2; 
    
    num -= 2;
    double num2 = 3.0;
    System.out.println("Double wins: " + num * num2); 
    System.out.println("Casting a double to int: " + (int) num2); //lose the decimal point
    System.out.println("Casting an int to a double " + (double) num); //turns the 2 into 2.0
    System.out.println("Casting a char to an int " + (int) 'c'); //turns the c into 99 because of ABC
    
    int numberofZombies = 3;
    
    if(numberofZombies < 5) { //evaluates true
      System.out.println("You might survive this apocolypse. ");   
    }
    else{
      System.out.println("You might NOT survive this apocolypse. ");    
    }
  
    
    //generating a random number
    //Math.pow(3,  2); 3'2
    System.out.println(Math.ramndom()); //random number between 0 and 1
    
    // minimum + Math.random() * maximum
    System.out.println(1 + (int)(Math.random() * 10) -3)); 
    
    
    
    
    
    
  }

}