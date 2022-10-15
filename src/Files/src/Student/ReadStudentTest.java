package Student;

import java.io.*;
import java.util.Scanner;

public class ReadStudentTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a file name");
    String fileName = input.nextLine();
    try
    {
      FileInputStream fileIn = new FileInputStream("Files/src/Student/" + fileName);
      ObjectInputStream read = new ObjectInputStream(fileIn);

      while(true)
      {
        try
        {
          //reading the object and casting it as Student and storing in student
          Student student = (Student) read.readObject();
          System.out.println(student);
        }
        catch(EOFException e)
        {
          System.out.println("End of line.");
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO error reading from the file.");
      System.exit(1);
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class not found.");
      System.exit(1);
    }
  }
}
