/* 
Programmer: Alex Durso

Program Name: VowelConsonant.java

Date: 10/13/2015

Purpose: Determine if user entered a vowel
or consonant

Met Specifications: Yes
*/
import java.util.Scanner;  // This statement makes scanner available

public class VowelConsonant
{
   public static void main(String[] args)
   {
      //Gather User Input
      System.out.println("Please enter a single letter");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.next();
      
      //Access first character in string
      char first = input.charAt(0);
      
      //Convert string length to integer format
      int s = input.length( );
      
      //Determine if user has entered a single character
      if(s > 1)
      {
         System.out.println("You did not enter a single letter.");
      }
      
      //Determine if they have entered a letter 
      else if(!Character.isLetter(first))
      {
         System.out.println("You did not enter a single letter.");
      }
      
      //Determine if letter was vowel or consonant
      else if(input.equalsIgnoreCase("A"))
      {
         System.out.println("Vowel");
      }
      
      else if(input.equalsIgnoreCase("E"))
      {
         System.out.println("Vowel");
      }
      
      else if(input.equalsIgnoreCase("I"))
      {
         System.out.println("Vowel");
      }
       
      else if(input.equalsIgnoreCase("O"))
      {
         System.out.println("Vowel");
      }
      else if(input.equalsIgnoreCase("U"))
      {
         System.out.println("Vowel");
      }
      
      else
      {
      System.out.println("Consonant");
      }
   }
}         
 
         
         
         
