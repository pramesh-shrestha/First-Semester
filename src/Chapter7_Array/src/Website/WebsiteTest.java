package Website;

public class WebsiteTest
{
  public static void main(String[] args)
  {
    Website website = new Website("www.google.com");
    Website website1 = new Website("www.facebook.com");
    SiteCollection siteCollection = new SiteCollection(2);
    SiteAdministrator siteAdministrator = new SiteAdministrator("Pramesh");

    siteCollection.addSite(website);
    siteCollection.addSite(website1);
//    System.out.println(siteCollection);
//    website.markAsUpdated();
//    System.out.println("Needs update? " + website.needsUpdate());
//    website.markAsNotUpdated();
//    System.out.println("Needs update? " + website.needsUpdate());
//    System.out.println("Updated sites: " + siteCollection.getNumberOfUpdateSites());

    Website[] temp = siteCollection.getAllSites();
    for (int i = 0; i < temp.length; i++)
    {
      System.out.println(temp[i]);
    }
  }
}
