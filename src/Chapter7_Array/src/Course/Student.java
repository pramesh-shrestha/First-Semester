package Course;

import java.util.Objects;

public class Student
{
  private String name;
  private int semester;

  //constructor
  public Student(String name, int semester)
  {
    this.name = name;
    this.semester = semester;
  }

  //getName
  public String getName()
  {
    return name;
  }

  //getSemester
  public int getSemester()
  {
    return semester;
  }

  //equals method
  public boolean equals(Object obj)
  {
   if(!(obj instanceof Student))
   {
     return false;
   }
   Student other = (Student) obj;
   return name.equals(other.name) &&
       semester == other.semester;
  }
}
