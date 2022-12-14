/*/*13. First to One Game
This game is meant for two or more players. In the game, each player starts out with 50
points, as each player takes a turn rolling a pair of dice; the amount generated by the dice is
subtracted from the player’s points. The first player with exactly one point remaining wins.
If a player’s remaining points minus the amount generated by the dice results in a value less
than one, then the amount should be added to the player’s points. (As an alternative, the
game can be played with a set number turns. In this case, the player with the amount of
points closest to one, when all rounds have been played, wins.)
Write a program that simulates the game being played by two players. Use the Die class
that was presented in Chapter 4 to simulate the dice. Write a Player class to simulate the
players.*/

package Challenge13_firstToOneGame;

public class Player
{
  private String name;
  private int point;
  private Die die;

  public Player(String name, Die die)
  {
    this.die = die;
    this.name = name;
    point = 50;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPoint(int point)
  {
    this.point = point;
  }

  public String getName()
  {
    return name;
  }

  public int getPoint()
  {
    return point;
  }

  //player rolling the dice
  public void roll()
  {

    die.roll();
    int value = die.getValue();
    System.out.println("First roll of dice: " + value);
    die.roll();
    System.out.println("Second roll of dice: " + die.getValue());
    value += die.getValue();
    System.out.println("Die value : " + value);

    if (point < value)
    {
      point += value;
    }
    else
    {
      point -= value;
    }

    System.out.println(name + " " + point);

    // alternative
  /*  point = point - value;

    if(point < 1)
    {
      point += 2 * value;
    }
   */
  }
}