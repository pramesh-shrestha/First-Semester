package Animal;

public class Frog extends Animal
{
  private String colour;

  //constructor
  public Frog(int age, String colour)
  {
    super(age);
    this.colour = colour;
  }

  //abstract method speak
  public String speak()
  {
    return "Ribbit";
  }

  //toString
  public String toString()
  {
    return super.toString() + "Colour: " + colour;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Frog))
    {
      return false;
    }
    Frog other = (Frog) obj;
    return super.equals(other) && colour.equals(other.colour);
  }

  //getColour
  public String getColour()
  {
    return colour;
  }

  //setColour
  public void setColour(String colour)
  {
    this.colour = colour;
  }
}
