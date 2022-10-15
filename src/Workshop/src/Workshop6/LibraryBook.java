package Workshop6;

public class LibraryBook extends Book
{
  private String nameOfBorrower;

  public LibraryBook(String author, String title, String isbn, String nameOfBorrower)
  {
    super(author, title, isbn);
    this.nameOfBorrower = nameOfBorrower;
  }

  //loanBook
  public void loanBook(String nameOfBorrower)
  {
    this.nameOfBorrower = nameOfBorrower;
  }

  //returnBook
  public void returnBook()
  {
    nameOfBorrower = null;
  }

  public String toString()
  {
    return super.toString() + "Borrower: " + nameOfBorrower;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof LibraryBook))
    {
      return false;
    }
    LibraryBook other = (LibraryBook) obj;
    return super.equals(other) &&
        nameOfBorrower.equals(other.nameOfBorrower);
  }
}
