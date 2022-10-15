/*Create a class Name representing a name by first and last name. The class has
1.Two instance variables
2. A two-argument constructor setting both instance variables
3. Setters and getters for both instance variables
4. A method getFullName returning the name as a string firstName lastName (the two instance
variables separated by a single space)
5. A method copy returning an exact copy of the Name object
6. An equals method returning true if the argument is a Name object with the same first and last
name – otherwise returns false
*/
package Workshop3;

public class Name
{
  private String firstName;
  private String lastName;

  //two argument constructor
  public Name(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  //set methods
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  //get methods
  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName()
  {
    return  lastName;
  }
   public String getFullName()
   {
     return firstName + " " + lastName;
   }

   //copy method
  public Name copy()
  {
    return new Name(firstName, lastName);
  }

  //equals method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Name))
    {
      return false;
    }
    Name other = (Name)obj;
    return firstName.equals(other.firstName) &&
    lastName.equals(other.lastName);
  }

  public String toString()
  {
    return firstName + " " +  lastName;
  }
}

