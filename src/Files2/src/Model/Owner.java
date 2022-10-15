package Model;

import java.io.Serializable;

public class Owner implements Serializable
{
  private String firstName;
  private String lastName;

  //constructor
  public Owner(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  //getFristName
  public String getFirstName()
  {
    return firstName;
  }

  //setFirstName
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  //getLastName
  public String getLastName()
  {
    return lastName;
  }

  //setLastName
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  //toString
  public String toString()
  {
    return "Firstname: " + firstName +
        "\nLastname: " + lastName;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Owner))
    {
      return false;
    }
    Owner other = (Owner) obj;
    return firstName.equals(other.firstName) &&
        lastName.equals(other.lastName);
  }
}
