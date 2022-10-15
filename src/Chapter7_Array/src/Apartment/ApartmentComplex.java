package Apartment;

import java.util.ArrayList;

public class ApartmentComplex
{
  private String address;
  private ArrayList<Apartment> apartments;

  //constructor
  public ApartmentComplex(String address)
  {
    this.address = address;
    apartments = new ArrayList<Apartment>();
  }
  //getNumberOfApartments
  public int getNumberOfApartments()
  {
    return apartments.size();
  }

  //add
  public void add(Apartment apartment)
  {
    apartments.add(apartment);
  }
  //getApartment
  public Apartment getApartment(int index)
  {
    return apartments.get(index);
  }

  //getApartmentByNumber
  public Apartment getApartmentByNumber(int number)
  {

    for(int i = 0; i < apartments.size(); i++)
    {
      if(apartments.get(i).getNumber() == number)
      {
        return apartments.get(i);
      }
    }return null;
  }

  //getApartmentByTenant
  public Apartment getApartmentByTenant(Tenant tenant)
  {

    for(int i = 0; i < apartments.size(); i++)
    {
      if(apartments.get(i).getTenant().equals(tenant))
      {
        return apartments.get(i);
      }
    }return null;
  }

  //getFirstAvailableApartment
  public Apartment getFirstAvailableApartment()
  {
    for(int i = 0; i < apartments.size(); i++)
    {
      if(apartments.get(i).isAvailable())
      {
        return apartments.get(i);
      }
    }return null;
  }

  //toString
  public String toString()
  {
    String str = "";
    for(int i = 0; i < apartments.size(); i++)
    {
      str += apartments.get(i) + "\n";
    }return str + "\n" + address;
  }

}
