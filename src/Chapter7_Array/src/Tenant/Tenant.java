package Tenant;

public class Tenant
{
  public String name;
  private String phone;
  public double rentDue;

  //constructor
  public Tenant(String name, String phone)
  {
    this.name = name;
    this.phone = phone;
    rentDue = 0;
  }

  //setName
  public void setName(String name)
  {
    this.name = name;
  }
  //setPhone
  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  //setRentDue
  public void setRentDue(double rentDue)
  {
    this.rentDue = rentDue;
  }

  //getName
  public String getName()
  {
    return name;
  }

  //getPhone
  public String getPhone()
  {
    return phone;
  }

  //getRentDue
  public double getRentDue()
  {
    return rentDue;
  }

  //copy
  public Tenant copy()
  {
    return new Tenant(name, phone);
  }

  //toString
  public String toString()
  {
    return "Name: " + name + "Phone: " + phone + "Due Rent: " + rentDue;
  }
}
