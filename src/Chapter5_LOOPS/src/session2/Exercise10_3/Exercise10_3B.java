/*b) (Optional) Modify the program so that rather than asking the user to input the
number of iterations, the loop should simply continue running until the 5
decimals of accuracy is achieved. Then print out the calculated value of π and
how many iterations was needed.*/

package session2.Exercise10_3;

import java.text.DecimalFormat;

public class Exercise10_3B
{
  public static void main(String[] args)
  {
    //Decimal format class
    DecimalFormat formatter = new DecimalFormat("#0.00000");

    int n = 1, i = 1;
    double pi = 0;
    do
    {
      if (i % 2 != 0)
      {
        pi = pi + (1.0/n);
      }
      else
      {
        pi = pi - (1.0/n);
      }
      n +=2; //increase denominator with 2
      i++; //increase the counter
    }while(!formatter.format((4.0 * pi)).equals("3.14159"));

    System.out.println("Total iteration: " + i);
    System.out.println(formatter.format(4 * pi));
  }

}
