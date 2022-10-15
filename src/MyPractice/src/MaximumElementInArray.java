//Write a java program to find the maximum element in an array

import java.util.Scanner;
public class MaximumElementInArray
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of elements you want in an array:");
    int number = input.nextInt();
    //allocation memory for an array
    int[] element = new int[number];
    //initializing variable
    int maximum = 0;
    //loop to get element from a user
    System.out.println("Enter " + number + " elements:");
    for(int i = 0; i < number; i++) {
      element[i] = input.nextInt();
      if(element[i] > maximum) {
        maximum = element[i];
      }
    }
    System.out.println("The maximum element is: " + maximum);
  }
}
