package Workshop1.exercise1;

public class BookTest
{
  public static void main(String[] args)
  {
    //creating a Book object
    Book book = new Book("Bhauju rocks", 2022);

    //testing all methods
    System.out.println(book.getTitle());
    System.out.println();
    System.out.println(book.getYear());
    System.out.println();
    System.out.println(book);

  }
}
