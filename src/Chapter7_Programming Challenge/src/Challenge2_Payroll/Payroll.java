/*2. Payroll Class
Write a Payroll class that uses the following arrays as fields:
● employeeId. An array of seven integers to hold employee identification numbers. The
array should be initialized with the following numbers:
5658845 4520125 7895122 8777541
8451277 1302850 7580489
● hours. An array of seven integers to hold the number of hours worked by each
employee
● payRate. An array of seven doubles to hold each employee’s hourly pay rate
● wages. An array of seven doubles to hold each employee’s gross wages
The class should relate the data in each array through the subscripts. For example, the
number in element 0 of the hours array should be the number of hours worked by the
employee whose identification number is stored in element 0 of the employeeId array. That
same employee’s pay rate should be stored in element 0 of the payRate array.
In addition to the appropriate accessor and mutator methods, the class should have a
method that accepts an employee’s identification number as an argument and returns the
gross pay for that employee.
Demonstrate the class in a complete program that displays each employee number and asks
the user to enter that employee’s hours and pay rate. It should then display each employee’s
identification number and gross wages.
Input Validation: Do not accept negative values for hours or numbers less than 6.00 for pay rate.*/
package Challenge2_Payroll;

public class Payroll
{
  private int[] employeeID ={5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
  private int[] hours;
  private double[] payRate;
  private double[] wages;

  //no-arg constructor
  public Payroll()
  {
    hours = new int[7];
    payRate = new double[7];
    wages = new double[7];
  }

  public int getEmployeeID(int index)
  {
    return employeeID[index];
  }

  public void setEmployeeID(int index, int employeeID)
  {
    this.employeeID[index] = employeeID;
  }

  public int getHours(int index)
  {
    return hours[index];
  }

  public void setHours(int index, int hours)
  {
    if (hours < 0)
    {
      throw new NegativeNumberException("Negative hours are not allowed");
    }
    this.hours[index] = hours;
  }

  public double getPayRate(int index)
  {
    return payRate[index];
  }

  public void setPayRate(int index, double payRate)
  {
    if(payRate < 6)
    {
      throw new IllegalNumberException("Rate must be above €6");
    }
    this.payRate[index] = payRate;
  }

  public double getWages(int index)
  {
    return wages[index];
  }

  public void setWages(int index, double wages)
  {
    this.wages[index] = wages;
  }

  //grossPay
  public String grossPay(int id)
  {
    if(id != 5658845 && id != 4520125 && id != 7895122 && id != 8777541 && id != 8451277
    && id != 1302850 && id != 7580489)
    {
      throw new IDMismatchException("This ID does not exist, enter correct ID"); //this line executes when if condition above is true
    }
    for(int i = 0; i < employeeID.length; i++)
    {
      if(employeeID[i] == id)
      {
        return "Employee ID: " + employeeID[i] +
            " Hours: " + hours[i] +
            " Pay rate: " + payRate[i] +
            " Wages: " + wage(i);
      }
    }
    return "ID does not match";
  }
  //calculating wages
  public double wage(int i)
  {
    return hours[i] * payRate[i];
  }
}
