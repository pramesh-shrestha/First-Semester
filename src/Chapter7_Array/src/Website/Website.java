package Website;

public class Website
{
  private String url;
  private boolean needsUpdate;

  //constructor
  public Website(String url)
  {
    this.url = url;
  }
  //getUrl
  public String getUrl()
  {
    return url;
  }
  //needsUpdate
  public boolean needsUpdate()
  {
   return needsUpdate;
  }
  //markAsNotUpdated
  public void markAsNotUpdated()
  {
    needsUpdate = true;
  }
  //markAsUpdated
  public void markAsUpdated()
  {
    needsUpdate = false;
  }
  //equals() method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Website))
    {
      return false;
    }
    Website other = (Website) obj;
    return url.equals(other.url) && needsUpdate == other.needsUpdate();
  }
  //toString() method
  public String toString()
  {
    return "URL: " + url + "\n";
  }
}
