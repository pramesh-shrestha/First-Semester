package Student;

import java.io.*;

public class WriteStudentTest implements Serializable
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Suhani", "Pandu","Portugal");
    Student student2 = new Student("Rajiv", "Fataah", "India");
    try
    {
      FileOutputStream fileOut = new FileOutputStream("Files/src/Student/students.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOut);

      write.writeObject(student1);
      write.writeObject(student2);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
    }
    catch (IOException e)
    {
      System.out.println("IO error writing to file.");
    }
    System.out.println("Done writing.");
  }
}
