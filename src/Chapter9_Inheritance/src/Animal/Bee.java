package Animal;

public class Bee extends Animal
{
  private boolean isAHoneyBee;

  //constructor
  public Bee(int age, boolean isAHoneyBee)
  {
    super(age);
    this.isAHoneyBee = isAHoneyBee;
  }

  //speak
  public String speak()
  {
    return "Buzz";
  }

  //get method
  public boolean isAHoneyBee()
  {
    return isAHoneyBee;
  }

  //set method
  public void setAHoneyBee(boolean AHoneyBee)
  {
    isAHoneyBee = AHoneyBee;
  }

  //toString
  public String toString()
  {
    return super.toString() + "Is a honey bee?: " + isAHoneyBee;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Bee))
    {
      return false;
    }
    Bee other = (Bee) obj;
    return super.equals(other) && isAHoneyBee == other.isAHoneyBee;
  }
}
