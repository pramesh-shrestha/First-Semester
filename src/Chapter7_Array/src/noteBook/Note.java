/*Implement the classes Note and Notebook shown in the class diagram below. The
multiplicity on the composition indicates that a Notebook object can store multiple Note
objects, so again use an array (Note[]) as instance variable in class Notebook. In the
Notebook class the numberOfNotes instance variable indicates how many notes are
currently in the notebook, while the maxNumberOfNotes parameter in the constructor is
used to set the size of the array. Since the relationship between the classes is a composition,
then remember to make copies of the Note objects when getting and setting them. */
package noteBook;

public class Note
{
  private String message;
  private boolean highPriority;

  //constructor
  public Note(String message)
  {
    this.message = message;
  }
  //getMessage
  public String getMessage()
  {
    return message;
  }
  //setMessage
  public void setMessage(String message)
  {
    this.message = message;
  }
  //isHighPriority
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
  //toString()
  public String toString()
  {
    return "Message: " + message + " High Priority: " + highPriority;
  }

}
