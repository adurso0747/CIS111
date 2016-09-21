/* 
Programmer:  Alex Durso
  
Program Name:  WordGame.java

Date: 9/29/2015

Purpose: Play word game with user

Met Specifications: Yes
*/
import java.util.Scanner;  // This statement makes scanner available


public class WordGame
{
   public static void main(String[] args)
   {
      //Input name
      System.out.println("Enter your name: ");
      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();
      
      //Input age
      System.out.println("Enter your age: ");
      String age = scanner.nextLine();
     
      //Input city
      System.out.println("Enter the name  of a city: ");    
      String city = scanner.nextLine();
      
      //Input name of College
      System.out.println("Enter the name  of a college: ");
      String collegeName = scanner.nextLine();
      
      //Input profession
      System.out.println("Enter profession: ");
      String profession = scanner.nextLine();
      
      //Input type of animal
      System.out.println("Enter a type  of animal: ");
      String animal = scanner.nextLine();
      
      //Input pet name
      System.out.println("Enter a pet name : "); 
      String petName = scanner.nextLine();
           
      //Process and output all variables
       System.out.println("There once was a person named "
                                    + name + " who lived in " + city + ". At the " 
                                    + " age of " + age + " " + name + " went to " 
                                    + " college at " + collegeName + ". " +
                                    name + " graduated and went to work as a " + 
                                    profession + ". Then " + name + " adopted a(n) "
                                    + animal + " named " + petName + ". They both lived happily ever after! ");

      
      // End program.
      System.exit(0);
    }
}
