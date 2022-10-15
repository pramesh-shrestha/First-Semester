package session1;/*Exercise 09.05
Write a program that prompts the user for a string, and prints its reverse. E.g. the string
"Hello" typed on the keyboard will be printed out as "olleH". Keep doing this over
and over, until the user enters the string "quit".
Note that the method charAt(index) in the String class can be used to get the
character at a specific index in the string, and the method length() can be used to get
the number of characters in the string. When comparing strings, the method equals()
might be useful. */

import java.util.Scanner;
public class Exercise9_5
{
  public static void main(String[] args)
  {
    System.out.println("This program displays the reverse order of your string input");
    Scanner input = new Scanner(System.in);

    while(true)
    {
      System.out.print("Enter any string value: ");
      String string = input.nextLine();

      if(string.equalsIgnoreCase("Quit"))
      {
        break;
      }
      else
      {
        int i;
        for(i =1; i <= string.length(); i++)
        {
          //string.charAt(string.length()) - i gives the last character of the string and as the value of
          //i increases the index position decreases
          System.out.print(string.charAt(string.length() - i));
        }
        System.out.println(); //newline
      }
    }
  }
}
