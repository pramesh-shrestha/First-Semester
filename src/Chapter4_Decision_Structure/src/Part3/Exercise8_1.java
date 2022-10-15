/*Exercise 8.01
Write a program that generates a random number between 1 and 10, and then asks the
user to try to guess it. When the user enters a guess, compare it with the random generated
number, and then tell the user if the guess was correct, or not. */
package Part3;

import java.util.Random;
import java.util.Scanner;

public class Exercise8_1
{
  public static void main(String[] args)
  {
    Random random = new Random();
    int randomNumbers = random.nextInt(10)+1;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number in the range 1 to 10: ");
    int number = input.nextInt();

    //comparing user input with the random number generated
    if(number == randomNumbers)
    {
      System.out.println("You guessed right");
    }
    else
    {
      System.out.println("You guessed wrong");
    }

  }
}
