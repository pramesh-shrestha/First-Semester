package Animal;

public class Cat extends Pet
{
  private boolean isAHouseCat;

  //constructor
  public Cat(int age, String name, boolean isAHouseCat)
  {
    super(age, name);
    this.isAHouseCat = isAHouseCat;
  }

  //speak
  public String speak()
  {
    return "Meow";
  }

  //get method
  public boolean isAHouseCat()
  {
    return isAHouseCat;
  }

  //set method
  public void setAHouseCat(boolean AHouseCat)
  {
    isAHouseCat = AHouseCat;
  }

  //toString
  public String toString()
  {
    return super.toString() + "Is a house cat) :" + isAHouseCat;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Cat))
    {
      return false;
    }
    Cat other = (Cat) obj;
    return super.equals(other) && isAHouseCat == other.isAHouseCat;
  }
}
