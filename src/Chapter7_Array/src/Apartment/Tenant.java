package Apartment;

public class Tenant
{
  private String name;
  private MyDate rentedFrom;

  //constructor
  public Tenant(String name)
  {
    this.name = name;
    rentedFrom = new MyDate(0,0,0);
  }

  //getName
  public String getName()
  {
    return name;
  }
  //getRentedFrom
  public MyDate getRentedFrom()
  {
    return rentedFrom.copy();
  }

  //setRentedFrom
  public void setRentedFrom(MyDate date)
  {
    rentedFrom = date.copy();
  }

  //equals method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Tenant))
    {
      return false;
    }
    Tenant other = (Tenant) obj;
    return name.equals(other.name) && rentedFrom.equals(other.rentedFrom);
  }

  //toString

  public String toString()
  {
    return "Tenant{" + "name='" + name + '\'' + ", rentedFrom=" + rentedFrom
        + '}';
  }
}
