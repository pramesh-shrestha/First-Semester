package Book;

import java.util.ArrayList;

public class BookList
{
  private ArrayList<Book> books;

  public BookList()
  {
    books = new ArrayList<>();
  }

  public int getNumberOfBooks()
  {
    return books.size();
  }
  public void addBook(Book book)
  {
    books.add(book);
  }
  public Book getBook(int index)
  {
    return books.get(index);
  }
  public Book getBook(String isbn)
  {
    for (int i = 0; i < books.size(); i++)
    {
      if(books.get(i).getIsbn().equals(isbn))
      {
        return books.get(i);
      }
    }
    return null;
  }

  public Book removeBook(int index)
  {
    return books.remove(index);
  }

  public int getIndexOfFirstPrintedBook()
  {
    for (int i = 0; i < books.size(); i++)
    {
      if(books.get(i) instanceof PrintedBook)
      {
        return i;
      }
    }
    return -1;
  }

  public int getNumberOfBooksByType(String bookType)
  {
    int count =0;
    for(int i = 0; i < books.size(); i++)
    {
      if(books.get(i).getBookType().equals(bookType))
      {
        count++;
      }
    }
    return count;
  }

  public Book[] getBooksByType(String bookType)
  {
    ArrayList<Book> temp = new ArrayList<>();
    for (int i = 0; i < books.size(); i++)
    {
      if(books.get(i).getBookType().equals(bookType))
      {
        temp.add(books.get(i));
      }
    }
    return temp.toArray(new Book[temp.size()]);
  }

  public Ebook[] getAllEBooks()
  {
    ArrayList<Ebook> temp = new ArrayList<>();
    for (int i = 0; i < books.size(); i++)
    {
        if(books.get(i) instanceof Ebook)
        {
          temp.add((Ebook) books.get(i));
        }

    }
    return temp.toArray(new Ebook[temp.size()]);

//    return (Ebook[]) getBooksByType("E-book");
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; i < books.size(); i++)
    {
      str += books.get(i) + "\n";
    }
    return str;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof BookList))
    {
      return false;
    }
    BookList other = (BookList) obj;
    return books.equals(other.books);
  }
}
