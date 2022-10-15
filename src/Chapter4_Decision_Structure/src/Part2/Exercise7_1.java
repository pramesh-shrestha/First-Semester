/*Exercise 7.01
Write a program that asks a user to enter a number within the range 1-10. The program should then
display the Roman numeral version of the entered number. If the number is outside the range 1-10,
the program should display an error message of your choice. The first ten Roman numerals are {I, II,
III, IV, V, VI, VII, VIII, IX, X}. */

package Part2;

import java.util.Scanner;

public class Exercise7_1
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number within range 1-10: ");
    int number = input.nextInt();

    if(number == 1)
    {
      System.out.println("I");
    }
    else if(number == 2)
    {
      System.out.println("II");
    }
    else if(number == 3)
    {
      System.out.println("III");
    }
    else if(number == 4)
    {
      System.out.println("IV");
    }
    else if(number == 5)
    {
      System.out.println("V");
    }
    else if(number == 6)
    {
      System.out.println("VI");
    }
    else if(number == 7)
    {
      System.out.println("VII");
    }
    else if(number == 8)
    {
      System.out.println("VIII");
    }
    else if(number == 9)
    {
      System.out.println("IX");
    }else if(number == 10)
    {
      System.out.println("X");
    }
    else
    {
      System.out.println("Number out of range");
    }
  }
}
