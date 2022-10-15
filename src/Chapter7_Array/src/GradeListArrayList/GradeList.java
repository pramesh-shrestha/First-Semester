package GradeListArrayList;

import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> grades;

  //constructor
  public GradeList()
  {
    grades = new ArrayList<>();
  }

  public int getNumberOfGrades()
  {
    return grades.size();
  }

  public ArrayList<Grade> getAllGrades()
  {
    return grades;
  }

  //returning the elements of ArrayList as an Array
  public Grade[] getAllGradesAsArray() //this means the return should be an array
  {
    Grade[] tempArray = new Grade[grades.size()];
    Grade[] newArray = grades.toArray(tempArray);
//    Grade[] newArray = grades.toArray(new Grade[grades.size()]);
   return newArray;
  }

  //adding grade to the list
  public void addGrade(Grade grade)
  {
    grades.add(grade);
  }

  //get average of grades
  public double getAverage()
  {
    double sum = 0;

    for(int i = 0; i < grades.size(); i++)
    {
      sum += grades.get(i).getGrade();
    }
    double average = sum/grades.size();
    return average;
  }

  //toString() method
  public String toString()
  {
    String str = "";
    for(int i = 0; i < grades.size(); i++)
    {
      str += "Course name: " + grades.get(i).getCourseName() + " Grade: " + grades.get(i).getGrade() + "\n";
    }
    return str;
  }


}
