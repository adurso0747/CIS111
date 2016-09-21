/* 
Programmer:  Alex Durso
  
Program Name:  Converter.java

Date: 9/29/2015

Purpose: Convert celsius to fahrenheit

Met Specifications: Yes
*/
import java.util.Scanner;  // This statement makes scanner available


public class Converter
{
   public static void main(String[] args)
   {
      //Declare variables
      Double F;
      Double C = 0.0;
      
      //No input so skip straight to processing
      do{
      F = (1.8 * C) + 32;
      
      //Output
      System.out.println("Celsius \t Fahrenheit");
      System.out.println("************************************");
      System.out.println(C + " \t   \t" + F );
      
      //Increment celsius
      C=C + 1;
       
      }while(C<=20);
   }
}
      
      
      