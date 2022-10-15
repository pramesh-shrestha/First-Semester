package secondGradeList;

public class Grade
{
  private String courseName;
  private int grade;

  //constructor
  public Grade(String courseName, int grade)
  {
    this.courseName = courseName;
    this.grade = grade;
  }

  //getCourseName() method
  public String getCourseName()
  {
    return courseName;
  }
  //getGrade() method
  public int getGrade()
  {
    return grade;
  }
  //setCourse() method
  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }
  //setGrade() method
  public void setGrade(int grade)
  {
    this.grade = grade;
  }
  //toString() method
  public String toString()
  {
    return "Course name: " + courseName + " Grade: " + grade;

  }

}
