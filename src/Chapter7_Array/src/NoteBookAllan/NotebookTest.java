package NoteBookAllan;

public class NotebookTest
{
   public static void main(String[] args)
   {
      Notebook nb = new Notebook(10);
      nb.addNote("Java lessons today");
      nb.addNote("Read the chapter about arrays");
      nb.addHighPriorityNote("Java midterm on 28/03!");
      nb.addNote("Wash your hands!");
      nb.addHighPriorityNote("Check Facebook and/or Reddit during lessons");

      Note n1 = new Note("Lunch break starts at 11:50");
      nb.addNote(n1); 
      
      System.out.println("Number of notes: " + nb.getNumberOfNotes());
      System.out.println("Number of high priority notes: " + nb.getNumberOfHighPriorityNotes());
      System.out.println("\nNotebook:\n" + nb);
      
      nb.removeNote(4);
      System.out.println();
       
      System.out.println("Number of notes: " + nb.getNumberOfNotes());
      System.out.println("Number of high priority notes: " + nb.getNumberOfHighPriorityNotes());
      System.out.println("\nNotebook:\n" + nb);
   }
}
