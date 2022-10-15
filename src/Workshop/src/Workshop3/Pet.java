package Workshop3;

public class Pet
{
  private Name name;
  //creating one arg constructor
  public Pet(Name name)
  {
    this.name = name.copy();
  }
  public Name getName()
  {
    return name.copy();
  }
  public String toString()
  {
    return name +"";
  }
}
