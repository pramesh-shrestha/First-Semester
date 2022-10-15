/*1. Roman Numerals
Write a program that prompts the user to enter a number within the range of 1 through 10.
The program should display the Roman numeral version of that number. If the number is
outside the range of 1–10, the program should display an error message.*/
package Challenge1_Roman_numerals;

import java.util.Scanner;

public class RomanNumerals
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number between 1 and 10: ");
    int num = input.nextInt();
    try
    {
      if(num < 1 || num > 10)
      {
        throw new OutOfRangeException("Input mus be between 1 and 10");
      }
      if(num >= 1 && num <= 10)
      {
        if(num == 1)
        {
          System.out.println("I");
        }
        else if(num == 2)
        {
          System.out.println("II");
        }
        else if(num == 3)
        {
          System.out.println("III");
        }
        else if(num == 4)
        {
          System.out.println("IV");
        }
        else if(num == 5)
        {
          System.out.println("V");
        }
        else if(num == 6)
        {
          System.out.println("VI");
        }
        else if(num == 7)
        {
          System.out.println("VII");
        }
        else if(num == 8)
        {
          System.out.println("VIII");
        }
        else if(num == 9)
        {
          System.out.println("IX");
        }
        else
        {
          System.out.println("X");
        }
      }
    }
    catch (RuntimeException e)
    {
      System.out.println(e.getMessage());
    }
  }
}
