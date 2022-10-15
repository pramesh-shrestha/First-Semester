package Toy;

public class Handball extends Ball
{
  //constructor
  public Handball(int suitableAge, int diameter)
  {
    super(suitableAge, diameter);
  }

  //play
  public String play()
  {
    return "Throw";
  }

  //toString
  public String toString()
  {
    return super.toString();
  }
}
