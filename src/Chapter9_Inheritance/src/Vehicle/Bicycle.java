package Vehicle;

public class Bicycle extends Vehicle
{
  private int gears;

  //constructor
  public Bicycle(String owner, double price, int gears)
  {
    super(owner,price); //calling Vehicle's constructor
    this.gears = gears;
  }

  //getGears
  public int getGears()
  {
    return gears;
  }
  //setGears
  public void setGears(int gears)
  {
    this.gears = gears;
  }
  //toString
  public String toString()
  {
    return super.toString() + "Gears: " + gears;
  }
  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Bicycle))
    {
      return false;
    }
    Bicycle other = (Bicycle) obj;
    return super.equals(other) && gears == other.gears;
  }
}
