/*Exercise 2:Using loops, calculate the result for the following functions for any given n
 (read from the keyboard)
 a) Result(n) = 1+2+3+...n e.g. Result(5) = 15
 b) Result(n) = n! e.g Result(5) = 120
 c)Result(n) = 1/(1+2) + 2/(2+3) + ... + n/(2n + 1) e.g. Result(3) = 1.161
 d) Result(n) = 2ne.g. Result(5) = 32*/
package Workshop2.Exercise2;

import java.util.Scanner;

public class Sum
{
  public static void main(String[] args)
  {
    int i, sum = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int n = input.nextInt();
    for(i = 1; i <=n; i++)
    {
      sum = sum + i;
    }
    System.out.println("The result is: " + sum);

  }
}
