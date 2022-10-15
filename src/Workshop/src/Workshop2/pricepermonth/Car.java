package Workshop2.pricepermonth;

public class Car
{
  private String model;
  private int year;
  private PricePerMonth price;


  public Car(String model, int year, PricePerMonth price)
  {
    this.model = model;
    this.year = year;
    this.price = price;
  }

  public String toString()
  {
    return "Model: " + model + " Year: " + year + " Price: " + price;
  }
}
