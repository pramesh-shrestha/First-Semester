package Animal;

import java.util.Objects;

public abstract class Pet extends Animal
{
  private String name;

  //constructor
  public Pet(int age,String name)
  {
    super(age);
    this.name = name;
  }

  //getName
  public String getName()
  {
    return name;
  }

  //setName
  public void setName(String name)
  {
    this.name = name;
  }

  //toString
  public String toString()
  {
    return super.toString() + "Name: " + name;
  }

  //equals

  public boolean equals(Object obj)
  {
   if(!(obj instanceof Pet))
   {
     return false;
   }
   Pet other = (Pet) obj;
   return super.equals(other) && name.equals(other.name);
  }
}
