/*6. Employee Class Modification
In Programming Challenge 1 of Chapter 3 you wrote an Employee class. Add the following
to the class:
● A constructor that accepts the following values as arguments and assigns them to the
appropriate fields: employee’s name, employee’s ID number, department, and position.
● A constructor that accepts the following values as arguments and assigns them to the
appropriate fields: employee’s name and ID number. The department and position
fields should be assigned an empty string ("").
● A no-arg constructor that assigns empty strings ("") to the name, department, and
position fields, and 0 to the idNumber field.
Write a program that tests and demonstrates these constructors.*/
package Challenge6_Employee;

public class Employee
{
  //declaring ProgrammingChallenge1.Employee class fields
  private String name;
  private int idNumber;
  private String department;
  private String position;

  //constructor
  public Employee(String name, int idNumber, String department, String position)
  {
    this.name = name;
    this.idNumber = idNumber;
    this.department = department;
    this.position = position;
  }
  public Employee(String name, int idNumber)
  {
    this.name = name;
    this.idNumber = idNumber;
    department = "";
    position = "";
  }
  public Employee()
  {
    name = "";
    idNumber = 0;
    department = "";
    position = "";
  }

  //creating accessor method that return the values in these fields
  public String getName()
  {
    return name;
  }
  public int getIdNumber()
  {
    return idNumber;
  }
  public String getDepartment()
  {
    return  department;
  }
  public String getPosition()
  {
    return position;
  }

  //creating mutator methods to store values in these fields
  public void setName(String name)
  {
    this.name = name;
  }
  public void setIdNumber(int idNumber)
  {
    this.idNumber = idNumber;
  }
  public void setDepartment(String department)
  {
    this.department = department;
  }
  public void setPosition(String position)
  {
    this.position = position;
  }
}
