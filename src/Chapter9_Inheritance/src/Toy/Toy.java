package Toy;

public abstract class Toy
{
  private int suitableAge;

  //constructor
  public Toy(int suitableAge)
  {
    this.suitableAge = suitableAge;
  }

  public int getSuitableAge()
  {
    return suitableAge;
  }

  public void setSuitableAge(int suitableAge)
  {
    this.suitableAge = suitableAge;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Toy))
    {
      return false;
    }
    Toy other = (Toy) obj;
    return suitableAge == other.suitableAge;
  }

  //abstract method play()
  public abstract String play();
}
