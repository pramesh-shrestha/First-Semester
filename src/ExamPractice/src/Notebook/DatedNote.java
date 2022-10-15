package Notebook;

public class DatedNote extends Note
{
  private MyDAte date;

  public DatedNote(String message, MyDAte date)
  {
    super(message);
    this.date = date;
  }

  public MyDAte getDate()
  {
    return date.copy();
  }
  public Note copy()
  {
    return new DatedNote(super.getMessage(),date);
  }

  public String toString()
  {
    return super.toString() + date;
  }
}
