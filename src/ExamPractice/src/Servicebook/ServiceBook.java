package Servicebook;

import java.util.ArrayList;

public class ServiceBook
{
  private ArrayList<Service> services;

  public ServiceBook()
  {
    services = new ArrayList<Service>();
  }

  public void addService(Service service)
  {
    services.add(service);
  }
  public int getNumberOfServices()
  {
    return services.size();
  }
  public Service getService(int index)
  {
    return services.get(index);
  }
  public Service[] getAllServices()
  {
    ArrayList<Service> temp = new ArrayList<Service>();
    for(int i = 0; i< services.size(); i++)
    {
      temp.add(services.get(i));
    }
    return temp.toArray(new Service[temp.size()]);
  }
  public int[] getAllServiceMileages()
  {
    int[] temp = new int[getNumberOfServices()];
    for(int i = 0; i< services.size(); i++)
    {
      temp[i] = services.get(i).getMileage();
    }
    return temp;

  }
  public boolean hasServiceOnDate(Date date)
  {
    for(int i = 0; i< services.size(); i++)
    {
      if(services.get(i).getDate().equals(date))
      {
        return true;
      }
    }
    return false;
  }
  public Date getDateOfLastService()
  {
   return services.get(services.size()-1).getDate();
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof ServiceBook))
    {
      return false;
    }
    ServiceBook other = (ServiceBook) obj;
    return services.equals(other.services);
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; i < services.size(); i++)
    {
      str += services.get(i);
    }
    return "Services: " + str;
  }

}
