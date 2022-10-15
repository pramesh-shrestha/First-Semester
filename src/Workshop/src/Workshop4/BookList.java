package Workshop4;

public class BookList
{
  private int size = 0;
  private Book[] books;

  //A one-argument constructor taking the maximum number of books allowed in the list
  public BookList(int maxNrOfBooks)
  {
    books = new Book[maxNrOfBooks];
  }
  //returns the size of the BookList
  public int getSize()
  {
    for(int i = 0; i < books.length; i++)
    {
      if(books[i] != null)
      {
        size = size + 1;
      }
    }
    return size;
  }
  //A method addBook adding a book into the list (without overwriting an existing book)
  public void addBook(Book book)
  {
    for(int i = 0; i < books.length; i++)
    {
      if(books[i] == null)
      {
        books[i] = book;
      }
    }
  }
  //A method getBook returning the book at the index specified to the method
  public Book getBook(int index)
  {
    return books[index];
  }
  //A method contains returning true if the book passed to the method is in the list otherwise returns
  //false
  public boolean contains(Book book)
  {
    for (int i = 0; i < books.length; i++)
    {
      if(books[i].equals(book))
      {
        return true;
      }
    }return false;
  }
  //A method getYearOfBook looping through the list to find a book with a title as specified, if found
  //the method return the year of this book and if not found the method return -1
  public int yearOfBook(String bookTitle)
  {
    for(int i = 0; i < books.length; i++)
    {
      if(books[i].getTitle().equals(bookTitle))
      {
        return books[i].getYear();
      }
    }return -1;
  }
  //A toString method returning all information of a book list in a string –here you also need a loop
  public String toString()
  {
    String returnStr = "";
    for(int i = 0; i < books.length; i++)
    {
      returnStr += returnStr + books[i] + " ";
    }
    return returnStr + "Size: " + size;
  }

}
