/*Write a program that reads 5 integers from keyboard and stores them in an array. Then use
a loop to calculate the average value of the integers, and after the loop print out the result. */

import java.util.Scanner;

public class AverageOfAnArray
{
  public static void main(String[] args)
  {
    //allocating memory for the inputs from the user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    //getting inputs from a user
    int integers = input.nextInt();
    int[] num = new int[integers];
    //declare and initialize sum
    int sum = 0;
    System.out.println("Enter " + integers +  " integers ");
    //adding elements to the array
    for(int i = 0; i < integers; i++){
      num[i] = input.nextInt();
      //adding each marks of the array
      sum = sum + num[i];
    }
    float average = sum/integers;
    System.out.println("The average marks is: " + average);
  }

}
