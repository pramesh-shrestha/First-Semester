package HotelRoom;

public class HotelRoomTest
{
  public static void main(String[] args)
  {
    HotelRoom hotelRoom1 = new HotelRoom(1,2000);
    HotelRoom hotelRoom2 = new HotelRoom(2,2000);
    HotelRoom hotelRoom3 = new HotelRoom(3,2000);

    hotelRoom1.setRent(2500);

    Guest guest1 = new Guest("Allan");
    Guest guest2 = new Guest("Mona");

    hotelRoom1.checkIn(guest1);
    hotelRoom2.checkIn(guest2);

    System.out.println(hotelRoom1);
    System.out.println(hotelRoom2);
    System.out.println(hotelRoom3);

  }
}
