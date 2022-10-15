package Person;

import java.util.ArrayList;

public class Teacher extends Employee
{
  private String level;
  private ArrayList<String> courses;

  public Teacher(String name, int id, double hours, double rate, String level)
  {
    super(name,id,hours,rate);
    this.level = level;
    courses = new ArrayList<>();
  }

  public String getLevel()
  {
    return level;
  }

  public void setLevel(String level)
  {
    this.level = level;
  }

  public ArrayList<String> getCourses()
  {
    return courses;
  }

  public void setCourses(ArrayList<String> courses)
  {
    this.courses = courses;
  }

  //addCourse
  public void addCourse(String course)
  {
    courses.add(course);
  }

  //getAllCourses
  public String[] getAllCourses()
  {
    return courses.toArray(new String[courses.size()]);
  }

  //toString
  public String toString()
  {
    return super.toString() + "Level: " + level + "\n" + "Courses\n" + courses + "\n";
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Teacher))
    {
      return false;
    }
    Teacher other = (Teacher) obj;
    return super.equals(other) && level.equals(other.level) && courses.equals(other.courses);
  }
}
