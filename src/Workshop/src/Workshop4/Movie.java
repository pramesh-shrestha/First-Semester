package Workshop4;

public class Movie
{
  private String title;
  private String genre;
  private int duration;

  //constructor
  public Movie(String title, String genre, int duration)
  {
    this.title = title;
    this.genre = genre;
    this.duration = duration;
  }
  //two args constructor
  public Movie(String title, int duration)
  {
    this.title = title;
    this.duration = duration;
  }

  public String getTitle()
  {
    return title;
  }
  public String getGenre()
  {
    return genre;
  }
  public void setGenre(String genre)
  {
    this.genre = genre;
  }
  public int getDuration()
  {
    return duration;
  }
  //equals method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Movie))
    {
      return false;
    }
    Movie other = (Movie)obj;
    return title.equals(other.title) &&
        genre.equals(other.genre) &&
        duration == other.duration;
  }

  //toString() method
  public String toString()
  {
    return "Title: " + title + "\nGenre: " + genre + "\nDuration: " + duration;
  }
}
