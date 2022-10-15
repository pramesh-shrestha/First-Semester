package education;

public class Student
{
  private String name;
  private Education education;

  public Student(String name, Education education)
  {
    this.name = name;
    this.education = education;
  }

  public String getName()
  {
    return name;
  }

  public Education getEducation()
  {
    return education;
  }

  public String toString()
  {
    return name + " " + education;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
    {
      return false;
    }

    Student other = (Student) obj;
    return name.equals(other.name) && education.equals(other.education);
  }
}
