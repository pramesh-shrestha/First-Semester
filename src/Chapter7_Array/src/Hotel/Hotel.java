package Hotel;

import java.util.ArrayList;

public class Hotel
{
  private String name;
  private ArrayList<Room> rooms;

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    this.rooms = new ArrayList<>();
    for(int i = 0; i < rooms.length; i++)
    {
      this.rooms.add(rooms[i]);
    }
  }

  //getName
  public String getName()
  {
    return name;
  }
  //getNumberOfRooms
  public int getNumberOfRooms()
  {
    return rooms.size();
  }

  //getNumberOfAvailableRooms
  public int getNumberOfAvailableRooms()
  {
    int count  = 0;
    for(int i = 0; i < rooms.size(); i++)
    {
      if(!rooms.get(i).isOccupied())
      {
        count += 1;
      }
    }return count;
  }

  //getFirstAvailableRoom
  public Room getFirstAvailableRoom()
  {
    Room available = null;

    for(int i = 0; i < rooms.size(); i++)
    {
      if (!rooms.get(i).isOccupied())
      {
        available = rooms.get(i);
        break;
      }
    }return available;
  }

  //getFirstAvailableRoom
  public Room getFirstAvailableRoom(double maxPrice)
  {
    for(int i = 0; i < rooms.size(); i++)
    {
      if (!(rooms.get(i).isOccupied()) && rooms.get(i).getPrice() <= maxPrice )
      {
        return rooms.get(i);
      }
    }return null;

  }

  //getAllAvailableRooms
  public Room[] getAllAvailableRooms(String bedType)
  {
    //Here we create an array of type Room with the size of rooms.size. It means it will return array size of more than we actually need.
//    Room[] tempBedType = new Room[rooms.size()];
//    for(int i = 0; i < rooms.size(); i++)
//    {
//      if(rooms.get(i).getBedType().equals(bedType) && (!rooms.get(i).isOccupied()))
//      {
//        tempBedType[i] = rooms.get(i);
//      }
//    }return tempBedType;


    //Alternative way by creating arraylist first and then converting arraylist to array
    //this is an effective way as it returns the array of the actual size needed
    ArrayList<Room> temp = new ArrayList<>();
    for(int i = 0; i < rooms.size(); i++)
    {
      if (rooms.get(i).getBedType().equals(bedType) && (!rooms.get(i).isOccupied()))
      {
        temp.add(rooms.get(i));
      }
    }
    return temp.toArray(new Room[temp.size()]);
  }

  //hasGuest
  public boolean hasGuest(Guest guest)
  {
    for(int i = 0; i < rooms.size(); i++)
    {
      if(rooms.get(i).getGuest().equals(guest))
      {
        return true;
      }
    }return false;
  }

  //getRoom
  public Room getRoom(Guest guest)
  {
    for(int i = 0; i < rooms.size(); i++)
    {
      if(rooms.get(i).getGuest().equals(guest))
      {
        return rooms.get(i);
      }
    }return null;
  }
}
