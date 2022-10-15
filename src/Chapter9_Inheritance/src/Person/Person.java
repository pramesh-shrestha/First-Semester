package Person;

public class Person
{
  private String name;
  private int id;

  public Person(String name, int id)
  {
    this.name = name;
    this.id  = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String toString()
  {
    return "Person{" + "name='" + name + '\'' + ", id=" + id + '}';
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person) obj;
    return name.equals(other.name)&&
        id == other.id;
  }
}
