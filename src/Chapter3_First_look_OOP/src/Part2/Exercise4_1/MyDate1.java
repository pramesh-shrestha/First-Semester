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

public class MyDate1
{
  private int day;
  private int month;
  private int year;

  //Creating no-args constructor
  public MyDate1()
  {
    day = 10;
    month = 12;
    year = 2022;
  }
    //Creating 3 args constructor
    public MyDate1(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
    }

    //Creating setMethod
    public void setDay(int day) {
      this.day = day;
    }
    public void setMonth(int month) {
      this.month = month;
    }
    public void setYear(int year) {
      this.year= year;
    }

    //Creating getMethod
    public int  getDay() {
      return day;
    }
    public int getMonth() {
      return month;
    }
    public int getYear(){
      return year;
    }
    public String displayDate() {
      return getDay() + "/" + getMonth() + "/" + getYear();
    }

    //Creating toString method
    public String toString() {
      return day + "/" + month + "/" + year;
    }
}
