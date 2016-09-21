/* 
Programmer: Alex Durso

Program Name: Array10.java

Date: 11/31/2015

Purpose: Initializes an array with ten random integers and then prints four lines of output containing the following:

Line 1: every element at an even index

Line 2 : every element with an even value

Line 3: all elements in reverse order

Line 4: only the first and last element

Met Specifications: Yes
*/
import java.util.*;
class  Array10{
    public static void main(String[] args){
      
      //Initialize new random object      
      Random random = new Random();
      
      //Initialize array with index of 10
      int arr[]=new int[10];
      
      //Output array
      System.out.println("The array of random numbers: ");
      
      //For loop to print random integers
      for (int i = 0; i < arr.length; i++) 
         {
          arr[i] = random.nextInt(50);
          System.out.println(arr[i]);
         }
         
      //Output numbers with even indices   
      System.out.println("Elements with even index:");
      
      //For loop to print elements with even indices
      for (int i = 0; i < arr.length; i++) 
         {
          if(i%2==0){
          System.out.println(arr[i]+" at: "+i);
         }
      }
      
      //Output numbers with even values
      System.out.println("Elements with even values:");
      
      //For loop to print elements with even values
      for (int i = 0; i < arr.length; i++) 
         {
          if(arr[i]%2==0){
          System.out.println(arr[i]);
         }
      }
      
      //Output numbers in reverse order
      System.out.println("Elements in reverse order: ");
      for(int i=arr.length-1;i>=0;i--)
         {
          System.out.println(arr[i]);
         }
         System.out.println("The first element is "+arr[0]+" and the last element is "+arr[arr.length-1]);
    }
}