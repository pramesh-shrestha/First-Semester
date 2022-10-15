/*Exercise 4.07
Modify class Student from the Exercise4_6 above and:
a) Add a method toString() that return a String with all information of a Studentobject.
 As an example calling the method toString() on a Student-object with
name = “Bob”, gender = ‘M’ and student number = 2342 could return the
following string: “Bob, ‘M’, 2342”.
b) Change the test class StudentTest so that you call method toString in the printstatements
where you print out all information of each of the students. */

package Part2.Exercise4_7;

public class StudentModify
{
  //declaring fields
  private String name;
  private char gender;
  int studentNumber;

  //initializing 3 argument constructor
  public StudentModify(String name, char gender, int studentNumber)
  {
    this.name = name;
    this.gender = gender;
    this.studentNumber = studentNumber;
  }
  //initializing 2 argument constructor
  public StudentModify(String name, char gender) {
    this.name = name;
    this.gender = gender;
  }
  //creating set methods
  public void setName(String name) {
    this.name = name;
  }
  public void setStudentNumber(int studentNumber) {
    this.studentNumber = studentNumber;
  }
  //creating get methods
  public String getName() {
    return name;
  }
  public char getGender() {
    return gender;
  }
  public int getStudentNumber() {
    return studentNumber;
  }

  //creating toString() method
  public String toString() {
    return "\""+ name + "," + " " + "'" + gender + "'" + "," + " " + studentNumber + "\"";
  }
}
