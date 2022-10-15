package Course;

import java.util.ArrayList;
import java.util.Arrays;

public class Course
{
  private Instructor[] instructors;
  private ArrayList<Student> students;
  private String title;

  public Course(String title, Instructor primaryInstructor)
  {
    this.title = title;
    students = new ArrayList<>();
    instructors = new Instructor[2];
    instructors[0] = primaryInstructor;
  }

  public String getTitle()
  {
    return title;
  }

  public Instructor getPrimaryInstructor()
  {
    return instructors[0];
  }

  public void setSecondaryInstructor(Instructor instructor)
  {
    instructors[1] = instructor;
  }

  public void addStudent(Student student)
  {
    students.add(student);
  }

  public int getNumberOfStudents(int semester)
  {
    int count = 0;
    for(int i = 0; i < students.size(); i++)
    {
      if(students.get(i).getSemester() == semester)
      {
        count++;
      }
    }
    return count;
  }

  public int getNumberOfInstructors()
  {
    int count =0;
    for(int i = 0; i < instructors.length; i++)
    {
      if(instructors[i] != null)
      {
        count++;
      }
    }
    return count;
  }

  public Student[] getStudentsBySemester(int semester)
  {
    ArrayList<Student> temp = new ArrayList<>();
    for (int i = 0; i < students.size(); i++)
    {
      if(students.get(i).getSemester() == semester)
      {
        temp.add(students.get(i));
      }
    }
    Student[] tempStudent = temp.toArray(new Student[temp.size()]);
    return tempStudent;
  }

  public boolean hasStudent(String name)
  {
    for(int i = 0; i < students.size(); i++)
    {
      if(students.get(i).getName().equals(name))
      {
        return true;
      }
    }
    return false;
  }

  public String toString()
  {
    String instructor = "";
    for(int i = 0; i < instructors.length; i++)
    {
      instructor += instructors[i] + "\n";
    }
    return title + " " + instructor + " " + students;
  }



}
