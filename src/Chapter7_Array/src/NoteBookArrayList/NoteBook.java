package NoteBookArrayList;

import java.util.ArrayList;

public class NoteBook
{
  private int numberOfNotes;
  private ArrayList<Note> notes;

  //1 arg constructor
  public NoteBook(int maxNumberOfNotes)
  {
    notes = new ArrayList<>(maxNumberOfNotes);
  }

  //no arg constructor
  public NoteBook()
  {
    notes = new ArrayList<>(5);
  }

  //getNumberOfNotes
  public int getNumberOfNotes()
  {
    return numberOfNotes;
  }

  //getNote method
  public Note getNote(int index)
  {
    return notes.get(index).copy();
  }
  //getMessage
  public String getMessage(int index)
  {
//    Note note = notes.get(index);
//    String message = note.getMessage();
    return notes.get(index).getMessage();
  }
  //addNote
  public void addNote(Note note)
  {
    if(notes.size() < numberOfNotes) //because note.size is internal size of arraylist and numberofnotes is the notes added in the list
    {
      notes.add(note.copy());
    }
  }
  //addNote
  public void addNote(String message)
  {
    if(notes.size() < numberOfNotes) //because note.size is internal size of arraylist and numberofnotes is the notes added in the list
    {
      //creating NoteBook object
      Note note = new Note(message);
      notes.add(note);
      //alternative way
      //    notes.add(new Note(message));
    }
  }
  //addHighPriorityNote
  public void addHighPriorityNote(String message)
  {
    if(notes.size() < numberOfNotes)
    {
      //Creating Note object
      Note note = new Note(message);
      note.setToHighPriority();
      notes.add(note);
    }
  }

  //removeNote
  public void removeNote(int index)
  {
    notes.remove(index);
  }

  //getAllNotes
  public Note[] getAllNotes() // this means the return should be an array
  {
    Note[] newArray = notes.toArray(new Note[notes.size()]); //toArray method returns the ArrayList to array[]  //how to use copy()??????????????????????
    return newArray;
  }

  //getNumberOfHighPriorityNotes
  public int getNumberOfHighPriorityNotes()
  {
    int count = 0;
    for(int i = 0; i < notes.size(); i++)
    {
      if(notes.get(i).isHighPriority())
      {
        count += 1;
      }
    }return  count;
  }

  //getAllHighPriorityNotes
  public Note[] getAllHighPriorityNotes()
  {
    Note[] tempArray = new Note[getNumberOfHighPriorityNotes()];
    for(int i = 0; i < getNumberOfHighPriorityNotes(); i++)
    {
      if(notes.get(i).isHighPriority())
      {
        tempArray[i] = notes.get(i).copy();
      }
    }return tempArray;
  }

  //toString() method
  public String toString()
  {
    String str = "";
    for(int i = 0; i < notes.size(); i++)
    {
      str += notes.get(i) + "\n";
    }
    return str;
  }
}
