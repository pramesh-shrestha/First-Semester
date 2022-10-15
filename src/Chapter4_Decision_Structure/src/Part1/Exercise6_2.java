/*Exercise 6.02Write a program that reads a gender (char 'M' or 'F') and an age (int)
from the keyboard and then prints a message (Hint: for some reason there is no nextChar()
method when using a Scanner object, so first read a String with the nextLine() method and
then use charAt(0) on the String to extract the first char).The message should depend on
the typed values, in the following way: •If gender is not either 'M' or 'F' or age is less
than 0 display the message: "Error in typed values". •If gender is 'M' and age is less than
18 display the message: "Boy". •If gender is 'M' and age is greater than or equal to 18 display
the message: "Man". •If gender is 'F' and age is less than 18, display the message: "Girl". •
If gender is 'F' and age is greater than or equal to 18 display the message: "Woman". As in the
first exercise, test the program by running it multiple times and entering different values.
 */

package Part1;

import java.util.Scanner;

public class Exercise6_2
{
  public static void main(String[] args)
  {
    String gender;
    int age;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your gender: ");
    gender = input.nextLine();
    char sex = gender.charAt(0);
    System.out.print("Enter age: ");
    age = input.nextInt();

    if(sex == 'M' && age < 18 && age >= 0)
    {
      System.out.println("Boy");
    }
    else if(sex == 'M' && age > 18)
    {
      System.out.println("Man");
    }
    else if(sex == 'F' && age < 18 && age >=0)
    {
      System.out.println("Girl");
    }
    else if(sex == 'F' && age > 18)
    {
      System.out.println("Woman");
    }
    else
    {
      System.out.println("Error in typed values");
    }


  }
}
