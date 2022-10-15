package Challenge10_Lottery;
import java.util.Scanner;

public class LotteryTest
{
  public static void main(String[] args)
  {
    //creating a Lottery object
    Lottery lottery = new Lottery();
    int[] pick = new int[5];
    System.out.println("Enter five numbers between 0 and 9");
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < 5; i++)
    {
      boolean flag = true;
      do
      {
        try
        {
          pick[i] = input.nextInt();
          if(pick[i] < 0 || pick[i] > 9)
          {
            throw new IllegalNumberException("Number should be between 0 and 9");
          }
          flag = false;
        }
        catch (IllegalNumberException e)
        {
          System.out.println(e.getMessage());
        }
      }while (flag);

    }


    System.out.println("Lottery generated: " + lottery);
     //User's lottery number
    System.out.print("User's lottery number: ");
    for(int i = 0; i < pick.length; i++)
    {
      System.out.print(pick[i] + " ");
    }

    System.out.println();//new line
    //numbers that matched
    int[] matched = lottery.personLottery(pick);
    System.out.print("Matched number: ");
    for(int i = 0; i < matched.length; i++)
    {
      System.out.print(matched[i] + " ");
    }


  }
}
