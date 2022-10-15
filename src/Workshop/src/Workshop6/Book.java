package Workshop6;

public class Book
{
  private String author;
  private String title;
  private String isbn;

  public Book(String author, String title, String isbn)
  {
    this.author = author;
    this.title = title;
    this.isbn = isbn;
  }

  public String getAuthor()
  {
    return author;
  }

  public String getTitle()
  {
    return title;
  }

  public String getIsbn()
  {
    return isbn;
  }

  public String toString()
  {
    return "Author: " + author + "Title: " + title + "ISBN: " + isbn;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Book))
    {
      return false;
    }
    Book other = (Book) obj;
    return author.equals(other.author) &&
        title.equals(other.title) &&
        isbn.equals((other.isbn));
  }
}
