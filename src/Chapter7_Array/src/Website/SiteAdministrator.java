package Website;

public class SiteAdministrator
{
  private String name;
  private SiteCollection siteCollection;

  //constructor
  public SiteAdministrator(String name)
  {
    this.name = name;
    siteCollection = new SiteCollection(10);
  }
  //getName
  public String getName()
  {
    return name;
  }
  //getSiteCollection
  public SiteCollection getSiteCollection()
  {
    return siteCollection;
  }
  //getNextSiteToUpdate
  public Website getNextSiteToUpdate()
  {
   // return siteCollection.getAllNotUpdatedSties()[0];
    Website[] websites = siteCollection.getAllSites();
   for(int i = 0; i < websites.length; i++)
   {
      if(websites[i].needsUpdate()) {
        return websites[i];
      }
    }
   return null;
  }

  //getAllSitesToUpdate
  public Website[] getAllSitesToUpdate()
  {
    return siteCollection.getAllNotUpdatedSties();
  }


}
