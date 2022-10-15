package Hotel;

public class Room
{
  private int number;
  private Guest guest;
  private Bed bed;

  public Room(int number, String bedType)
  {
    this.number = number;
    bed = new Bed(bedType);
    guest = null;
  }

  //getNumber
  public int getNumber()
  {
    return number;
  }

  //getFloor
  public int getFloor()
  {
    return number/100;
  }
  //getPrice
  public double getPrice()
  {
    double price = 0.0;
    if(bed.isSingle())
    {
      price = 59.50;
    }
    if(bed.isDouble())
    {
      price = 72.40;
    }
    if(bed.isKingSize())
    {
      price = 89.00;
    }
    return price;
  }
  //isOccupied
  public boolean isOccupied()
  {
    if(guest == null)
    {
      return false;
    }
    return true;
  }

  //registerGuest
  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }

  //vacate
  public void vacate()
  {
    guest = null;
  }

  //getBedType
  public String getBedType()
  {
    String type = "";
    if(bed.isSingle())
    {
      type = "single";
    }
    if(bed.isDouble())
    {
      type = "double";
    }
    if(bed.isKingSize())
    {
      type = "Kingsize";
    }
    return type;
  }

  //getGuest
  public Guest getGuest()
  {
    return guest;
  }
}
