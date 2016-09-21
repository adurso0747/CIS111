/* 
Programmer: Alex Durso

Program Name: StockTransaction.java
Date: 09/29/2015

Purpose: Calculates profit made from selling stock

Met Specifications: Yes

Program pseudocode:

Ask for user input

Use user input to assign values to variables companyName, 
sharesPurchased, purchaseCommissionPercent, sellingCommissionPercent, purchasePrice, 
sharesSold,and sellingPrice.

Multiply variable purchasePrice by sharesPurchased by purchaseCommissionPercent
Set this value to purchaseCommissionPrice
Multiply variable purchasePrice by sharesPurchased and add purchaseCommissionPrice
Assign this value totalPurchasePrice

Multiply variable sellingPrice by sharesSold by sellingCommissionPercent
Set this value to sellingCommissionPrice
Multiply variable sellingPrice by sharesSold and add sellingCommissionPrice
Assign this value totalSellingPrice

Subtract totalPurchasePrice from totalSellingPrice and assign it the variable profit

Output to console "You paid " + purchasePrice
+" dollars for " + sharesPurchased + " shares" +
"of stock from " + companyName + ". The amount of commission 
paid when buying the stock was " + purchaseCommissionPrice +
". You sold the stock for " + sellingPrice + "and spent " + sellingCommissionPrice +
"to sell it. Overall you have made " + profit + "in profit."

Test Data: 
5 Shares bought at $2 a piece
%20 Commission
12 Dollars spent total for purchasing shares
Sold 5 shares at $3 a piece
%20 Commission
12 Dollars made from selling shares
Profit should be 0
  
*/
import java.util.Scanner;  // This statement makes scanner available
import java.lang.Math; //This statement makes math available


public class StockTransaction
{
   public static void main(String[] args)
   {
   
      //Gather user input
      
      //Input company name
      System.out.println("Enter the name of the company "  
                         + "you will be buying stock from: ");
      Scanner scanner = new Scanner(System.in);
      String companyName = scanner.nextLine();
      
      //Input shares purchased
      System.out.println("Enter the amount of shares you have purchased: ");
      double sharesPurchased = scanner.nextDouble();
      
      //Input price of shares when purchasing
      System.out.println("Enter the price per share when you bought the shares");
      double purchasePrice = scanner.nextDouble();
      
      //Input purchase commission
      System.out.println("Enter the purchase commission in decimals: ");
      double purchaseCommissionPercent = scanner.nextDouble();
      
      //Calculate purchaseCommissionPrice
      double purchaseCommissionPrice = purchaseCommissionPercent * purchasePrice * sharesPurchased;
      
      //Assign totalPurchasePrice a value
      double totalPurchasePrice = (purchasePrice * sharesPurchased) + purchaseCommissionPrice;
      
      //Input shares sold
      System.out.println("Enter the amount of shares you have sold: ");
      double sharesSold = scanner.nextDouble();
      
      //Input price of shares when selling
      System.out.println("Enter the price per share when you sold the shares: ");
      double sellingPrice = scanner.nextDouble();
      
      //Input selling commission
      System.out.println("Enter the selling commission in decimals: ");
      double sellingCommissionPercent = scanner.nextDouble();
      
      //Calculate sellingCommissionPrice
      double sellingCommissionPrice = sellingCommissionPercent * sellingPrice * sharesSold;
      
      //Assign totalSellingPrice a value
      double totalSellingPrice = (sellingPrice * sharesSold) - sellingCommissionPrice;
      
      //Calculate profit
      double profit = totalSellingPrice - totalPurchasePrice;
      
      //Output variables to user
      System.out.println("You paid $" + purchasePrice * sharesPurchased
                         +" dollars for " + sharesPurchased + " shares " +
                         "of stock from " + companyName + ". The amount of commission "+ 
                         "paid when buying the stock was $" + purchaseCommissionPrice +
                         ". You sold the stock for $" + sellingPrice * sharesSold + " and spent $" + sellingCommissionPrice +
                         " on commission to sell it. Overall you have made $" + profit + " in profit.");  
   }
}

      
      
      
      

      
      

     