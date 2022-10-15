package session1;/*Exercise 09.06
Guess a number part 2. Write a program that generates a random number between 1 and
1000, and then asks the user to try and guess it. Every time the user makes a wrong guess,
display whether the guess was too high or too low, and ask the user to make another
guess. When the user guesses the right number, display how many attempts were needed*/

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Exercise9_6
{
  public static void main(String[] args)
  {
    System.out.println("This program generates a random number between 1 and 1000");
    System.out.println();

    //creating Random object
    Random random = new Random();
    int number = random.nextInt(1000) + 1;
    int guess;
    int attempt = 0;
    do
    {
      //input from user
      Scanner input = new Scanner(System.in);
      System.out.print("Guess the number: ");
      guess = input.nextInt();
      //increments the attempts
      attempt = attempt + 1;

      //if the user guesses correct
      if(guess == number)
      {
        System.out.println("Correct!! " + attempt + " attempts were needed for the correct guess");
      }
      else //if user guesses wrong
      {
        if (guess > number)
        {
          System.out.println("Your guess is too high");
        }
        else
        {
          System.out.println("Your guess is too low");
        }

        System.out.println("Try again");
      }
    }while(guess != number); //breaks the loop if the guess is correct
  }
}
