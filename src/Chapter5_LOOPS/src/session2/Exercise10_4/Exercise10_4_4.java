/*Write a program that asks the user for a positive nonzero integer value. The program
should use a loop to get the sum of all the integers from 1 up to the number entered. For
example, if the user enters 50, the loop will find the sum of 1, 2, 3, 4, . . . , 50*/
package session2.Exercise10_4;

import java.util.Scanner;

public class Exercise10_4_4
{
  public static void main(String[] args)
  {
    System.out.println("This program print the sum of all integers from 1 to the given number");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int number = input.nextInt();
    int sum = 0; //initializing accumulator

    for(int i = 1; i <= number; i++)
    {
      sum = sum +i;
    }
    System.out.print("The sum of all integers is: " + sum);
  }
}
