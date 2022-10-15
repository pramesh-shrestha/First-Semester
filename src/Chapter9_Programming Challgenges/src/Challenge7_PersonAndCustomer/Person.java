/*7. Person and Customer Classes
Design a class named Person with fields for holding a person’s name, address, and telephone
number. Write one or more constructors and the appropriate mutator and accessor methods
for the class’s fields.
Next, design a class named Customer, which inherits from the Person class. The Customer
class should have a field for a customer number and a boolean field indicating whether the
customer wishes to be on a mailing list. Write one or more constructors and the appropriate
mutator and accessor methods for the class’s fields. Demonstrate an object of the Customer
class in a simple program*/
package Challenge7_PersonAndCustomer;

public class Person
{
  private String name;
  private String address;
  private int telephone;

  /**construtor*/
  public Person(String name, String address, int telephone)
  {
    this.name = name;
    this.address = address;
    this.telephone = telephone;
  }

  /**get and set methods*/
  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public int getTelephone()
  {
    return telephone;
  }

  public void setTelephone(int telephone)
  {
    this.telephone = telephone;
  }

  /**toString*/
  public String toString()
  {
    return "Name: " + name + "\nAddress: " + address + "\nPhone number: " + telephone;
  }
}
