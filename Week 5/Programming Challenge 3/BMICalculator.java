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
      //Input weight
      System.out.println("Welcome to the BMI calculator. " +
                        "Please enter your weight in pounds: ");
      Scanner scanner = new Scanner(System.in);
      double weight = scanner.nextDouble();
      
      //Input height
      System.out.println("Please input your height in inches: ");
         double height = scanner.nextDouble();
      
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