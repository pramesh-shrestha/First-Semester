package Challenge10_Lottery;

import java.util.Random;

public class Lottery
{
  private int[] lotteryNumber = new int[5];

  //constructor
  public Lottery()
  {
    Random rand = new Random();
    for(int i = 0; i < lotteryNumber.length; i++)
    {
      lotteryNumber[i] = rand.nextInt(10);
    }
  }
  public int[] personLottery(int[] pick)
  {
    int count = 0;
    for(int j = 0; j < pick.length; j++)
    {
      if(lotteryNumber[j] == pick[j])
      {
        count++;
      }
    }
    int[] temp = new int[count];
    int index = 0;
    for(int i = 0; i < lotteryNumber.length; i++)
    {
      if(lotteryNumber[i] == pick[i])
      {
        temp[index] = lotteryNumber[i];
        index++;
      }
    }return temp;
  }

  //copy
  public Lottery copy()
  {
    return new Lottery();
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
