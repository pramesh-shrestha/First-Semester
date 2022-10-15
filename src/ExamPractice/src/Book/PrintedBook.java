package Book;

public class PrintedBook extends Book
{
  private boolean isPaperback;
  public PrintedBook(String title, String isbn, boolean isPaperback)
  {
    super(title, isbn);
    this.isPaperback = isPaperback;
  }

  public boolean isPaperback()
  {
    return isPaperback;
  }

  public String getBookType()
  {
    if(isPaperback)
    {
      return "Paperback";
    }
    else
    {
      return "HardCover";
    }
  }

  @Override public String toString()
  {
    return super.toString() + "PrintedBook{" + "isPaperback=" + isPaperback + '}';
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof PrintedBook))
    {
      return false;
    }
    PrintedBook other = (PrintedBook) obj;
    return super.equals(other) && isPaperback == other.isPaperback;
  }
}
