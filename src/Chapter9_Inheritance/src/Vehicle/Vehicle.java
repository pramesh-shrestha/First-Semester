package Vehicle;

public class Vehicle
{
  private String owner;
  private double price;

  //constructor
  public Vehicle(String owner, double price)
  {
    this.owner = owner;
    this.price = price;
  }

  //getOwner
  public String getOwner()
  {
    return owner;
  }
  //setOwner
  public void setOwner(String owner)
  {
    this.owner = owner;
  }
  //getPrice
  public double getPrice()
  {
    return price;
  }
  //setPrice
  public void setPrice(double price)
  {
    this.price = price;
  }
  //toString
  public String toString()
  {
    return "Owner: " + owner + "Price: " + price;
  }
  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Vehicle))
    {
      return false;
    }
    Vehicle other = (Vehicle) obj;
    return owner.equals(other.owner) && price == other.price;
  }
}
