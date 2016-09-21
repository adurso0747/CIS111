/* 
Programmer: Alex Durso

Program Name: RockPaperScissors.java

Date: 11/09/2015

Purpose: Allow user to play rock paper scissors with computer

Met Specifications: Yes
 */

import java.util.Scanner;
import java.util.Random;
import java.util.regex.*;

public class RockPaperScissors
{

    public static void main(String[] args)
    {

      //Generate random number to represent computer's choice
      int computerChoice = generateRandomNumber(3);
      
      //Prompt user to input choice
      System.out.println("\nWelcome to Rock Paper Scissors.");
      System.out.print("Please type your choice: Rock, Paper or Scissors: ");
      int playerChoice = getPlayerChoice();
      
      //If choices are same restart. Otherwise print results. 
      if (computerChoice == playerChoice)
      {
        System.out.println("\nThe game was a tie. Now starting over.");
        main(args);
      }
      else
      {
        printResults(playerChoice, computerChoice);
      }

    } 
    
    // Methods:
    
    /**
     *
     * generateRandomNumber() - generates random number
     * @param Integer to limit return value
     * @return Random number
     *
     */ 
    public static int generateRandomNumber(int i)
    {
      
      //Create a random number generator
      Random generator = new Random();
      
      //Return random number in int form 
      return generator.nextInt(i) + 1;
      
    } 
    
    
    /**
     *
     * getPlayerChoice() - Receives players choice from keyboard
     * @return Input from keyboard as integer
     *
     */
      public static int getPlayerChoice()
      {

        //Create a scanner, a regex to test input and a variable to hold input
        Scanner keyboard = new Scanner(System.in);
        Pattern p = Pattern.compile("Rock|rock|Paper|paper|Scissors|scissors");
        String input;
        int x = 0;

        //If user entered invalid choice tell them then exit. 
        if (!keyboard.hasNext(p)) 
         { 
          System.out.println("Please enter one of the choices listed."); 
          System.exit(1); 
         }

        //Store value and convert to lowercase
        input = keyboard.next().toLowerCase();

        //Convert players number to choice and return it
        if (input.contentEquals("rock"))     { x = 1; }
        if (input.contentEquals("paper"))    { x = 2; }
        if (input.contentEquals("scissors")) { x = 3; }

        return x;

      } 
     
     
     /**
      *
      * printResults() - Prints results of game
      * @param Player's choice
      * @param Computer's choice
      *
      */ 
      public static void printResults(int p, int c)
      {

        //Player chooses rock and other player chooses scissors. Rock wins. 
        if (p == 1 && c == 3)
        {
          System.out.println("\nYou chose rock and the computer chose scissors.");
          System.out.println("You won!\n");
        }
        else if (p == 3 && c == 1)
        {
          System.out.println("\nYou chose scissors and the computer chose rock.");
          System.out.println("You lost!\n");
        }

        //Player chooses scissors and other player chooses paper. Scissors wins.
        if (p == 3 && c == 2)
        {
          System.out.println("\nYou chose scissors and the computer chose paper.");
          System.out.println("You won!\n");
        }
        else if (p == 2 && c == 3)
        {
          System.out.println("\nYou chose paper and the computer chose scissors.");
          System.out.println("You lost!\n");
        }

        //Player chooses paper and other player chooses rock. Paper wins. 
        if (p == 2 && c == 1)
        {
          System.out.println("\nYou chose paper and the computer chose rock.");
          System.out.println("You won!\n");
        }
        else if (p == 1 && c == 2)
        {
          System.out.println("\nYou chose rock and the computer chose paper.");
          System.out.println("You lost!\n");
        }

      } 

}
