package Course;

import java.util.ArrayList;
//------------------------All the commented statements are ArrayList way of solving it-------------------
public class Course
{
  private String title;
  private ArrayList<Student> students;
  private Instructor[] instructors;
//  private ArrayList<Instructor> instructors;
  //Or we could make two private variables because the Course class has minimum 1 and maximum 2 instructors.
  //so we could do this as
  //private Instructor primaryInstructor;
  //private Instructor secondaryInstructor;


  //constructor
  public Course(String title, Instructor primaryInstructor)
  {
    this.title = title;
    students = new ArrayList<>();
    instructors = new Instructor[2];
//    instructors = new ArrayList<>();
//    instructors.add(primaryInstructor); adding primaryInstructor to the Instructor ArrayList because the constructor consists of Instructor datatype
  }

  //getTitle
  public String getTitle()
  {
    return title;
  }

  //getPrimaryInstructor
  public Instructor getPrimaryInstructor()
  {
//    return instructors.get(0); //this returns the primary instructor
    return instructors[0];
  }

  //getSecondaryInstructor
  public Instructor getSecondaryInstructor()
  {
    return instructors[1];
//    return instructors.get(1);
  }
  //setSecondaryInstructor
  public void setSecondaryInstructor(Instructor instructor)
  {
    instructors[1] = instructor;
//    if(instructors.get(1) == null) {
//      instructors.add(secondaryInstructor);
//    }
//    else
//    {
//      instructors.add(1, instructor);
//    }
  }

  //addStudent
  public void addStudent(Student student)
  {
    students.add(student);
  }

  //getNumberOfInstructors
  public int getNumberOfInstructors()
  {
//    return instructors.size(); //ArrayList

    int count = 0; //Array
    for(int i = 0; i < instructors.length; i++)
    {
      if(instructors[i] != null)
      {
        count++;
      }
    }return count;
  }
  //getNumberOfStudents
  public int getNumberOfStudents(int semester)
  {
    int count = 0;
    for(int i = 0; i < students.size(); i++)
    {
      if(students.get(i).getSemester() == semester)
      {
        count += 1;
      }
    }return count;
  }

  //getStudentsBySemester
  public Student[] getStudentsBySemester(int semester)
  {
    //creating temporary Student arraylist
    ArrayList<Student> temp = new ArrayList<>();
    for(int i = 0; i < students.size(); i++)
    {
      if(students.get(i).getSemester() == semester)
      {
        temp.add(students.get(i));
      }
    }
    //converting to an array and returning it
    return temp.toArray(new Student[temp.size()]);
    //or alternatively we can understand this above line as
    // Student[] temp = new Student[temp.size()];
    // Student[] temp2 = temp.toArray(temp);
  }

  //hasStudent
  public boolean hasStudent(String name)
  {
    for(int i = 0; i < students.size(); i++)
    {
      if(students.get(i).getName().equals(name))
      {
        return true;
      }
    }return false;
  }

  //toString
  public String toString()
  {
    String str1 = "";
    String str2 = "";
    for(int i = 0; i < students.size(); i ++)
    {
      str1 += students.get(i) + "\n";
    }
    for(int i = 0; i < instructors.length; i++)
    {
      str2 += instructors[i] + "\n";
    }
    return "Students: " + str1 + "Instructors: " + str2 + "Course Title: " + title;

  }

}
