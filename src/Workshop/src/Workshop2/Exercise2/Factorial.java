/*b) Result(n) = n! e.g Result(5) = 120*/
package Workshop2.Exercise2;

import java.util.Scanner;


public class Factorial
{
  public static void main(String[] args)
  {
    int i;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int n = input.nextInt();
    int factorial = n;
    for(i = n; i > 1; i--)
    {
      int m = i-1;
      factorial = factorial * m;

    }
    System.out.println("The result is: " + factorial);
  }
}

/*public class Factorial
{
  public static void main(String[] args)
  {
    int i;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int n = input.nextInt();
    int factorial = 1;
    for(i = 1; i <= n; i++)
    {
      factorial = factorial * i;
    }
    System.out.println(factorial);
  }
}*/
