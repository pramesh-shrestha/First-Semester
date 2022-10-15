package Workshop4;

public class Book
{
  private String title;
  private int year;

  //constructor
  public Book(String title, int year)
  {
    this.title = title;
    this.year = year;
  }

  //getmethods
  public String getTitle()
  {
    return title;
  }

  public int getYear()
  {
    return year;
  }

  //toString method
  public String toString()
  {
    return "Title: " + title + "\nYear: " + year;
  }

  //equals() method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Book))
    {
      return false;
    }
    Book other = (Book) obj;
    return title.equals(other.title) &&
        year == other.year;
  }
}
