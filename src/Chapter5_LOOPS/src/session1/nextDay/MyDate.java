package session1.nextDay;/*Exercise 3.02 The Part1.Exercise3_2.MyDate class Create a class called Part1.Exercise3_2.MyDate that includes
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
  private int month;
  private int year;

  public void setDay(int newDay) {
    day = newDay;
  }
  public void setMonth(int newMonth) {
    month = newMonth;
  }
  public void setYear(int newYear) {
    year = newYear;
  }
  public int getDay(){
    return day;
  }
  public int getMonth() {
    return month;
  }
  public int getYear() {
    return year;
  }
  public String displayDate() {
    return getDay() + "/" + getMonth() + "/" + getYear();
  }

  //Creating a isLeapYear() method that returns true or false
  public boolean isLeapYear()
  {
    if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public int totalDays()
  {
    if(month == 1)
    {
      return 31;
    }
    else if(month == 2)
    {
      if(isLeapYear())
      {
        return 29;
      }
      else
      {
        return 28;
      }
    }
    else if(month == 3)
    {
      return 31;
    }
    else if(month == 4)
    {
      return 30;
    }
    else if(month == 5)
    {
      return 31;
    }
    else if(month == 6)
    {
      return 30;
    }
    else if(month == 7)
    {
      return 31;
    }
    else if(month == 8)
    {
      return 31;
    }
    else if(month == 9)
    {
      return 30;
    }
    else if(month == 10)
    {
      return 31;
    }
    else if(month == 11)
    {
      return 30;
    }
    else if(month == 12)
    {
      return 31;
    }
    else
    {
      return -1;
    }
  }
  //creating nextDay() method
  public void nextDay()
  {
    day = day + 1;
    if(day > totalDays())
    {
      month += 1;
      day = 1;
      if(month > 12)
      {
        year += 1;
        month = 1;
      }
    }

  }
}
