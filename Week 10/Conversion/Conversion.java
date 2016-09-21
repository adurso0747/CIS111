/* 
Programmer: Alex Durso

Program Name: Conversion.java

Date: 11/09/2015

Purpose: Allow user to convert meters to a variety of distance formats.

Met Specifications: Yes
*/
import java.util.Scanner; //Statement allows scanner class to be used

public class Conversion {
	public static void main (String args[])
	{
      //Declare variable to hold user's value in meters
		double meters;
		
      //Create scanner to receive user input
		Scanner userInput = new Scanner(System.in);
		
      //Prompt user for number of meters
		System.out.print("Enter the number of meters: ");
      
      //Verify user has entered a number
		if (!userInput.hasNextInt()) 
         { 
          System.out.println("Please enter a valid number"); 
          System.exit(1); 
         }
   
      //Set variable meters to user's next double
      meters = userInput.nextDouble();
      
      //Verify user has entered a number greater than 0
		if (meters <=0) 
         { 
          System.out.println("Please enter a valid number"); 
          System.exit(1); 
         }
 
      //Call menu method
		menu(meters);
		
      //Close user input
		userInput.close();
	}
	//Methods
   
     /*
     *
     * menu() - Displays menu for user to choose from
     * @param User choice
     * 
     */ 
	public static void menu (double meters)
	{
      //Declare variable choice to hold user's decision
		int choice;
		
      //Create new scanner to receive user input
		Scanner menuChoice = new Scanner(System.in);
		
      //List user's options in a menu
		System.out.println("\n1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
		
      //Prompt user for input
		System.out.print("\nYour choice: ");
		
      //Return user input as an integer
		choice = menuChoice.nextInt();
		
      //Create switch statement to call upon the correct
      //method based on user's choice.
		switch (choice)
		{
			case 1: showKilometers(meters);
					break;
			case 2: showInches(meters);
					break;
			case 3: showFeet(meters);
					break;
			case 4: quitProgram(meters);
					break;
			default: System.out.println("Invalid input!"); menu(meters);
					break;
		}
		
		menuChoice.close(); 
	}
	  /*
     *
     * showKilometers() - Displays user's number in Kilometers
     * @param Kilometers
     *
     */ 
	public static void showKilometers (double meters)
	{
      //Converts users meters to kilometers
		double kilometers = meters * 0.001;
		
      //Outputs distance in kilometers to user
		System.out.println("\n\n" + meters + " meters is " + kilometers + " kilometers.");
		
      //Return to menu method
		menu(meters);
	}
	  /*
     *
     * showInches() - Displays user's number in inches
     * @param Inches
     *
     */ 
	public static void showInches(double meters)
	{
      //Converts user's meters to inches
		double inches = meters * 39.37;
		
      //Outputs distance in inches to user
		System.out.println("\n\n" + meters + " meters is " + inches + " inches.");
		
      //Return to menu method
		menu(meters);
	}
	  /*
     *
     * showFeet() - Displays user's number in feet
     * @param Feet
     *
     */ 
	public static void showFeet (double meters)
	{
      //Converts user's meters to feet
		double feet = meters * 3.281;
	   
      //Outputs distance in feet to user
		System.out.println("\n\n" + meters + " meters is " + feet + " feet.");
		
      //Return to menu method
		menu(meters);
	}
	  /*
     *
     * quitProgram() - Ends program when user is finished.
     */ 
	public static void quitProgram (double meters)
	{
		System.exit(0);
	}
}