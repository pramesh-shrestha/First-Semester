package WorkshopTest;

public class HotelRoom
{
  private int roomNumber;
  private double rent;
  private Guest guest;

  //creating two argument constructors
  public HotelRoom(int roomNumber, double rent)
  {
    this.roomNumber = roomNumber;
    this.rent = rent;
    guest = null; // room is available
  }

  //creating get methods for all three instance variables

  public int getRoomNumber()
  {
    return roomNumber;
  }

  public double getRent()
  {
    return rent;
  }

  public Guest getGuest()
  {
    return guest;
  }

  //creating set method for rent

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public boolean isAvailable()
  {
    //return guest == null; (We can do it this way as well it returns true or false.
    boolean roomAvailable;
    if (guest == null)
    {
      roomAvailable = true;
    }
    else
    {
      roomAvailable = false;
    }
    return roomAvailable;
  }

  //creating checkIn method
  public void checkIn(Guest guest)
  {
    if (isAvailable())
    {
      this.guest = guest;
    }
  }

  //creating checkOut method
  public void checkOut()
  {
    guest = null;
  }

  //creating toString method
  public String toString()
  {
    if (isAvailable()) //if room is empty
    {
      return "Room Number: " + roomNumber + "\nRent: " + rent; //printing just room number and rent
    }
    else //if room is taken
    {
      return "Room Number: " + roomNumber + "\nRent: " + rent + "\nName: " + guest.getName(); //printing room number, rent and name of the guest
    }

  }

}
