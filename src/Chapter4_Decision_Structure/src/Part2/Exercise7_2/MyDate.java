package Part2.Exercise7_2;/*Exercise 3.02 The Part1.Exercise3_2.MyDate class Create a class called Part1.Exercise3_2.MyDate that includes
three pieces of information as fields: A day (int), a month (int), and a year (int).
a)First draw a UML class diagram of the class, and then implement it in Java.
b)Add set and get methods for each field.
c)Add a method displayDate that returns the day, month, and year separated by forward slashes (e.g. 14/2/2022).
d)Write a test program named Part1.Exercise3_2.MyDateTest that demonstrates class Part1.Exercise3_2.MyDate's capabilities,
by creating at least two Part1.Exercise3_2.MyDate objects, setting the fields, and then printing
 out the dates by calling their displayDate methods
 */

public class MyDate
{
  private int day;
  private String month;
  private int year;

  public void setDay(int newDay) {
    day = newDay;
  }
  public void setMonth(String newMonth) {
    month = newMonth;
  }
  public void setYear(int newYear) {
    year = newYear;
  }
  public int getDay(){
    return day;
  }
  public String getMonth() {
    return month;
  }
  public int getYear() {
    return year;
  }
  public String displayDate()
  {
    return getDay() + "/" + getMonth() + "/" + getYear();
  }

  //Creating a isLeapYear() method that returns true or false
  public boolean isLeapYear()
  {
    //declaring local variable
    boolean leapYear;
    if(year % 4 == 0 && year % 100 != 0 && year % 400 != 0)
    {
      leapYear = true;
    }
    else
    {
      leapYear = false;
    }
    return leapYear;
  }

  public String daysInMonth()
  {

    if(month.equals("January") || month.equals("january"))
    {
      month = "31";
    }
    else if(month.equals("February") || month.equals("february"))
    {
      if (isLeapYear())
      {
        month = "29";
      }
      else
      {
        month = "28";
      }
    }
    else if (month.equals("March") || month.equals("march"))
    {
      month = "31";
    }
    else if (month.equals("April") || month.equals("april"))
    {
      month = "30";
    }
    else if (month.equals("May") || month.equals("may"))
    {
      month = "31";
    }
    else if (month.equals("June") || month.equals("june"))
    {
      month = "30";
    }
    else if (month.equals("July") || month.equals("july"))
    {
      month = "31";
    }
    else if (month.equals("August") || month.equals("august"))
    {
      month = "31";
    }
    else if (month.equals("September") || month.equals("september"))
    {
      month = "30";
    }
    else if (month.equals("October") || month.equals("october"))
    {
      month = "31";
    }
    else if (month.equals("November") || month.equals("november"))
    {
      month = "30";
    }
    else if (month.equals("December") || month.equals("december"))
    {
      month = "31";
    }
      return month;

  }
}
