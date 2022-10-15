package Animal;

public abstract class Animal
{
  private int age;

  //constructor
  public Animal(int age)
  {
    this.age = age;
  }

  //getAge
  public int getAge()
  {
    return age;
  }

  //setAge
  public void setAge(int age)
  {
    this.age = age;
  }

  //toString
  public String toString()
  {
    return "Age:" + age;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Animal))
    {
      return false;
    }
    Animal other = (Animal) obj;
    return age == other.age;
  }

  //abstract method speak()
  public abstract String speak();
}
