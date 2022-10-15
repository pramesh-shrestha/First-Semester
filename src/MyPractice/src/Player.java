public class Player
{
  private String name;
  private int point;
  private Die die;

  public Player(String name, Die die)
  {
    this.name = name;
    this.die = die;
    point = 50;
  }
  public int getPoint()
  {
    return point;
  }

  public void roll()
  {
    die.roll();
    int value = die.getValue();
    System.out.println("Die value : " + value);


    if(point < value)
    {
      point += value;
    }
    else
    {
      point -= value;
    }
    System.out.println(name + " " + point);
  }

  @Override public String toString()
  {
    return "Player{" + "name='" + name + '\'' + ", point=" + point + '}';
  }
}
