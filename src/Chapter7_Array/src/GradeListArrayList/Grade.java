package GradeListArrayList;

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
  //get methods
  public String getCourseName()
  {
    return courseName;
  }
  public int getGrade()
  {
    return grade;
  }
  //set methods
  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }
  public void setGrade(int grade)
  {
    this.grade = grade;
  }

  //toString method
  public String toString()
  {
    return "Course name: " + courseName + " Grade: " + grade + "\n";
  }

}
