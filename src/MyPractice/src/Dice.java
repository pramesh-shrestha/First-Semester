import java.util.Random;

public class Dice
{
  private int numSides;
  private int value;

  public Dice(int numSides)
  {
    this.numSides = numSides;
  }
  public int getNumSides()
  {
    return numSides;
  }

  public int getValue()
  {
    return value;
  }

  public void roll()
  {
    Random rand = new Random();
    int num = rand.nextInt(numSides) + 1;
    value = num;
  }

}
