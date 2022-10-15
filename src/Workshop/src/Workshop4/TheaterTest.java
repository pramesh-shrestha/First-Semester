package Workshop4;

public class TheaterTest
{
  public static void main(String[] args)
  {
    Movie movie1 = new Movie("John Wick", "Action",3);
    Movie movie2 = new Movie("Spider Man", "Action",2);
    Movie movie3 = new Movie("Avenger", "Action",1);
    Movie movie4 = new Movie("Avatar", "Action",4);

    //Theater object
    Theatre theatre1 = new Theatre(6);
    //adding movies
    theatre1.addMovie(movie1);
    theatre1.addMovie(movie2);
    theatre1.addMovie(movie3);
    theatre1.addMovie(movie4);
    System.out.println(theatre1);
    System.out.println(); //line break

    //removing movies
    theatre1.removeMovie(movie1);
    System.out.println("After removing movie1");
    System.out.println(theatre1);

    //size of movie array
    System.out.println("Printing size");
    System.out.println(theatre1.size());

    //getting all movies
    System.out.println(theatre1.getAllMoviesOfGenre("Action"));
  }
}
