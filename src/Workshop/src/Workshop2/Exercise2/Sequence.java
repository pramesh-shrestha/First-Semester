/*c)Result(n) = 1/(1+2) + 2/(2+3) + ... + n/(2n + 1) e.g. Result(3) = 1.161*/
package Workshop2.Exercise2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sequence
{
  public static void main(String[] args)
  {
    DecimalFormat formatter = new DecimalFormat("0.000");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int n = input.nextInt();
    double result = 0;
    double sum = 0;
    for(int i = 1; i <=n; i++)
    {
      result = i/((2 * i) + 1.0);
      sum = sum + result;

    }System.out.println(formatter.format(sum));

  }
}
