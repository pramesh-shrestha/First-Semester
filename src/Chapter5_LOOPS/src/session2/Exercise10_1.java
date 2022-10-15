/*Exercise 10.01
Write a program that asks the user for a username, a password and a confirmation
password. Keep asking the user until the password and confirmation passwords match.
Then print out the entered username and password and exit*/
package session2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Exercise10_1
{
  public static void main(String[] args)
  {
    String username, password, confirmation;
    do
    {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Username: ");
      username = input.nextLine();
      System.out.print("Enter Password: ");
      password = input.nextLine();
      System.out.print("Confirm Password: ");
      confirmation = input.nextLine();
      System.out.println("\nPassword do not match, try again\n");
    }while(!password.equals(confirmation));

    System.out.printf("Username: %s\nPassword: %s", username,password);

  }
}
