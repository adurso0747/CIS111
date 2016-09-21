/* 
Programmer: Alex Durso

Program Name: ReverseWord.java

Date: 10/27/2015

Purpose: Check if input is a palindrome.

Met Specifications: Yes
*/
import java.util.*; //Allows scanner class
import java.io.*; //Allows input and output of text files

public class ReverseWord
{
   public static void main(String[] args) throws IOException
   {
      //Define variables
      boolean conditionsMet;
      String inputWord, reverseWord = "";
      int length;
      
      //Set loop to verify if text file has length > 0
      do{
         //Gather User Input
         Scanner input = new Scanner(System.in);
		   System.out.print("Enter file name:");
		   String fileName = input.nextLine();
         File file = new File(fileName);
         
         //Verify File exists
         if(!file.exists())
            {
             System.out.println("File not found.");
             System.exit(0);
            }
         //Verify file has text
		   Scanner fileInput = new Scanner(file);  
         
         //Process word 
         if(fileInput.hasNextLine())
            {   
             inputWord = fileInput.nextLine();
             length = inputWord.length();
             for ( int i = length - 1; i >= 0; i-- )
             reverseWord = reverseWord + inputWord.charAt(i);
            
             //Output to user   
             System.out.println(inputWord);
             System.out.println(reverseWord);
             if (inputWord.equals(reverseWord))
               {
                System.out.println("Word is palindrome.");
               }
             else 
               {
                System.out.println("Word is not a palindrome.");
               }
            //Set conditionsMet to true to end program
            conditionsMet = true;
            }
      //Restart loop if empty text file was entered.
      else
      conditionsMet = false;
      }while(!conditionsMet);
   }
}

