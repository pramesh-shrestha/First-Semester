package Website;

import java.util.ArrayList;

public class SiteCollection
{
  private int size;
  private ArrayList<Website> websites;

  //constructor
  public SiteCollection(int maxSites)
  {
    size = maxSites;
    websites = new ArrayList<>();
  }
  //getNumberOfSites
  public int getNumberOfSites()
  {
    return websites.size();
  }
  //getNumberOfUpdateSites
  public int getNumberOfUpdateSites()
  {
    int count = 0;
    for(int i = 0; i < websites.size(); i ++)
    {
      if(!websites.get(i).needsUpdate())
      {
        count++;
      }
    }return count;
  }

  //addSite
  public void addSite(Website site)
  {
    if(websites.size() < size)
    {
      websites.add(site);
    }
  }
  //removeSite
  public void removeSite(String url)
  {
    for(int i = 0; i < websites.size(); i++)
    {
      if(websites.get(i).getUrl().equals(url))
      {
        websites.remove(i);
        break;
      }
    }
  }

  //getAllSites
  public Website[] getAllSites()
  {
    Website[] newArray = websites.toArray(new Website[websites.size()]);
    return newArray;
  }

  //getAllNotUpdatedSties
  public Website[] getAllNotUpdatedSties()
  {
    Website[] notUpdated = new Website[websites.size()-getNumberOfUpdateSites()];
    int index =0;
    for(int i = 0; i < websites.size(); i++)
    {
      if(websites.get(i).needsUpdate())
      {
        notUpdated[index] = websites.get(i);
        index++;
      }
    }return notUpdated;
  }

  //toString() method
  public String toString()
  {
    String str = "";
    for(int i = 0; i < websites.size(); i++)
    {
      str += websites.get(i);
    }
    return "Size: " + websites.size() + "\n" +  "Websites: \n" + str;
  }
}
