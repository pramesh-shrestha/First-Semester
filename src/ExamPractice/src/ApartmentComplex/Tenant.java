package ApartmentComplex;

public class Tenant
{
  private String name;
  private MyDate rentedFrom;

  public Tenant(String name)
  {
    this.name= name;
    rentedFrom = new MyDate(0,0,0);
  }

  public String getName()
  {
    return name;
  }

  public MyDate getRentedFrom()
  {
    return rentedFrom.copy();
  }

  public void setRentedFrom(MyDate date)
  {
    rentedFrom = date.copy();
  }

  @Override public String toString()
  {
    return "Tenant{" + "name='" + name + '\'' + ", rentedFrom=" + rentedFrom
        + '}';
  }
}
