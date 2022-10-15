/*6. Payroll Class
Design a Payroll class that has fields for an employee’s name, ID number, hourly pay rate,
and number of hours worked. Write the appropriate accessor and mutator methods and
a constructor that accepts the employee’s name and ID number as arguments. The class
should also have a method that returns the employee’s gross pay, which is calculated as the
number of hours worked multiplied by the hourly pay rate. Write a program that demonstrates
the class by creating a Payroll object, then asking the user to enter the data for an
employee. The program should display the amount of gross pay earned.*/
package Challenge6_Payroll;

public class Payroll
{
  private String name;
  private int id;
  private double payRate;
  private double hoursWorked;

  //creating two arguments constructors
  public Payroll(String name, int id)
  {
    this.name = name;
    this.id = id;
  }

  //accessor methods to return values stored in fields
  public String getName()
  {
    return name;
  }
  public int getID()
  {
    return id;
  }
  public double getPayRate()
  {
    return payRate;
  }
  public double getHoursWorked()
  {
    return hoursWorked;
  }

  //mutator methods to store fields' values
  public void setName(String name)
  {
    this.name = name;
  }
  public void setId(int id)
  {
    this.id = id;
  }
  public void setPayRate(double payRate)
  {
    this.payRate = payRate;
  }
  public void setHoursWorked(double hoursWorked)
  {
    this.hoursWorked = hoursWorked;
  }

  //creating method that returns employee's gross pay
  public double grossPay()
  {
    return hoursWorked * payRate;
  }

}
