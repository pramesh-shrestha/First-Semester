/*. Personal Information Class
Design a class that holds the following personal data: name, address, age, and phone number.
Write appropriate accessor and mutator methods. Demonstrate the class by writing a
program that creates three instances of it. One instance should hold your information, and
the other two should hold your friends’ or family members’ information.*/
package Challenge3_Personal_information;

public class PersonalInformation
{
  private String name;
  private String address;
  private int age;
  private int phoneNumber;

  //accessor methods
  public String getName()
  {
    return name;
  }
  public String getAddress()
  {
    return address;
  }
  public int getAge()
  {
    return age;
  }
  public int getPhoneNumber()
  {
    return phoneNumber;
  }

  //mutator method
  public void setName(String name)
  {
    this.name = name;
  }
  public void setAddress(String address)
  {
    this.address = address;
  }
  public void setAge(int age)
  {
    this.age = age;
  }
  public void setPhoneNumber(int phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }
}
