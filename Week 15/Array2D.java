/* 
Programmer: Alex Durso

Program Name: 2DArray.java

Date: 12/14/2015

Purpose: 
Write a program that creates a two-dimensional array initialized with test data. 
Use any primitive data type you wish. The program should have the following methods.

getTotal - This method should accept a two-dimensional array as its argument and return the total of all the values in the array.

getAverage - This method should accept a two-dimensional array as its argument and return the average of all the values in the array.

getRowTotal. - This method should accept a two-dimensional array as its first argument and an integer as its second argument. 
The second argument should be the subscript of a row in the array. The method should return the total of the values in the specified row.

getColumnTotal - This method should accept a two-dimensional array as its First argument and an integer as its second argument. 
The second argument should be the subscript of a column in the array. The method should return the total of the values in the specified column.

getHighestInRow - This method should accept a two-dimensional array as its First argument and an integer as its second argument. 
The second argument should be the subscript of a row in the array. The method should return the Highest values in the specified row in the array.

getLowestInRow - This method should accept a two-dimensional array as its First argument and an integer as its second argument. 
The second argument should be the subscript of a row in the array. The method should return the lowest values in the specified row in the array.

Demonstrate each of the methods in this program.

Met Specifications: Yes
*/
import java.util.Scanner;
public class Array2D{
	
   /**
   getTotal method.
   @param array A 2D array of doubles.
   @return The total of the values stored in the argument array.
   */
	public static double getTotal(double[][] array) {
    double total = 0;

    for (int row = 0; row < array.length; row++) {
        for (int col = 0; col < array[row].length; col++) {
            total += array[row][col];
        }
    }

    return total;
    }
    
   /**
      getAverage method
      @param array A 2D array of integers.
      @return The average of the values stored in the
              argument array.
   */
   public static double getAverage(double[][] array) {
    return getTotal(array) / getElementCount(array);
    }

   /**
      getRowTotal method.
      @param array A 2D array of integers.
      @param row A specified row
      @return The total of the values stored in the
              specified row of the argument array.
   */
   public static double getRowTotal(double[][] array, int row) {
    double total = 0;

    for (int col = 0; col < array[row].length; col++) {
        total += array[row][col];
    }

    return total;
    }

   /**
      getColumnTotal method.
      @param array A 2D array of integers.
      @param col A specified col
      @return The total of the values stored in the
              specified column of the argument array.
   */
   public static double getColumnTotal(double[][] array, int col) {
    double total = 0;

    for (int row = 0; row < array.length; row++) {
        total += array[row][col];
    }

    return total;
    }
    
  /**
      getHighestInRow method.
      @param array A 2D array of integers.
      @param row A specified row.
      @return The highest value stored in the
              specified row of the argument array.
   */
   public static double getHighestInRow(double[][] array, int row) {
    double highest = array[row][0];

    for (int col = 1; col < array[row].length; col++) {
        if (array[row][col] > highest) {
            highest = array[row][col];
        }
    }
    return highest;
    }
    
  /**
      getLowestInRow method.
      @param array A 2D array of integers.
      @param row A specified row.
      @return The lowest value stored in the
              specified row of the argument array.
   */
   public static double getLowestInRow(double[][] array, int row) {
    double lowest = array[row][0];

    for (int col = 1; col < array[row].length; col++) {
        if (array[row][col] < lowest) {
            lowest = array[row][col];
        }
    }
    return lowest;
    }
    
  /**
      getElementCount method.
      @param array A 2D array of integers.
      @return The number of elements in the
              argument array.
   */
   public static int getElementCount(double[][] array) {
    int count = 0;

    for (int row = 0; row < array.length; row++) {
        count += array[row].length;
    }
    return count;
    }

   public static void main(String[] args) {
    //The array studentTestScores is loaded with double values.     
    double[][] studentTestScores = { { 65.5, 54.43, 23.54, 99.5 },
            { 33.4, 22.55, 54.66, 11.12 } };

    //Process double array and output answers
    System.out.println("Total : " + getTotal(studentTestScores));
    System.out.println("Average : " + getAverage(studentTestScores));

    System.out.println("Total of row 0 : "
            + getRowTotal(studentTestScores, 0));
    System.out.println("Total of row 1 : "
            + getRowTotal(studentTestScores, 1));

    System.out.println("Total of col 0 : "
            + getColumnTotal(studentTestScores, 0));
    System.out.println("Total of col 1 : "
            + getColumnTotal(studentTestScores, 2));

    System.out.println("Highest in row 0 : "
            + getHighestInRow(studentTestScores, 0));
    System.out.println("Highest in row 1 : "
            + getHighestInRow(studentTestScores, 1));

    System.out.println("Lowest in row 0 : "
            + getLowestInRow(studentTestScores, 0));
    System.out.println("Lowest in row 1 : "
            + getLowestInRow(studentTestScores, 1));

   }
}