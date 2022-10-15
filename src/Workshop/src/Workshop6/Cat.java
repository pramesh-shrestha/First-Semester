package Workshop6;

public class Cat extends Animal
{
  private int nrOfSleepingHours;

  public Cat(int nrOfColors,String sound, String ownerName,String name, int nrOfSleepingHours)
  {
    super(nrOfColors, sound, ownerName, name);
    this.nrOfSleepingHours = nrOfSleepingHours;
  }

  public int getNrOfSleepingHours()
  {
    return nrOfSleepingHours;
  }

  public void setNrOfSleepingHours(int nrOfSleepingHours)
  {
    this.nrOfSleepingHours = nrOfSleepingHours;
  }

  public String toString()
  {
    return super.toString() + nrOfSleepingHours;
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Cat))
    {
      return false;
    }
    Cat other = (Cat) obj;
    return super.equals(other) && nrOfSleepingHours == other.nrOfSleepingHours;
  }
}
