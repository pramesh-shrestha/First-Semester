package Workshop6.Person;

public class LibraryBook extends Book
{
  private Person borrower;

  public LibraryBook(Person borrower, String title, String isbn)
  {
    super(borrower,title,isbn);

  }

  //loanBook
  public void loanBook(Person borrower)
  {
    this.borrower = borrower;
  }

  //returnBook
  public void returnBook()
  {
    borrower = null;
  }

  public String toString()
  {
    return super.toString() + "Borrower: " + borrower;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof LibraryBook))
    {
      return false;
    }
    LibraryBook other = (LibraryBook) obj;
    return super.equals(other) &&
        borrower.equals(other.borrower);
  }
}
