package Vehicle;

public class Van extends Car
{
  private int maxLoad;

  //constructor
  public Van(String owner, double price, String regNo, int maxLoad)
  {
    super(owner, price, regNo);
    this.maxLoad = maxLoad;
  }
  //getMaxLoad
  public int getMaxLoad()
  {
    return maxLoad;
  }
  //toString
  public String toString()
  {
    return super.toString() + "Max load: " + maxLoad;
  }
  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Van))
    {
      return false;
    }
    Van other = (Van)obj;
    return super.equals(other) && maxLoad == other.maxLoad;
  }
}
