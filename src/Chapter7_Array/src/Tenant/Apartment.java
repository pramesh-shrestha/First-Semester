package Tenant;


public class Apartment
{
  private String address;
  private double rent;
  private Tenant tenant;

  //constructor
  public Apartment(String address, double rent)
  {
    this.address = address;
    this.rent = rent;
    tenant = null;
  }
  //getAddress
  public String getAddress()
  {
    return address;
  }
  //setRent
  public void setRent(double rent)
  {
    this.rent = rent;
  }

  //getRent
  public double getRent()
  {
    return rent;
  }

  //rentTo
  public void rentTo(String name, String phone)
  {
    if(!isOccupied())
    {
      Tenant tenant = new Tenant(name, phone);
    }
  }

  //evict
  public void evict()
  {
    tenant = null;
  }

  //isOccupied
  public boolean isOccupied()
  {
    if(tenant == null)
    {
      return false;
    }
    return true;
  }

  //getTenant
  public Tenant getTenant()
  {
    return tenant.copy();
  }

  //getRentDue
  public double getRentDue()
  {
    if(isOccupied())
    {
      return tenant.getRentDue();
    }
    return 0;
  }

  //chargeRent
  public void chargeRent()
  {
    rent += tenant.getRentDue();
  }

  //collectRent
  public void collectRent(double amount)
  {
    rent = tenant.getRentDue() - amount;
  }

  //toString
  public String toString()
  {
    if(isOccupied())
    {
      return "Address: " + address + "Rent: " + rent + "Tenant: " + tenant;
    }
    else
    {
      return "No tenant";
    }
  }

}
