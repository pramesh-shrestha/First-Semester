import java.util.ArrayList;

public class Course
{
  private String title;
  private Instructor[] instructors;
  private ArrayList<Student> students;

  public Course(String title, Instructor primaryInstructor)
  {
    this.title = title;
    instructors = new Instructor[2];
    instructors[0] = primaryInstructor;
    students = new ArrayList<>();
  }

  public String getTitle()
  {
    return title;
  }
  public Instructor getPrimaryInstructor()
  {
    return instructors[0];
  }
  public Instructor getSecondaryInstructor()
  {
    return instructors[1];
  }
  public void setSecondaryInstructor(Instructor instructor)
  {
    instructors[1] = instructor;
  }
  public void addStudent(Student student)
  {
    students.add(student);
  }
  public int getNumberOfInstructors()
  {
    int count = 0;
    for(int i = 0; i < instructors.length; i++)
    {
      if(instructors[i] != null)
      {
        count++;
      }
    }return count;
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
  public Student[] getStudentsBySemester(int semester)
  {
    Student[] temp = new Student[students.size()];
    {
      for(int i = 0; i < students.size(); i++)
      {
        if(students.get(i).getSemester() == semester)
        {
          temp[i] = students.get(i);
        }
      }
      return temp;
    }
  }
  public boolean hasStudent(String name)
  {
    for(int i = 0; i < students.size(); i++)
    {
      if(students.get(i).getName().equals(name))
      {
        return true;
      }
    }return false;
  }
  public String toString()
  {
    String str = "";
    for (int i = 0; i < students.size(); i++)
    {
      str += students.get(i) + " ";
    }
    return str + title;
  }
}

