package Challenge14_HeadTail;

import java.sql.SQLOutput;

public class HeadTailSimulator
{
  public static void main(String[] args)
  {
    Coin coin = new Coin();
    Player player1 = new Player("Pramesh", 0, coin);
    Player player2 = new Player("Rajiv", 0, coin);

    while((player1.getPoint() != 5) && (player2.getPoint() != 5))
    {
      System.out.println("Player 1");
      player1.coinFlip();
      System.out.println();
      if(player1.getPoint() == 5)
      {
        System.out.println(player1 + " is a winner");
        break;
      }
      else
      {
        System.out.println("Player 2");
        player2.coinFlip();
        System.out.println();
        if(player2.getPoint() == 5)
        {
          System.out.println(player2 + " is a winner");
          break;
        }

      }
    }
  }
}
