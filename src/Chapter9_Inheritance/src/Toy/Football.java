package Toy;

public class Football extends Ball
{
  //constructor
  public Football(int suitableAge, int diameter)
  {
    super(suitableAge, diameter);
  }

  //play
  public String play()
  {
    return "Kick";
  }

  //toString
  public String toString()
  {
    return super.toString();
  }
}
