/* 
Programmer: Alex Durso

Program Name: BMICalculator.java

Date: 10/5/2015

Purpose: Provide a simple tool for user to 
calculate BMI

Met Specifications: Yes
*/
import java.util.Scanner;  // This statement makes scanner available

public class BMICalculator
{
   public static void main(String[] args)
   {
      //Gather User Input
      //Input height
      System.out.println("Welcome to the BMI calculator. " +  
                         " Please input your height in inches: ");
      Scanner scanner = new Scanner(System.in);
      double height = scanner.nextDouble();
      
      //Input weight
      System.out.println("Please enter your weight in pounds: ");
      double weight = scanner.nextDouble();
      scanner.nextLine();  // Consume newline left-over
     
      
      //Calculation
      double BMI = (weight * 703)/(height * height);
      
      //Output
      if(BMI < 18.5)
      {
         System.out.println("You are underweight.");
      }
      else if (BMI < 25 && BMI > 18.5)
      {
         System.out.println("Your BMI is optimal.");
      }
      else if (BMI > 25)
      {
         System.out.println("You are overweight.");
      }
      else
      {
         System.out.println("Invalid operation.");
      }    
   }
}