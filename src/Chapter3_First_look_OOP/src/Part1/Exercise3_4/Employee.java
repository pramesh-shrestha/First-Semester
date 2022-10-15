package Part1.Exercise3_4;

/*Challnge_Exercise 1. Part1.Exercise3_4.Employee Class
Write a class named Part1.Exercise3_4.Employee that has the following fields:
name. The name field is a String object that holds the employee’s name.
idNumber. The idNumber is an int variable that holds the employee’s ID number.
department. The department field is a String object that holds the name of the department
where the employee works.
position. The position field is a String object that holds the employee’s job title.
Write appropriate mutator methods that store values in these fields and accessor methods
that return the values in these fields. Once you have the written the class, write a separate
program that creates three Part1.Exercise3_4.Employee objects to hold the following data.

Name          ID Number    Department      Position
Susan Meyers  47899        Accounting      Vice President
Mark Jones    39119        IT              Programmer
Joy Rogers    81774        Manufacturing   Engineer

The program should store this data in the three objects and then display the data for each
employee on the screen.
*/
public class Employee
{
  //setting up fields
  private String name, department, position;
  private int idNumber;

  //setting mutator methods
  public void setName(String employeeName) {
    name = employeeName;
  }
  public void setIdNumber(int id) {
    idNumber = id;
  }
  public void setDepartment(String workDepartment) {
    department = workDepartment;
  }
  public void setPosition(String jobTitle) {
    position = jobTitle;
  }

  //setting accessor methods
  public String getName() {
    return name;
  }
  public int getIdNumber() {
    return idNumber;
  }
  public String getDepartment() {
    return department;
  }
  public String getPosition() {
    return position;
  }

}
