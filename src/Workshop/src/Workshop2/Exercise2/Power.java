/*d) Result(n) = 2n e.g. Result(5) = 32*/
package Workshop2.Exercise2;

import java.util.Scanner;

public class Power
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int n = input.nextInt();
    double result = Math.pow(2,n);
    System.out.println("2 to the power " + n + " is " + result);
  }
}
