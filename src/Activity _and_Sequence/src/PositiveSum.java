import java.util.Scanner;

public class PositiveSum
{
  public static void main(String[] args)
  {
    int positiveSum = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int x = input.nextInt();
    while(x != 0)
    {
      if(x > 0)
      {
        positiveSum = positiveSum + x;
      }
      x = input.nextInt();
    }
    System.out.println(positiveSum);

  }
}
