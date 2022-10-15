package Animal;

public class Dog extends Pet
{
  private String breed;

  //constructor
  public Dog(int age, String name, String breed)
  {
    super(age, name);
    this.breed = breed;
  }

  //speak
  public String speak()
  {
    return "Woof";
  }

  //getBreed
  public String getBreed()
  {
    return breed;
  }

  //setBreed
  public void setBreed(String breed)
  {
    this.breed = breed;
  }

  //toString
  public String toString()
  {
    return super.toString() + "Breed: " + breed;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Dog))
    {
      return false;
    }
    Dog other = (Dog) obj;
    return super.equals(other) && breed.equals(other.breed);
  }

}
