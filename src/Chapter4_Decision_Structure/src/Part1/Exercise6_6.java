/*Exercise 6.06
In math a quadratic equation is given as:
ax² + bx + c = 0
For such an equation the determinant (D) is defined as
D = b² - 4ac
and the solution to the equation can then be calculated as:
 If D<0, there is no solution
 If D=0, there is one solution:
x= -(b/2a)
 If D>0, there are two solutions:
x1 = (-b + (D)½)/2a and x2 = (-b - (D)½)/2a

Create a program that asks the user to input values for a, b and c, then calculates the
solutions (if any) to a quadratic equation defined by those values, and prints them out.
Remember that in Java the square root of a number is found by: Math.sqrt(number). */
package Part1;

import java.util.Scanner;

public class Exercise6_6
{
  public static void main(String[] args)
  {
    double D, x, x1,x2,a,b,c;

    // getting input from the user for a,b, and c
    Scanner input = new Scanner(System.in);
    System.out.print("Enter value for a: ");
    a = input.nextDouble();
    System.out.print("Enter value for b: ");
    b = input.nextDouble();
    System.out.print("Enter value for c: ");
    c = input.nextDouble();

    //calculation
    D = (b * b) - (4 * a * c);

    if(D > 0)
    {
      x1 = (-b + Math.sqrt(D))/2 * a;
      x2 = (-b - Math.sqrt(D))/2 * a;
      System.out.printf("For D > 0, the value of x1 is %.2f and x2 is %.2f", x1,x2);
    }
    else if(D == 0)
    {
      x = -(b /2 * a);
      System.out.print("For D = 0, the value of x is: ");
    }
    else
    {
      System.out.println("For D < 0, no solution");
    }
  }
}
