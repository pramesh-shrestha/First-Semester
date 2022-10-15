package NoteBookArrayList;

public class Note
{
  private String message;
  private boolean highPriority;

  public Note(String message)
  {
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public boolean isHighPriority()
  {
    return highPriority;
  }
  //setToHighPriority
  public void setToHighPriority()
  {
    highPriority = true;
  }
  //setToLowPriority
  public void setToLowPriority()
  {
    highPriority = false;
  }

  //copy method
  public Note copy()
  {
    return new Note(message);
  }

  //toString method()
  public String toString()
  {
    return "Message: " + message + "High priority: " + highPriority;
  }

}
