package serviceBook;

import java.util.ArrayList;

public class ServiceBook
{
  private ArrayList<Service> services;

  //constructor
  public ServiceBook()
  {
    services = new ArrayList<>();
  }
  //addService
  public void addService(Service service)
  {
    services.add(service);
  }
  //getNumberOfServices
  public int getNumberOfServices()
  {
    return services.size();
  }
  //getService
  public Service getService(int index)
  {
    return services.get(index);
  }
  //getAllServices
  public Service[] getAllServices()
  {
    Service[] newArray = services.toArray(new Service[services.size()]);
    return newArray;
  }

  //getAllServiceMileages
  public int[] getAllServiceMileages()
  {
    int[] mileages = new int[services.size()];
    for(int i = 0; i < services.size(); i++)
    {
      mileages[i] = services.get(i).getMileage();
    }
    return mileages;
  }

  //hasServiceOnDate
  public boolean hasServiceOnDate(Date date)
  {

    for(int i = 0; i < services.size(); i++)
    {
      if(services.get(i).getDate().equals(date));
      {
        return true;
      }
    }return false;
  }

  //getDateOfLastService()
  public Date getDateOfLastService()
  {
      return services.get(services.size()-1).getDate();
  }

  //equals() method
  public boolean equals(Object obj)
  {
    if (!(obj instanceof ServiceBook))
    {
      return false;
    }
    ServiceBook other = (ServiceBook) obj;
    return getAllServices().equals(other.getAllServices());
  }

  //toString() method
  public String toString()
  {
    String str = "";
    for(int i = 0; i < services.size(); i++)
    {
      str += services.get(i) + " ";
    }return str;
  }
}
