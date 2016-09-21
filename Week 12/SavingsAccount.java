/* 
Programmer: Alex Durso

Program Name: SavingsAccount.java

Date: 11/24/2015

Purpose: Allow user to calculate balance of their savings account

Met Specifications: Yes
*/
import java.util.Scanner; //Makes scanner class available

class SavingsAccountDemo {
	public static void main(String[] args)
	{
      //Initialize monthsPassed variable at 0
		int monthsPassed = 0;
		
      //Create scanner object to hold user input
		Scanner userInput = new Scanner(System.in);
		
		//Retrieve starting balance and create demoAccount object
		System.out.print("Please enter the starting balance: $");
		SavingsAccount demoAccount = new SavingsAccount(userInput.nextDouble());
		
		//Get annual interest rate
		System.out.print("Enter the annual interest rate (decimal): ");
		demoAccount.setAnnualInterestRate(userInput.nextDouble());
		
		//Gets numbers of months that have passed since the establishment of the account
		System.out.print("Enter the number of months that have passed since the account\'s establishment: ");
		monthsPassed = userInput.nextInt();
		
		//Loop to iterate once for every month
		for (int count = 1; count <= monthsPassed; count++)
		{
			//Display month number
			System.out.println("\n-----MONTH " + count + "-----");
			
			//Get amount deposited into account for the month
			System.out.printf("Enter the amount deposited into the account: $");
			demoAccount.deposit(userInput.nextDouble());
			
			
			//Get amount withdrawn from the account for the month
			System.out.printf("Enter the amount withdrawn from the account: $");
			demoAccount.withdraw(userInput.nextDouble());
			
			//Displays and adds monthly interest
			System.out.printf("This month\'s interest is: $%.2f\n", demoAccount.getMonthlyInterest());
			demoAccount.addMonthlyInterest();
		}
		
      //Output
		System.out.printf("\nEnding balance: $%.2f", demoAccount.getBalance());
		System.out.printf("\nTotal deposits: $%.2f", demoAccount.getAccumulativeDeposits());
		System.out.printf("\nTotal withdrawals: $%.2f", demoAccount.getAccumulativeWithdrawals());
		System.out.printf("\nTotal interest: $%.2f", demoAccount.getAccumulativeInterest());
		
		
		userInput.close(); 
	}
}
public class SavingsAccount {
   
   //Declare variables
	private double annualInterestRate, balance, accumulativeInterest, accumulativeDeposits = 0, accumulativeWithdrawals = 0;

	/**
    * Constructor
    * @param b The account's start balance. 
    */
	public SavingsAccount(double b)
	{
		balance = b;
	}
	
	// Mutators
   
   /**
    * Subtracts the amount from the balance and calculates the total withdrawal
    * @param w
    */
	public void withdraw(double w)
	{
		balance -= w;
		accumulativeWithdrawals += w;
	}
   
	/**
    * Adds the amount to the balance and calculates the total deposit
    * @param d
    */
	public void deposit(double d)
	{
		balance += d;
		accumulativeDeposits += d;
	}
   
	/**
    * Calculates the total interest and adds the monthly interest to the balance 
    */
	public void addMonthlyInterest()
	{
		accumulativeInterest += balance * (annualInterestRate/12);
		balance += balance * (annualInterestRate/12);
	}
	
	// Setters
   
    /**
    * Assigns balance to variable b 
    */
	public void setBalance(double b)
	{
		balance = b;
	}
	
   /**
    * Assigns annualInterestRate to variable air
    */
	public void setAnnualInterestRate(double air)
	{
		annualInterestRate = air;
	}
	
	// Getters
   
   /**
    * @return The account's balance
    */
	public double getBalance()
	{
		return balance;
	}
   
   /**
    * @return The annual interest rate
    */	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
   /**
    * @return The monthly interest rate.
    */
	public double getMonthlyInterest()
	{
		return balance * (annualInterestRate/12);
	}
   
	/**
    * @return The total interest
    */
	public double getAccumulativeInterest()
	{
		return accumulativeInterest;
	}
	/**
    * @return The total deposits
    */
	public double getAccumulativeDeposits()
	{
		return accumulativeDeposits;
	}
   
	/**
    * @return The total withdraws
    */
	public double getAccumulativeWithdrawals()
	{
		return accumulativeWithdrawals;
	}
}