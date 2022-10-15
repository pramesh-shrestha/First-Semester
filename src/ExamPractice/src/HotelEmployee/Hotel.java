package HotelEmployee;

import java.util.ArrayList;

public class Hotel
{
  private String name;
  private String address;
  private ArrayList<Room> rooms;
  private ArrayList<Employee> employees;

  public Hotel(String name, String address, Room[] rooms)
  {
    this.name =name;
    this.address = address;
    for(int i=0; i< rooms.length; i++)
    {
      this.rooms.add(rooms[i]);
    }
    employees = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }
  public Room getRoom(int roomNumber)
  {
    for (int i = 0; i < rooms.size(); i++)
    {
      if(rooms.get(i).getNo()==roomNumber)
      {
        return rooms.get(i);
      }
    }
    return null;
  }

  public void hireReceptionist(int number, String name)
  {
    Receptionist receptionist = new Receptionist(number,name);
    employees.add(receptionist);

  }

  public void hireCleaningPerson(int number, String name)
  {
    CleaningPerson employee = new CleaningPerson(number,name);
    employees.add(employee);
  }

  public void fireEmployee(int number)
  {
    for (int i = 0; i < employees.size(); i++)
    {
      if(employees.get(i).getNumber() == number)
      {
        employees.remove(i);
      }
    }
  }

  public CleaningPerson getCleaningPersonForRoom(int roomNumber)
  {
    for (int i = 0; i < employees.size(); i++)
    {
      if(employees.get(i) instanceof CleaningPerson )
      {
        CleaningPerson person = (CleaningPerson) employees.get(i);
        if(person.cleansRoom(roomNumber))
        {
          return person;
        }

      }
    }
    return null;
  }

  public void setCleaningPersonForRoom(int roomNumber, int employeeNumber)
  {
    Room temp = null;
    for (int i = 0; i < rooms.size(); i++)
    {
      if(rooms.get(i).getNo() == roomNumber)
      {
        temp = rooms.get(i);
        break;
      }
    }

    for (int i = 0; i < employees.size(); i++)
    {
      if(employees.get(i).getNumber() == employeeNumber && employees.get(i) instanceof CleaningPerson)
      {
        ((CleaningPerson) employees.get(i)).addRoom(temp);
        break;
      }
    }
  }

}
