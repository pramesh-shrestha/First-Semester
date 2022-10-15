package noteBook;

public class NoteBook
{
  private int numberOfNotes;
  private Note[] note;

  //constructor
  public NoteBook(int maximumNumberOfNotes)
  {
    note = new Note[maximumNumberOfNotes];
  }
  //getNumberOfNotes
  public int getNumberOfNotes()
  {
    return numberOfNotes;
  }
  //getNote
  public Note getNote(int index)
  {
    return note[index].copy();
  }
  //getMessage
  public String getMessage(int index)
  {
    return note[index].getMessage();
  }
  //addNote
  public void addNote(Note note)
  {
    this.note[numberOfNotes] = note.copy();
    numberOfNotes++;
  }
  //addNote passing message as String
  public void addNote(String message)
  {

  }

}
