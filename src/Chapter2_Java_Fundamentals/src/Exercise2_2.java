//Write an application that reads three integers from the keyboard and
//displays the sum and the product on the screen.

import java.util.Scanner;
public class Exercise2_2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int num1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int num2 = input.nextInt();
    System.out.print("Enter third integer: ");
    int num3 = input.nextInt();
    int sum = num1 + num2 + num3;
    int product = num1 * num2 * num3;
    System.out.println("The sum is: " + sum);
    System.out.printf("The product is %,d\n", product);
  }
}
