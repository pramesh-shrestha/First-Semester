/* Write a while loop that lets the user enter a number. The number should be multiplied
by 10 and the result stored in the variable product. The loop should iterate as long as
product contains a value less than 100.*/
package session2.Exercise10_4;

import java.util.Scanner;

public class Exercise10_4_1
{
  public static void main(String[] args)
  {

    int product= 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = input.nextInt();

    while(num < 11)
    {
      product = num * 10;
      num++;
      System.out.println(product);
    }

  }
}
