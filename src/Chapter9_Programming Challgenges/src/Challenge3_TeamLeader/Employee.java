package Challenge3_TeamLeader;

/*In a particular factory, a team leader is an hourly paid production worker who leads a small
team. In addition to hourly pay, team leaders earn a fixed monthly bonus. Team leaders are
required to attend a minimum number of hours of training per year. Design a TeamLeader
class that inherits from the ProductionWorker class you designed in Programming Challenge
1. The TeamLeader class should have fields for the monthly bonus amount, the required number
of training hours, and the number of training hours that the team leader has attended.
Write one or more constructors and the appropriate accessor and mutator methods for the
class. Demonstrate the class by writing a program that uses a TeamLeader object.*/
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
