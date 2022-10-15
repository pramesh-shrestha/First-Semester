package secondGradeList;

public class GradeList
{
  private Grade[] grades;

  //constructor
  public GradeList(int numberOfGrades)
  {
    grades = new Grade[numberOfGrades];
  }

  //getNumberOfGrades
  public int getNumberOfGrades()
  {
    return grades.length;
  }

  //setNumberOfGrades
  public void setGrades(Grade grade, int index)
  {
    grades[index] = grade;
  }

  // getAverage
  public double getAverage ()
  {
    double sum = 0;
    for (int i = 0; i < grades.length; i++)
    {
      sum += grades[i].getGrade();
    }
    double average = sum/grades.length;
    return average;
  }

  //toString() method
  public String toString()
  {
    String returnStr = "";
    for(int i = 0; i < grades.length; i++)
    {
      returnStr = returnStr + grades[i] + "\n";
    }
    return returnStr;
  }

}
