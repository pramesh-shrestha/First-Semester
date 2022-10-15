import java.util.ArrayList;

public class CourseInstructor
{
  private String title;
  private ArrayList<Student> students;
  private Instructor primaryInstructor;
  private Instructor secondaryInstructor;

  public CourseInstructor(String title, Instructor primaryInstructor)
  {
    this.title = title;
    this.primaryInstructor = primaryInstructor;
    secondaryInstructor = null;
    students = new ArrayList<>();
  }
  public String getTitle()
  {
    return title;
  }
  public Instructor getPrimaryInstructor()
  {
    return primaryInstructor;
  }
  public Instructor getSecondaryInstructor()
  {
    return secondaryInstructor;
  }
  public void setSecondaryInstructor(Instructor instructor)
  {
    secondaryInstructor = instructor;
  }
  public void addStudent(Student student)
  {
    students.add(student);
  }
  public int getNumberOfInstructors()
  {
    return primaryInstructor.getOfficeNumber() + secondaryInstructor.getOfficeNumber();
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
    }return count;
  }
  public Student[] getStudentsBySemester(int semester)
  {
    Student[] temp = new Student[students.size()];
    for(int i = 0; i < students.size(); i++)
    {
      if(students.get(i).getSemester() == semester)
      {
        temp[i] = students.get(i);
      }
    }
    return temp;
  }

  public boolean hasStudents(String name)
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
    String str ="";
    for (int i = 0; i < students.size(); i++)
    {
      str += students.get(i) + " ";
    }
    return str + primaryInstructor + secondaryInstructor;
  }

}
