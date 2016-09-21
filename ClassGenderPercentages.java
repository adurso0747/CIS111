/* 
Programmer:  Alex Durso
  
Program Name:  ClassGenderPercentages.java

Date: 9/29/2015

Purpose: Calculate gender percentages

Met Specifications: Yes
*/
import java.util.Scanner;  // This statement makes scanner available

public class ClassGenderPercentages
{
   public static void main(String[] args)
   {
      //Gather user input
      System.out.println("Enter number of males registered:");
      Scanner scanner = new Scanner(System.in);
      float males = scanner.nextFloat();
      
      //Gather user input
      System.out.println(" Enter number of females registered:");
      float females = scanner.nextFloat();
      
      //Calculate
      float malePercentage = (males/(males+females) * 100);
      float femalePercentage = (females/(females+males) * 100);
      
      //Output answer
      System.out.print(" The percentage of males registered is: "+
                         malePercentage + "%\nThe percentage of females"+
                         " registered is: "+ femalePercentage + "%");
      
    }
}