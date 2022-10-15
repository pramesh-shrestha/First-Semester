/*Exercise 3:Write a Java class called PrimeChecker.
 a) Read a positive int called n from the keyboard.
 Use a validation loop(while loop), i.e.,keep asking until the value entered is positive.
 b) Print “Prime” if and only if n is a prime number, otherwise print “The number is not prime”.
 A prime number is an integer which cannot be divided evenly by any integer except 1 and itself.
 Hint: if n can be divided evenly by k then the following is true: n % k == 0
 */
package Workshop2.PrimeChecker;

import java.util.Scanner;

public class PrimeChecker
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int n;
    do
    {
      System.out.print("Enter any positive number: ");
      n = input.nextInt();
      if(n % 2 == 0)
      {
        if(n == 2)
        {
          System.out.println("Prime");
        }
        else
        {
          System.out.println("Not prime");
        }
      }
      else
      {
        for( int i = 3; i <= n; i += 2)
        {
          if(n % i == 0)
          {
            if(n == 1 || n == i)
            {
              System.out.println("Prime");
            }
            else
            {
              System.out.println("Not prime");
            }
            break;
          }
          else
          {
            continue;
          }
        }
      }
    }while(n > 0);
  }
}
