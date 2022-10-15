import java.util.Scanner;

public class PosAndNegSum
{
  public static void main(String[] args)
  {
    int positiveSum = 0;
    int negativeSum = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int x = input.nextInt();
    while(x != 0)
    {
      if(x > 0)
      {
        positiveSum = positiveSum + x;
      }
      else
      {
        negativeSum = negativeSum + x;
      }
      x = input.nextInt();
    }
    System.out.println("Positive sum: " + positiveSum);
    System.out.println("Negative sum: " + negativeSum);
  }
}
