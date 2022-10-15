package Workshop7;

import java.awt.*;
import java.io.Serializable;

public class Student implements Serializable
{
  private String name;
  private Education education;

  //constructor
  public Student(String name, Education education)
  {
    this.name = name;
    this.education = education;
  }

  //get methods
  public String getName()
  {
    return name;
  }

  public Education getEducation()
  {
    return education;
  }

  //toString
  public String toString()
  {
    return "Name: " + name + "\nEducation: " + education;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Student))
    {
      return false;
    }
    Student other = (Student) obj;
    return name.equals(other.name) &&
        education.equals(other.education);
  }
}
