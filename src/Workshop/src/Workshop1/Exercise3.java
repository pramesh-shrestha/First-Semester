/*Exercise 3:
Make a simple calculator method that can add / subtract / multiply and divide two numbers using
Switch / Case statements. (The method should take in 2 numbers and an operator and return a
value, if an operator is not supported the method should output “OPERATOR NOT SUPPORTED”)
IMPORTANT: Display 4 digits after the decimal point when dividing.
Hint: Try to use the DecimalFormat class.*/
package Workshop1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise3
{
  public static void main(String[] args)
  {
    DecimalFormat formatter = new DecimalFormat("0.0000");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any two numbers:");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();

    System.out.println("Enter:\n1 for addition \n2 for subtraction \n3 for multiplication \n4 for division");
    int choice = input.nextInt();

    switch (choice)
    {
      case 1:
        System.out.println("The sum is " + (num1 + num2));
        break;

      case 2:
        System.out.println("The difference is " + (num1 - num2));
        break;

      case 3:
        System.out.println("The product is " + (num1 * num2));
        break;
      case 4:
        System.out.println("The quotient is " + formatter.format(num1/num2));
        break;

      default:
        System.out.println("Operator not supported");
    }
  }
}
