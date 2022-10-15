package Challenge14_HeadTail;

import java.util.Random;

public class Coin
{
  private String sideUp = "head";

  //no arg constructor to hold the sideUp value - head
  public Coin()
  {
    toss();
  }

  public void setSideUp(String sideUp)
  {
    this.sideUp = sideUp;
  }

  //toss
  public String toss()
  {
    Random rand = new Random();
    //generate values 0 or 1
    int num = rand.nextInt(2);
    //set sideUp to head if num is 0
    if(num == 0)
    {
      sideUp = "heads";
    }
    else
    {
      sideUp = "tails"; //if num is 1
    }
    return sideUp;
  }
  //getSideUp
  public String getSideUp()
  {
    return sideUp;
  }
}
