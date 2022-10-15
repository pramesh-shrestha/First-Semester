package Toy;

public class Lego extends Toy
{
  private int numberOfBricks;

  //constructor
  public Lego(int suitableAge, int numberOfBricks)
  {
    super(suitableAge);
    this.numberOfBricks = numberOfBricks;
  }

  public int getNumberOfBricks()
  {
    return numberOfBricks;
  }

  public void setNumberOfBricks(int numberOfBricks)
  {
    this.numberOfBricks = numberOfBricks;
  }

  //play
  public String play()
  {
    return "Build";
  }

  //toString
  public String toString()
  {
    return super.toString() + "Number of Bricks: " + numberOfBricks;
  }
}
