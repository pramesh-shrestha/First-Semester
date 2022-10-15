/*14. Heads or Tails Game
This game is meant for two or more players. In this game, the players take turns flipping a
coin. Before the coin is flipped, players should guess if the coin will land headsup or tailsup.
If a player guesses correctly, then that player is awarded a point. If a player guesses incorrectly,
then that player will lose a point. The first player to score five points is the winner.
Write a program that simulates the game being played by two players. Use the Coin class
that you wrote as an assignment in Chapter 5 (Programming Challenge 20) to simulate the
coin. Write a Player class to simulate the players.*/
package Challenge14_HeadTail;

import java.util.Scanner;

public class Player
{
  private String name;
  private Coin coin;
  private int point;

  public Player(String name,int point, Coin coin)
  {
    this.name = name;
    this.coin = coin;
   this.point = point;
  }

  public void addPoint()
  {
    point++;
  }

  public void losePoint()
  {
    point--;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }


  public int getPoint()
  {
    return point;
  }

  public void setPoint(int point)
  {
    this.point = point;
  }

  //coinFlip
//  public String coinFlip()
//  {
//    String value = coin.toss();
//    return value;
//  }

  public void coinFlip()
  {
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter heads or tails");
    String guess = input.next();

    if(guess.equals(coin.toss()))
    {
      System.out.println("Right guess, you get 1 point");
      addPoint();
      System.out.println("Points after right guess: " + getPoint());
    }
    else
    {
      System.out.println("wrong guess you lose 1 point");
      losePoint();
      System.out.println("Points after wrong guess: " + getPoint());
    }
  }

  //toString
  public String toString()
  {
    return name;
  }
}
