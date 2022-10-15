/*Implement the classes Grade and GradeList shown in the class diagram below. The
grade instance variable in the Grade class is used to store a Danish grade (-3, 0, 2, 4, 7, 10
or 12) and courseName indicates for which course the grade was given. The multiplicity
on the aggregation indicates that one GradeList object can store multiple Grade objects.
So, use an array of grades (Grade[]) as instance variable in class GradeList. */
package gradeList;

public class GradeList
{
  private int[] grades;

  //creating constructor
  public GradeList(int numberOfGrades)
  {
    grades = new int[numberOfGrades];

  }

  //get method
  public int getNumberOfGrades()
  {
    return grades.length;
  }

  public int getGrade(int index)
  {
    return grades[index];
  }
  public void setGrade(int grade, int index)
  {
    grades[index] = grade;
  }

  //get average
  public double getAverage()
  {
    double sum = 0;
    for(int i = 0; i < grades.length; i++)
    {
      sum += sum +grades[i];
    }
    double average = sum/grades.length;
    return average;
  }

  //toString method
  public String toString()
  {
    String returnStr = "";
    for(int i = 0; i < grades.length; i++)
    {
      returnStr = returnStr + grades[i] + " ";
    }
    return returnStr;
  }

  //equals method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof GradeList))
    {
      return false;
    }
    GradeList other = (GradeList)obj;
    if(grades.length != other.grades.length)
    {
      return false;
    }
    else
    {
      for (int i = 0; i < grades.length; i++)
      {
        if(grades[i] != other.grades[i])
        {
          return false;

        }
      }
      return true;
    }
  }

}
