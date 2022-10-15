package Workshop6.Person;

public class Book
{
  private String title;
  private String isbn;
  private Person author;

  public Book(Person author, String title, String isbn)
  {
    this.title = title;
    this.isbn = isbn;
    this.author = author;
  }

  public String getAuthorName()
  {
    return author.getName();
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
