/*Write a program that asks the user to input an int, n, and then prints out the following:
a) All the numbers 1, 2, 3, …, n
b) All the numbers 2, 4, 6, …, 2*n
c) All the numbers 1, 4, 9, …, n*n
*/
package session1;

import java.util.Scanner;

public class Exercise9_1
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();

    //solution a
    int i = 1;
    while(i <= n)
    {
      if(i == n)
      {
        System.out.print(i);
      }
      else
      {
        System.out.print(i + ", ");
      }
      i++;
    }

    //new line
    System.out.println("");

    //solution b
    for(int j = 1; j <= n; j++)
    {
      if(j == n)
      {
        System.out.print(2 * j);
      }
      else
      {
        System.out.print((2 * j) + ", ");
      }

    }
    //new line
    System.out.println("");

    //solution c
    for(int k = 1; k <= n; k++)
    {
      if (k == n)
      {
        System.out.print(k * k);
      }
      else
      {
        System.out.print((k * k) + ", ");
      }
    }
  }
}
