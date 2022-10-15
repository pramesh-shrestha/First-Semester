/*5. Write a for loop that calculates the total of the following series of numbers
1/30 + 2/29 + 3/28 + 4/27 + ....+ 30/1*/
package session2.Exercise10_4;

public class Exercise10_4_2
{
  public static void main(String[] args)
  {
    double total, sum = 0;

    for(int i = 1; i <= 30; i++) //the total number of sequences are 30 so iterates 30 times
    {
      total = (double) i/((30-i) +1); //
      sum = sum + total;
    }
    System.out.println(sum);
  }
}
