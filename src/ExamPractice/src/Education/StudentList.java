package Education;

import java.util.ArrayList;

public class StudentList
{
  private int size;
  private ArrayList<Student> list;

  public StudentList()
  {
    list = new ArrayList<>(size);
  }

  public void addStudent(Student student)
  {
    if(list.size() < size)
    {
      list.add(student);
    }

  }
  public Student getStudent(int index)
  {
    return list.get(index);
  }
  public void removeStudent(Student student)
  {
    list.remove(student);
  }
  public int getNumberOfStudents()
  {
    return list.size();
  }
  public int getNumberOfStudentsByEducation(Education education)
  {
    int count = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if(list.get(i).getEducation().equals((education)))
      {
        count++;
      }
    }
    return count;
  }

  public Student[] getStudentsByEducation(Education education)
  {
    ArrayList<Student> temp = new ArrayList<>();
    for(int i =0; i < list.size(); i++)
    {
      if(list.get(i).getEducation().equals(education))
      {
        temp.add(list.get(i));
      }
    }
    return temp.toArray(new Student[temp.size()]);
  }

  public int getNumberOfHighSchoolStudents()
  {
    int count = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if(list.get(i).getEducation() instanceof School && ((School) list.get(i).getEducation()).getSchoolType().equals("High school"))
      {
        count++;
      }

    }
    return count;
  }
}
