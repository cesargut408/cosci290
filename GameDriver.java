/*
Cesar Gutierrez
Co Sci 290

Hw Assignment
*/

import java.util.Scanner;

public class GameDriver{
  
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  int numberofFamily = 0;
  String Yourweapon = "";
  int randomNum = 0;
  int minimum = 2;
  int maximum = 6;
  


  

    
  
    
   //Splash Screen
    System.out.println( "____ ___           .___                 .___ ________                            .___._. \n"
                       +"|    |   \\____    __| _/____ _____     __| _/ \\______\\_______   ____ _____     __| _/ \n"
                       +"|    |   /    \\  / __ |/ __ \\__ \\   / __ |   |    | \\_  __ \\_/ __ \\__ \\   / __ | \n"
                       +"|    |  /   |  \\/ /_/\\  ___/ / __\\_/ /_/ |   |    `  \\  |\\/\\  ___/ / __\\_/ /_/ | \n"
                       +"|______/|___|  /\\____|\\___  >____  /\\____ |  /_______  /__|   \\___  >____ /\\____ | \n"
                       +"    \\/      \\/    \\/     \\/      \\/          \\/            \\/     \\/      \\/   \n");
    
   //Story Setup
   System.out.println("You turn on the news and see channels reporting on a disease spreading in your town.... \n");
   System.out.println("people are rising from the dead and eating the living..... \n");
   System.out.println("you hear a loud bang on your door zombies are trying to break in! \n");
   System.out.println("you have to escape with all of your family members! \n");
   System.out.println("wait..... How many family members do you have again? \n");
   
   numberofFamily = input.nextInt();
   
   System.out.println("\nYou gather all "  + numberofFamily +  " of your family memebers and prepare to leave." );
   System.out.println("you realise that you may need a weapon.....");
   
   Yourweapon = input.next();
   
   System.out.println("\nso you use the " + Yourweapon + " you had laying around the house and you prepare to fight the zombies.");
   
   randomNum = minimum + (int)(Math.random() * maximum);
   if(randomNum > 3){
     System.out.println("\nYou killed the invading zombies in your house.");
   }
   else{
     System.out.println("\nYou were unable to defeat the invading zombies you and your family die.");
   }
    //GameOver screen
    System.out.println();
    System.out.println("_____          __  __ ______    ______      ________ _____ \n"  
                      +" / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\ \n" 
                      +"| |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__  | |__) | \n"
                      +"| | |_ | / /\\ \\ | |\\/| |  __|   | |  | |\\ \\/ / |  __| |  _  / \n" 
                      +"| |__| |/ ____ \\| |  | | |____  | |__| | \\  /  | |____| | \\ \\ \n" 
                      +" \\_____/_/    \\_\\_|  |_|______|  \\____/   \\/   |______|_|  \\_\\ \n");
    
                          }

                        }