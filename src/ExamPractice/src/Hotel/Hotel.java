package Hotel;

import java.util.ArrayList;

public class Hotel
{
  private String name;
  private ArrayList<Room> rooms;

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    this.rooms = new ArrayList<Room>();
    for(int i = 0; i < rooms.length; i++)
    {
      this.rooms.add(rooms[i]);
    }
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.size();
  }

  public int getNumberOfAvailableRooms()
  {
    int availableRooms = 0;
    for(int i= 0; i < rooms.size(); i++)
    {
      if(!rooms.get(i).isOccupied())
      {
        availableRooms++;
      }
    }return availableRooms;
  }

  public Room getFirstAvailableRoom()
  {
    for(int i=0; i< getNumberOfAvailableRooms(); i++)
    {
      if(!rooms.get(i).isOccupied())
      {
        return rooms.get(i);
      }
    }return null;
  }

  public Room getFirstAvailableRoom(double marxPrice)
  {
    for(int i=0; i< getNumberOfAvailableRooms(); i++)
    {
      if(!(rooms.get(i).isOccupied()) && rooms.get(i).getPrice() <= marxPrice)
      {
        return rooms.get(i);
      }
    }return null;
  }

  public Room[] getAllAvailableRooms(String bedType)
  {
    ArrayList<Room> temp = new ArrayList<Room>();
    for (int i = 0; i < rooms.size(); i++)
    {
      if(!(rooms.get(i).isOccupied()) && rooms.get(i).getBedType().equals(bedType))
      {
        temp.add(rooms.get(i));
      }
    }
    return temp.toArray(new Room[temp.size()]);
  }

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
