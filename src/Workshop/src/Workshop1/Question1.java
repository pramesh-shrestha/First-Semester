package Workshop1;

import java.util.Scanner;

public class Question1
{
  public static void main(String[] args)
  {
    //getting input from user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter second number: ");
    int num2 = input.nextInt();
    System.out.print("Enter third number: ");
    int num3 = input.nextInt();

    //displaying the product
    System.out.printf("The product is %d\n", (num1 * num2));

    //displaying the sum
    System.out.printf("The sum is %d\n", (num1 + num2));

    //displaying the quotient
    double quotient = (double)num2/num3;
    System.out.printf("The quotient is %.2f\n", quotient);

    //displaying the difference
    System.out.printf("The difference is %d", (num2 - num3));

  }
}
