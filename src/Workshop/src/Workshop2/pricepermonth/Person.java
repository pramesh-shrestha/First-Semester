package Workshop2.pricepermonth;

public class Person
{
  private String firstName;
  private String secondName;
  private Car car;
  private Apartment apartment;
  private House house;

  public Person(String firstName,String secondName,Car car,Apartment apartment,House house)
  {
    this.firstName = firstName;
    this.secondName = secondName;
    this.car = car;
    this.apartment = apartment;
    this.house = house;
  }
  public String toString()
  {
    return "First name: " + firstName + " Second name: " + secondName + " Car: " + car +
        " Appartment: " + apartment + " House: " + house;
  }
}
