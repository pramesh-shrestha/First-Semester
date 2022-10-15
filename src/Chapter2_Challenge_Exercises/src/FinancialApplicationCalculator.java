/*(Financial application: calculate tips) Write a program that reads the subtotal
 and the gratuity rate, then computes the gratuity and total. For example, if the
 user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 as gratuity and $11.5 as total. Here is a sample run:
Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5*/

import  java.util.Scanner;
public class FinancialApplicationCalculator
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal and gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuity = input.nextDouble();
    double gratuityRate = gratuity/100.00 * subtotal;
    double total = gratuityRate + subtotal;
    System.out.println("The gratuity is $" + String.format("%.1f", gratuityRate) +
        " and total is $" + String.format("%.1f", total));

  }
}
