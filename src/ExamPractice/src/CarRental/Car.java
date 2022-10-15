package CarRental;

import java.util.InputMismatchException;

public abstract class Car
{
  private String licenseNo;
  private double price;
  private Customer rentedTo;

  public Car(String licenseNo, double price)
  {
    try{
      this.licenseNo = licenseNo;
      this.price = price;
    }
    catch (InputMismatchException e)
    {
      System.out.println("Input mis match");
    }

    rentedTo = null;
  }

  public String getLicenseNo()
  {
    return licenseNo;
  }

  public double getPrice()
  {
    return price;
  }
  public void setPrice(double price)
  {
    this.price = price;
  }

  public abstract String getType();

  public Customer getRentedTo()
  {
    return rentedTo;
  }
  public void setRentedTo(Customer customer)
  {
    rentedTo = customer;
  }
  public boolean isAvailable()
  {
    if(rentedTo == null)
    {
      return true;
    }
    return false;
  }

}
