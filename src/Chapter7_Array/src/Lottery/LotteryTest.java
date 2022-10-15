package Lottery;

import java.util.Scanner;

public class LotteryTest
{
  public static void main(String[] args)
  {
    int[] pick = new int[5];
    System.out.println("Enter five numbers");
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < 5; i++)
    {
      pick[i] = input.nextInt();
    }

    //creating a Lottery object
    Lottery lottery = new Lottery();
    lottery.personLottery(pick);
    int[] temp = new int[pick.length];
    for(int i = 0; i < pick.length; i++)
    {
     temp[i] =  pick[i];
    }
    System.out.println(lottery);
    System.out.println(temp);

  }
}
