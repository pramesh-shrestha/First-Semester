package Workshop7;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentList implements Serializable
{
  private int size;
  private ArrayList<Student> list;

  //constructor
  public StudentList(int size)
  {
    list = new ArrayList<>();
   this.size = size;
  }

  //getSize
  public int getSize()
  {
    return list.size();
  }

  //addStudent
  public void addStudent(Student who)
  {
    if(list.size() < size)
    {
      list.add(who);
    }
  }

  //removeStudent
  public void removeStudent(Student who)
  {
    list.remove(who);
  }

  //getStudent
  public Student getStudent(int index)
  {
    return list.get(index);
  }

  //getICTEngineeringStudents
  public Student[] getICTEngineeringStudents()
  {
    ArrayList<Student> temp = new ArrayList<>();
    for(int i = 0; i < list.size(); i++)
    {
      if(list.get(i).getEducation().equals("ICT Engineering"))
      {
        temp.add(getStudent(i));
      }
    }
    return temp.toArray(new Student[temp.size()]);
  }


}
