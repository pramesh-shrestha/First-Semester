package Workshop2.pricepermonth;

public class House
{
  private int numberOfRooms;
  private int numberOfFloors;
  private String street;
  private String city;
  private PricePerMonth price;

  public House(int numberOfRooms,int numberOfFloors,String city, String street,PricePerMonth price)
  {
    this.numberOfRooms = numberOfRooms ;
    this.numberOfFloors = numberOfFloors;
    this.city = city;
    this.price = price;
    this.street = street;
  }

  public String toString()
  {
    return "Rooms: " + numberOfRooms + " Floors: " + numberOfRooms + " Street: " + street +
        " City: " + city + " Price: " + price;
  }
}
