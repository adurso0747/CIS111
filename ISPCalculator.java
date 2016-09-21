/* 
Programmer: Alex Durso

Program Name: ReverseWord.java

Date: 10/27/2015

Purpose: Check if input is a palindrome.

Met Specifications: Yes
*/
import java.util.Scanner; // This statement makes scanner available

public class ReverseWord
{
   public static void main(String[] args) 
      { 
         //Declare variables
         int length;
         String inputWord;
         String reverseWord;
         String character;
         
         //Gather input
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter a word: ");
         inputWord = scanner.nextLine();
         
         length = inputWord.length(); //Set length to length of inputWord
         if(length <=0)
         {
         System.out.println("Please enter a word: ");
         inputWord = scanner.nextLine();
         }
         else
         {
         character = inputWord.substring(length-1, length);
         reverseWord  = reverseWord + character;
         length = length - 1;
         }
         if(length > 0)
         {
         character = inputWord.substring(length-1, length);
         reverseWord  = reverseWord + character;
         length = length - 1;
         }
         else
         {
         System.out.println(inputWord);
         System.out.println(reverseWord);
         if(inputWord.equals(reverseWord))
         {
         System.out.println("Word is a palindrome.");
         }
         else
         {
         System.out.println("Word is not a palindrome.");
         }
      }
   }  
}                   