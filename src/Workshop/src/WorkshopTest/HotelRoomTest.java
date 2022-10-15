package WorkshopTest;

public class HotelRoomTest
{
  public static void main(String[] args)
  {


    //creating three HotelRoom objects
    HotelRoom hotelRoom1 = new HotelRoom(1, 2000);
    HotelRoom hotelRoom2 = new HotelRoom(2, 2000);
    HotelRoom hotelRoom3 = new HotelRoom(3, 2000);

    //changing rent of the first room
    hotelRoom1.setRent(2500);

    //creating two Guest objects
    Guest guest1 = new Guest("Allan");
    Guest guest2 = new Guest("Mona");

    //checking in guest1 and guest2
    hotelRoom1.checkIn(guest1);
    hotelRoom2.checkIn(guest2);

    //displaying info using toString() method
    System.out.println(hotelRoom1);
    System.out.println(hotelRoom2);
    System.out.println(hotelRoom3);


  }
}
