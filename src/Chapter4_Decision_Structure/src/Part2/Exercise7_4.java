/*Exercise 7.04
Write a program that asks the user to enter a username, a password and a confirmation password.
Then print out the username, and a message about whether or not the entered password and
confirmation password are identical. */
package Part2;

import java.util.Scanner;

public class Exercise7_4
{
  public static void main(String[] args)
  {
    //getting info from user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a username: ");
    String userName = input.nextLine();
    System.out.print("Enter a password: ");
    String password = input.nextLine();
    System.out.print("Confirm your password: ");
    String confirmation = input.nextLine();

    //comparing password and confirmation password using equals() method that compares the two Strings
    System.out.println("Username: " + userName);
    //comparing two strings
    if(password.equals(confirmation))
    {
      System.out.println("Password created successfully");
    }
    else
    {
      System.out.println("Entered p"
          + "assword and confirmation password do not match");
    }
  }
}
