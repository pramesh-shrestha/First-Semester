package ApartmentComplex;

import java.util.ArrayList;

public class ApartmentComplex
{
  private String address;
  private ArrayList<Residence> residences;

  public ApartmentComplex(String address)
  {
    this.address = address;
    residences = new ArrayList<>();
  }

  public int getNumberOfResidences()
  {
    return residences.size();
  }
  public void add(Residence residence)
  {
    residences.add(residence);
  }
  public Residence getResidence(int index)
  {
    return residences.get(index);
  }
  public Residence getResidenceByNumber(int number)
  {
    for (int i = 0; i < residences.size(); i++)
    {
      if(residences.get(i).getNumber() == number)
      {
        return residences.get(i);
      }
    }
    return null;
  }
  public Room getFirstAvailableRoom()
  {

    for(int i=0; i<residences.size(); i++)
    {
      if(residences.get(i).isAvailable() && residences.get(i) instanceof Room)
      {
        return (Room) residences.get(i);
      }
    }return null;
  }

  public Apartment getFirstAvailableApartment(int minNoOfRooms)
  {
    for(int i =0; i< residences.size(); i++)
    {
      if(residences.get(i) instanceof Apartment && residences.get(i).isAvailable() && residences.get(i).getNumberOfRooms() >= minNoOfRooms)
      {
        return (Apartment) residences.get(i);
      }
    }
    return null;
  }

  @Override public String toString()
  {
    return "ApartmentComplex{" + "address='" + address + '\'' + ", residences="
        + residences + '}';
  }
}
