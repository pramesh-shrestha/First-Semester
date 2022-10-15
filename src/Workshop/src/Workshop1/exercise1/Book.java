package Workshop1.exercise1;

public class Book
{
  private String title;
  private int year;

  //creating two args constructor
  public Book(String title, int year)
  {
    this.title = title;
    this.year = year;
  }

  //creating get methods
  public String getTitle()
  {
    return title;
  }
  public int getYear()
  {
    return year;
  }

  //creating toString method
  public String toString()
  {
    return "Title: " + title + "\nYear: " + year;
  }

}
