package Workshop6;

public class Cow extends Animal
{
  private int milkPerMonth;

  public Cow(int nrOfColors,String sound, String ownerName,String name, int milkPerMonth)
  {
    super(nrOfColors, sound, ownerName, name);
    this.milkPerMonth = milkPerMonth;
  }

  public int getMilkPerMonth()
  {
    return milkPerMonth;
  }

  public void setMilkPerMonth(int milkPerMonth)
  {
    this.milkPerMonth = milkPerMonth;
  }
  public String toString()
  {
    return super.toString() + milkPerMonth;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Cow))
    {
      return false;
    }
    Cow other = (Cow) obj;
    return super.equals(other) && milkPerMonth == other.milkPerMonth;
  }
}
