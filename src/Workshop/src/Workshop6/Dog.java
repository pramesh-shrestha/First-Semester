package Workshop6;

public class Dog extends Animal
{
  private int nrOfCommands;
  public Dog(int nrOfColors,String sound, String ownerName,String name, int nrOfCommands)
  {
    super(nrOfColors, sound, ownerName, name);
    this.nrOfCommands = nrOfCommands;
  }

  public int getNrOfCommands()
  {
    return nrOfCommands;
  }

  public void setNrOfCommands(int nrOfCommands)
  {
    this.nrOfCommands = nrOfCommands;
  }

  public String toString()
  {
    return super.toString() + nrOfCommands;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Dog))
    {
      return false;
    }
    Dog other = (Dog)obj;
    return super.equals(other) && nrOfCommands == other.getNrOfCommands();
  }
}

