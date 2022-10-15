package Apartment;

public class Apartment
{
  private int number;
  private Tenant tenant;

  //constructor
  public Apartment(int number)
  {
    this.number = number;
    tenant = null;
  }

  //getNumber
  public int getNumber()
  {
    return number;
  }

  //isAvailable
  public boolean isAvailable()
  {
    if(tenant == null)
    {
      return true;
    }
    return false;
  }

  //rentTo
  public void rentTo(Tenant tenant, MyDate rentedFrom)
  {
    this.tenant = tenant;
    tenant.setRentedFrom(rentedFrom);
  }

  //getTenant
  public Tenant getTenant()
  {
    return tenant;
  }
  //toString
  public String toString()
  {
    return "Number: " + number + "Tenant: " + tenant;
  }
}
