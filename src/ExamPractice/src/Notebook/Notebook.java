package Notebook;

import java.util.ArrayList;

public class Notebook
{
  private int numberOfNotes;
  private ArrayList<Note> notes;

  public Notebook(int maxNumberOfNotes)
  {
    numberOfNotes= maxNumberOfNotes;
    notes = new ArrayList<>();
  }

  public void addNote(Note note)
  {
    if(notes.size() < numberOfNotes)
    {
      notes.add(note.copy());
    }
  }

  public void setNote(Note note, int index)
  {
    notes.set(index,note);
  }

  public void removeNote(int index)
  {
    notes.remove(index);
  }

  public Note getNote(int index)
  {
    if(index < numberOfNotes)
    {
      return notes.get(index).copy();
    }
    else
    {
      return null;
    }
  }

  public int getNumberOfPriorityNotes()
  {
    int count = 0;
    for (int i = 0; i < notes.size(); i++)
    {
      if(notes.get(i) instanceof PriorityNote)
      {
        count++;
      }
    }
    return count;
  }

  public PriorityNote[] getPriorityNotes()
  {
    ArrayList<PriorityNote> temp = new ArrayList<>();
    for (int i = 0; i < notes.size(); i++)
    {
      if(notes.get(i) instanceof PriorityNote)
      {
        temp.add((PriorityNote)notes.get(i));
      }
    }
    PriorityNote[] tempNote = temp.toArray(new PriorityNote[temp.size()]);

    PriorityNote[] priorityNotes = new PriorityNote[tempNote.length];
    for (int i = 0; i < tempNote.length; i++)
    {
      for (int j = i+1; j < tempNote.length; j++)
      {
        if(tempNote[i].getPriority() > tempNote[j].getPriority())
        {
          priorityNotes[i] = tempNote[j];
          tempNote[j] = tempNote[i];
          tempNote[i] = priorityNotes[i];
        }
      }
    }
    return priorityNotes;

  }
}
