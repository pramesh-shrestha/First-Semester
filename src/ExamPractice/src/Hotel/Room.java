package Hotel;

public class Room
{
  private int numbers;
  private Guest guest;
  private Bed bed;

  public Room(int numbers, String bedType)
  {
    this.numbers = numbers;
    guest = null;
    bed = new Bed(bedType);
  }
  public int getNumbers()
  {
    return numbers;
  }
  public int getFloor()
  {
    return numbers/100;
  }

  public double getPrice()
  {
    if(bed.isSingle())
    {
      return 59.50;
    }
    else if(bed.isDouble())
    {
      return 72.40;
    }
    else
    {
      return 89.00;
    }
  }

  public boolean isOccupied()
  {
    if(guest == null)
    {
      return false;
    }
    return true;
  }
  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }
  public void vacate()
  {
    guest = null;
  }
  public String getBedType()
  {
    if(bed.isSingle())
    {
      return "single";
    }
    else if(bed.isDouble())
    {
      return "double";
    }
    else
    {
      return "kingsize";
    }
  }

  public Guest getGuest()
  {
    return guest;
  }
}
