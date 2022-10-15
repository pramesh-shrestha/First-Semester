package Lottery;

import java.util.Random;

public class Lottery
{
  private int[] lotteryNumber;

  //constructor
  public Lottery()
  {
    lotteryNumber = new int[5];
    Random rand = new Random();
    for(int i = 0; i < lotteryNumber.length; i++)
    {
      lotteryNumber[i] = rand.nextInt(10);
    }
  }
  public int[] personLottery(int[] pick)
  {
    int[] temp = new int[pick.length];
    for(int i = 0; i < lotteryNumber.length; i++)
    {
      if(lotteryNumber[i] == pick[i])
      {
        temp[i] = lotteryNumber[i];
      }
    }return temp;
  }

  public String toString()
  {
    String str = "";
    for(int i = 0; i < lotteryNumber.length; i++)
    {
      str += lotteryNumber[i] + " ";
    }
    return str;
  }


}
