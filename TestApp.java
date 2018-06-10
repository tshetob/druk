/* *******************************************************************
 * 
 * Print the number of integers in an array that are above the given input 
 * and the number that are below, 
 * e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.
 *
 * *****************************************************************
 */

/** -------------- TestApp.java -------------- **/

import Calculator.CheckIntPosition;

/* Main class */
public class TestApp
{
  public static void main(String[] args)
  {
    // Input arrays //
    int[] inputOne        = {1, 5, 2, 1, 10};
    int[] inputTwo        = {8, -9, 3, 2, 0, 7, 23, 10};
    int[] inputThree      = {9, 1, 3, 33, -2, 1, 6};
    int[] inputUpdatedOne = {7, 0, 3, 100, 22, -3, 2, 6, 8, 1};
    
    // Object instantiations //
    CheckIntPosition objOne   = new CheckIntPosition(inputOne);
    CheckIntPosition objTwo   = new CheckIntPosition(inputTwo);
    CheckIntPosition objThree = new CheckIntPosition(inputThree);
    
    // Results //
    System.out.println(objOne.getResults(6));                  // Expected result: above: 1, below: 4
    System.out.println(objTwo.getResults(-2));                 // Expected result: above: 7, below: 1
    System.out.println(objThree.getResults(0));                // Expected result: above: 6, below: 1
    System.out.println(objOne.getResults(5, inputUpdatedOne)); // Expected result: above: 5, below: 5
  }
}
