package HotelRoom;

public class HotelRoomTest
{
  public static void main(String[] args)
  {
    Guest guest1 = new Guest("Pramesh Shrestha");
    Guest guest2 = new Guest("Sony Shrestha");
    Guest guest3 = new Guest("John");
    HotelRoom room1 = new HotelRoom(232,1200);
    room1.setRent(1500);
    HotelRoom room2 = new HotelRoom(233,1300);

    room1.checkIn(guest1);
    room2.checkIn(guest2);
    System.out.println(room1);
    System.out.println(room2);
    System.out.println(room2.isAvailable());
    room1.checkOut();
    room1.checkIn(guest3);
    System.out.println(room1);


  }

}
