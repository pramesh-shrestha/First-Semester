package Vehicle;

public class SportsCar extends Car
{
  private int maxVelocity;

  //constructor
  public SportsCar(String owner, double price, String regNo, int maxVelocity)
  {
    super(owner, price, regNo);
    this.maxVelocity = maxVelocity;
  }
  //getMaxVelocity
  public int getMaxVelocity()
  {
    return maxVelocity;
  }
  //toString
  public String toString()
  {
    return super.toString() + "Max velocity: " + maxVelocity;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof SportsCar))
    {
      return false;
    }
    SportsCar other = (SportsCar) obj;
    return super.equals(other) && maxVelocity == other.maxVelocity;
  }
}
