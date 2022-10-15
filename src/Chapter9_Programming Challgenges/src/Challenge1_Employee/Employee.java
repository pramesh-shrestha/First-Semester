package Challenge1_Employee;

/*1. Challenge1_Employee.Employee and Challenge1_Employee.ProductionWorker Classes
Design a class named Challenge1_Employee.Employee. The class should keep the following information in fields:
● Challenge1_Employee.Employee name
● Challenge1_Employee.Employee number in the format XXX–L, where each X is a digit within the range 0–9
and the L is a letter within the range A–M.
● Hire date
Write one or more constructors and the appropriate accessor and mutator methods for the class.
Next, write a class named Challenge1_Employee.ProductionWorker that inherits from the Challenge1_Employee.Employee class. The
Challenge1_Employee.ProductionWorker class should have fields to hold the following information:
● Shift (an integer)
● Hourly pay rate (a double)
The workday is divided into two shifts: day and night. The shift field will be an integer value
representing the shift that the employee works. The day shift is shift 1 and the night shift is
shift 2. Write one or more constructors and the appropriate accessor and mutator methods for
the class. Demonstrate the classes by writing a program that uses a Challenge1_Employee.ProductionWorker object.*/
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
