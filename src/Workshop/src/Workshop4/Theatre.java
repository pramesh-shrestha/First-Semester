package Workshop4;

public class Theatre
{
  private int capacity;
  private Movie[] movies;

  public Theatre(int capacity)
  {
    this.capacity = capacity;
    movies = new Movie[capacity];
  }
  //adding movie
  public void addMovie(Movie movie)
  {
    for(int i = 0; i < movies.length; i++)
    {
      if(movies[i] == null)
      {
        movies[i] = movie;
        break;
      }
    }
  }
  //adding movie title and duration
  public void addMovie(String title, int duration)
  {
    for(int i = 0; i < movies.length; i++)
    {
      if(movies[i] == null)
      {
        Movie movie = new Movie(title, duration);
        movies[i] = movie;
        break;
      }
    }
  }

  //size()
  public int size()
  {
    return movies.length; //size of the array
  }
  //return all movies
  public Movie[] getAllMovies()
  {
    return movies;
  }

  //return all movies of genre
  public Movie[] getAllMoviesOfGenre(String genre)
  {
    Movie[] movieGenre = new Movie[100];
    for(int i = 0; i < movies.length; i++)
    {
      if(movies[i].getGenre().equals(genre))
      {
        movieGenre[i] = movies[i];
      }
    }return movieGenre;
  }

  //remove movies
  public void removeMovie(Movie movie)
  {
    for(int i = 0; i < movies.length; i++)
    {
      if(movies[i].equals(movie))
      {
        movies[i] = null;
        break;
      }
    }
  }

  //remove movies from list
  public void removeMovies(Movie[] list)
  {
    for(int i = 0; i < list.length; i++)
    {
      if(movies[i].equals(list))
      {
        movies[i] = null;
        break;
      }
    }
  }

  //toString() method
  public String toString()
  {
    String returnStr = "";
    for(int i = 0; i < movies.length; i++)
    {
      returnStr += "\nMovies " + movies[i];
    }
    return returnStr + "\nCapacity: " + capacity;
  }

}
