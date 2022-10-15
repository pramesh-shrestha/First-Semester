package Workshop7;

import Workshop7.utils.MyFileHandler;


import java.io.FileNotFoundException;
import java.io.IOException;


public class EducationTest
{
  public static void main(String[] args)
  {
    StudentList list = new StudentList(3);
    Education education1 = new Education("GBE","Global Business Engineering");
    Education education2 = new Education("ICT", "ICTEngineering");
    Education education3 = new Education("CA", "Construction Architect");
    Student student1 = new Student("Suhani",education3);
    Student student2 = new Student("Rajiv", education1);
    Student student3 = new Student("Pramesh", education2);

    list.addStudent(student1);
    list.addStudent(student2);
    list.addStudent(student3);


    try
    {
      MyFileHandler.writeToBinaryFile("Workshop/src/Workshop7/students.bin", list);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }

   try
   {
     MyFileHandler.readFromBinaryFile("Workshop/src/Workshop7/students.bin");

   }
   catch (FileNotFoundException e)
   {
     System.out.println("File not found");
   }
   catch (IOException e)
   {
     System.out.println("IO Error reading file");
   }
   catch (ClassNotFoundException e)
   {
     e.printStackTrace();
   }


  }
}
