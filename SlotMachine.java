/* 
Programmer: Alex Durso

Program Name: SlotMachine.java

Date: 10/27/2015

Purpose: Plays slot machine game with user

Met Specifications: Yes

Program pseudocode:
Declare Variables - Cash for one slot game, total cash spent, and total cash made. Assign each slot a integer variable. Also declare two
boolean variables. One will determine if the user has finished the game, the other will determine if the user gave a valid response.

Set program to loop while user plays as many turns as they would like. 

Gather user input. User will input a number which will be
assigned to the variable slotCash.

Create new random class. Each of the slot integer variables will be determined by random number generation between 1-6 for the 6 fruit types
available.

Create three switches. Each switch will randomly generate one of the slots by choosing between 1-6 and assigning that number to a type of 
fruit.

Compare the integers created by each switch. The number of matching switches will determine the amount of money the player receives.

Multiply slotCash by appropriate value and assign it to the variable totalcash. SlotCash will also be added onto the spentCash tab.

Ask user if they would like to play again. If yes loop the entire program. If no output

"You have entered spentCash and made (totalCash-spentCash). Thanks for playing."

Note: I have tried to work on improving my variable names and my descriptions after looking over the example programs.
*/
import java.util.Scanner;// Adds scanner class
import java.util.Random;// Adds random class

public class SlotMachine
{
   public static void main(String[] args)
   {
      
      //Declare variables
      double slotCash;
      double totalCash = 0;
      double spentCash = 0;
      int firstSlot;
      int secondSlot;
      int thirdSlot;
      boolean responded;
      boolean userContinue;
      
      //Gather User Input
      //Set program to loop while user plays as many times as they would like
      do{
         System.out.println("How much money would you like to " +
                         "enter in the slot machine? You currently"
                         +" have " + totalCash + ".");
         Scanner scanner = new Scanner(System.in);
         slotCash = scanner.nextDouble();
         Random random = new Random();
         
         //Assign each of the three slots a random integer from 1-6
         firstSlot = random.nextInt(6);
         secondSlot = random.nextInt(6);
         thirdSlot = random.nextInt(6);
         scanner.nextLine();
         
         //Switch for first slot
         switch(firstSlot)
         {
            case 0:
               System.out.println("Cherries");
               break;
            case 1:
               System.out.println("Oranges");
               break;
            case 2:
               System.out.println("Plums");
               break;
            case 3:
               System.out.println("Bells");
               break;
            case 4:
               System.out.println("Melons");
               break;
            default:
               System.out.println("Bars");
         }
         
         //Switch for second slot
         switch(secondSlot)
         {
            case 0:
               System.out.println("Cherries");
               break;
            case 1:
               System.out.println("Oranges");
               break;
            case 2:
               System.out.println("Plums");
               break;
            case 3:
               System.out.println("Bells");
               break;
            case 4:
               System.out.println("Melons");
               break;
            default:
               System.out.println("Bars");
         }
         
         //Switch for third slot
         switch(thirdSlot)
         {
            case 0:
               System.out.println("Cherries");
               break;
            case 1:
               System.out.println("Oranges");
               break;
            case 2:
               System.out.println("Plums");
               break;
            case 3:
               System.out.println("Bells");
               break;
            case 4:
               System.out.println("Melons");
               break;
            default:
               System.out.println("Bars");
         }
         
         //Processing and Output Section. Here we assign values for total cash spent, cash made, and cash on the current slot.
         
         //Set won cash to 0 if no slots match
         if(firstSlot != secondSlot && firstSlot != thirdSlot && secondSlot != thirdSlot)
         {
            System.out.println("You have won $0");
            totalCash = totalCash - slotCash;
            spentCash=spentCash + slotCash;
         }
         
         //Set double cash for if two slots match
         else if((firstSlot == secondSlot) && (firstSlot != thirdSlot) && (secondSlot != thirdSlot))
         {
            System.out.println("You have won $" + (slotCash * 2) + " dollars.");
            spentCash = spentCash + slotCash;
            totalCash = totalCash + (slotCash * 2);
         }
         else if(firstSlot != secondSlot && firstSlot == thirdSlot && secondSlot != thirdSlot)
         {
            System.out.println("You have won $" + (slotCash * 2) + " dollars.");
            spentCash = spentCash + slotCash;
            totalCash = totalCash + (slotCash * 2);
         }
         else if(firstSlot != secondSlot && firstSlot != thirdSlot && secondSlot == thirdSlot)
         {
            System.out.println("You have won $" + (slotCash * 2) + " dollars.");
            spentCash = spentCash + slotCash;
            totalCash = totalCash + (slotCash * 2);
         }
         
         //Set triple cash for if three slots match
         else if(firstSlot == secondSlot && firstSlot == thirdSlot && secondSlot == thirdSlot)
         {
            System.out.println("You have won $" + (slotCash * 3) + " dollars.");
            spentCash = spentCash + slotCash;
            totalCash = totalCash + (slotCash * 3);;
         }
         
         //Ask user if they would like to continue
         //Set program to loop until valid response is given.
         do{
            System.out.println("Would you like to continue? Y/N?");
            String userChoice = scanner.nextLine();
            char userCharacter = Character.toUpperCase(userChoice.charAt(0));
            if(userCharacter =='Y')
            {
               userContinue = false;
               responded = true;
            }
            else if(userCharacter == 'N')
            {
               userContinue = true;
               responded = true;
            }
            
            //Ensure user enters a valid response
            else
            {
               System.out.println("Please enter a valid response.");
               userContinue = false;
               responded = false;
            }
           }while(!responded);
        }while(!userContinue);
        
        //Output when user quits
    System.out.println("Thank you for playing. You have spent $" + spentCash
                   + " and made $" + (totalCash - spentCash) + " dollars.");
   }
}
      