package HotelRoom;

public class HotelRoom
{
  private Guest guest;
  private int roomNumber;
  private double rent;

  public HotelRoom(int roomNumber, double rent){
    this.roomNumber = roomNumber;
    this.rent = rent;
    guest = null;
  }

  public int getRoomNumber(){
    return roomNumber;
  }

  public double getRent(){
    return rent;
  }

  public Guest getGuest() {
    return guest;
  }

  public void setRent(double rent) {
    this.rent = rent;
  }

  public boolean isAvailable() {
    if (guest == null)
    {
      return true;
    }
    return false;
  }

  public void checkIn(Guest guest)
  {
    if(isAvailable())
    {
      this.guest = guest;
    }
  }

  public void checkOut() {
    guest = null;
  }

  public String toString() {
    if(guest != null) {
      return "Name: " + guest.getName() + " Room Number: " + roomNumber + " Rent: " + rent;
    }
    else {
      return " Room Number: " + roomNumber + " Rent: " + rent;
    }
  }


}
