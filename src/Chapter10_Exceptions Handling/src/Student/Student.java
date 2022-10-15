package Student;

public class Student
{
  private String name;
  private int grade;

  //constructor
  public Student(String name, int grade)
  {
    this.name = name;
    setGrade(grade);
  }

  public String getName()
  {
    return name;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setGrade(int grade)
  {
    if(grade != -3 && grade != 0 && grade != 2 && grade != 4 && grade != 7 && grade != 10 && grade != 12)
    {
      throw new IllegalGradeException("Invalid grade");
    }
    this.grade = grade;
  }

  //toString
  public String toString()
  {
    return "Name: " + name + " Grade: " + grade;
  }


}
