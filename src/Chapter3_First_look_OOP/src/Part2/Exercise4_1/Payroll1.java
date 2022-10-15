/*Exercise 4.01
For each of the three classes (Person, MyDate and Payroll) that you created in the
exercises from our last session (Exercise 3.01, 3.02 and 3.03) do the following:
a) Create a constructor with the necessary parameters to initialize the instance
fields in the classes.
b) Create a no-argument constructor to initialize the instance fields to default
values of your choice.
c) Create a toString() method, returning a meaningful representation of objects
from the class.
d) Add the constructors and new methods to your UML class diagrams
e) Add the necessary changes to your existing test classes, to test the new
functionality.
*/
package Part2.Exercise4_1;

public class Payroll1
{
  private String employeeName;
  private double hourlyPay;
  private double hoursWorked;

  public Payroll1() {
    employeeName = "John";
    hourlyPay = 150;
    hoursWorked = 10;
  }
  public Payroll1(String name, double hourlyPay, double hoursWorked) {
    employeeName = name;
    this.hourlyPay = hourlyPay;
    this.hoursWorked = hoursWorked;
  }
  public void setEmployeeName(String name){
    employeeName = name;
  }
  public void setHourlyPay(double hourlyPay) {
    this.hourlyPay = hourlyPay;
  }
  public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
  }
  public String getEmployeeName() {
    return employeeName;
  }
  public double getHourlyPay() {
    return hourlyPay;
  }
  public double getHoursWorked() {
    return hoursWorked;
  }
  public double grossPay() {
    return hourlyPay * hoursWorked;
  }

 public String toString() {
    //converting the double return of grossPay method to String value
    return String.valueOf(grossPay());
  }
}
