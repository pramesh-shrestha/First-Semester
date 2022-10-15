package education;

import java.util.ArrayList;

public class StudentList
{
  private int size;
  private ArrayList<Student> students;

  public StudentList(int size)
  {
    this.size = size;
    students = new ArrayList<>();
  }

  public int getSize()
  {
    return size;
  }

  public void addStudent(Student who)
  {
    if(students.size() < size)
    {
      students.add(who);
    }
  }

  public void removeStudent(Student who)
  {
    students.remove(who);
  }

  public Student getStudent(int index)
  {
   return students.get(index);
  }

  public Student[] getICTEngineeringStudents()
  {
     ArrayList<Student> temp =  new ArrayList<>();
     for(int i = 0; i < students.size(); i++)
     {
        if(students.get(i).getEducation().getCode().equals("ICT") ||
            students.get(i).getEducation().getCode().equals("ICT Engineering"))
        {
          temp.add(getStudent(i));
        }
     }
     return temp.toArray(new Student[temp.size()]);
  }

}
