package Challenge2_ShiftSupervisor;

/*n a particular factory a shift supervisor is a salaried employee who supervises a shift. In addition to a salary, the shift supervisor earns a yearly bonus when his or her shift meets production goals. Design a ShiftSupervisor class that inherits from the Employee class you created
in Programming Challenge 1. The ShiftSupervisor class should have a field that holds the
annual salary and a field that holds the annual production bonus that a shift supervisor has
earned. Write one or more constructors and the appropriate accessor and mutator methods
for the class. Demonstrate the class by writing a program that uses a ShiftSupervisor object.*/
public class Employee
{
  private String name;
  private String number;
  private String date;

  public Employee(String name, String number, String date)
  {
    this.name = name;
    this.number = number;
    this.date = date;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getNumber()
  {
    return number;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public String getDate()
  {
    return date;
  }

  public void setDate(String date)
  {
    this.date = date;
  }

  //toString
  public String toString()
  {
    return "Employee Name  : " + name + "\n" + "Employee Number: " + number + "\n" +
        "Hired Date     : " + date;
  }
}
