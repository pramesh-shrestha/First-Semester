package Part1.Exercise3_3;/*
Exercise 3.03 The Part1.Exercise3_3.Payroll class
a)Design and implement a Part1.Exercise3_3.Payroll class that has fields for an employee’s name,
 hourly pay rate, and number of hours worked.
b)Write the appropriate accessor and mutator methods to get and set the fields.
c)The class should also have a method that returns the employee’s gross pay
(hourly pay rate multiplied with the number of hours worked).
d)Write a Part1.Exercise3_3.PayrollTest class that demonstrates class Part1.Exercise3_3.Payroll's capabilities.
Use the Scanner class to let a user enter the employee’s information on their keyboards
*/

public class Payroll
{
  //setting up fields
  private String employeeName;
  private double payPerHour;
  private double hoursWorked;

  //Setting mutators
  public void setEmployeeName(String name) {
    employeeName = name;
  }
  public void setPayPerHour(double perHour) {
    payPerHour = perHour;
  }
  public void setHoursWorked(double totalHours) {
    hoursWorked = totalHours;
  }
  public String getEmployeeName() {
    return employeeName;
  }
  public double getPayPerHour() {
    return payPerHour;
  }
  public double getHoursWorked() {
    return hoursWorked;
  }
  public double grossPay() {
    return payPerHour * hoursWorked;
  }

}
