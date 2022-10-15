//a)Write a program that asks the user to enter two numbers and prints the smallest of the numbers*/
package Part1.Exercise6_4;

import java.util.Scanner;
public class Exercise6_4A
{
  public class Exercise6_4_1
  {
    //Solution a
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    if(num1 < num2)
    {
      System.out.println(num1 + "is smallest among the two");
    }
    else
    {
      System.out.println(num2 + "is smallest among the two");
    }
  }
  }
}
