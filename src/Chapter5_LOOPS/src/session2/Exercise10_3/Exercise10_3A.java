package session2.Exercise10_3;/*Exercise 10.03
The value of π can be calculated like this:
π = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15 ....

The longer the series is continued the closer to the value of π the result gets.
a) Create a program that uses a loop to run the above equation to calculate the
value of π, and then prints it out. The program should ask the user to input for
how many iterations the loop should run. Experiment with different input
values to see if you can get π calculated with an accuracy of 5 decimals.
 */
import java.util.Scanner;
public class Exercise10_3A
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter how many iterations you want: ");
    int loop = input.nextInt();
    double n = 1;
    double p = 0;
    int i;

    for(i = 1; i <= loop; i++)
    {
      //if i is even
      if(i % 2 == 0)
      {
        p = p - (1.0/n);
      }
      else //if i is odd
      {
        p = p + (1.0/n);
      }

      n += 2; //increase the value of denominator by 2
    }
    System.out.println(4*p); //multiplying total value of with 4
  }
}
