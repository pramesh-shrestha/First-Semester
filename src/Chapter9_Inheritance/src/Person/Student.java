package Person;

public class Student extends Person
{
  private char grade;

  public Student(String name, int id, char grade)
  {
    super(name,id);
    this.grade = grade;
  }

  public char getGrade()
  {
    return grade;
  }

  public void setGrade(char grade)
  {
    this.grade = grade;
  }

  public String toString()
  {
    return super.toString() + "Student{" + "grade=" + grade + '}';
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Student))
    {
      return false;
    }
    Student other = (Student) obj;
    return super.equals(other) && grade == other.grade;
  }
}
