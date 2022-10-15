package Challenge1_Employee;

/*Programming Challenge_1_Employee Class
------------------------------------------
Write a class named ProgrammingChallenge1.Employee that has the following fields:
name. The name field is a String object that holds the employee’s name.
idNumber. The idNumber is an int variable that holds the employee’s ID number.
department. The department field is a String object that holds the name of the department
where the employee works.
position. The position field is a String object that holds the employee’s job title.
Write appropriate mutator methods that store values in these fields and accessor methods
that return the values in these fields. Once you have the written the class, write a separate
program that creates three ProgrammingChallenge1.Employee objects to hold the following data.

Name          ID Number    Department      Position
Susan Meyers  47899        Accounting      Vice President
Mark Jones    39119        IT              Programmer
Joy Rogers    81774        Manufacturing   Engineer

The program should store this data in the three objects and then display the data for each
employee on the screen.
*/
public class Employee
{
  //declaring ProgrammingChallenge1.Employee class fields
  private String name;
  private int idNumber;
  private String department;
  private String position;

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
