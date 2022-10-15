import java.util.Scanner;

public class DoWhileSum
{
  public static void main(String[] args)
  {
    int sum = 0;
    int count = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    do
    {
      int value = input.nextInt();
      sum = sum +value;
      count++;
    }
    while(sum < 20 && count < 10);
    if(sum < 20)
    {
      System.out.println("Count: " + count);
    }
    else
    {
      System.out.println("Sum: " + sum);
    }
  }
}
