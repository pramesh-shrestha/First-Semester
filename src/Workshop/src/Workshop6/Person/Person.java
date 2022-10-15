package Workshop6.Person;

public class Person
{
  private String name;
  private String phoneNumber;

  public Person(String name)
  {
    this.name = name;
  }
  public Person(String name, String phoneNumber)
  {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setPhoneNumber(String number)
  {
    phoneNumber = number;
  }

  public String toString()
  {
    return "Name: " + name + "Phone: " + phoneNumber;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person) obj;
    return name.equals(other.name) && phoneNumber.equals(other.phoneNumber);
  }
}
