package Workshop2.pricepermonth;

public class Apartment
{
  private int numberOfRooms;
  private double squareMeters;
  private String street;
  private String city;
  private PricePerMonth price;

  public Apartment(int numberOfRooms, double squareMeters,String street,String city, PricePerMonth price )
  {
    this.numberOfRooms = numberOfRooms;
    this.squareMeters = squareMeters;
    this.street = street;
    this.city = city;
    this.price = price;
  }

  public String toString()
  {
    return "Number of rooms: " + numberOfRooms + " Square meters: " + squareMeters + " Street: " + street +
        " City: " + city + " Price per month: " + price;
  }
}
