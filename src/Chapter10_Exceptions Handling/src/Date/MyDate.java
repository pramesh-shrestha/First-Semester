package Date;//Create a class called Date.MyDate that includes three pieces of information as fields:
// A day (int), a month (int), and a year (int). a)First draw a UML class diagram of
// the class, and then implement it in Java. b)Add set and get methods for each field.
// c)Add a method displayDate that returns the day, month, and year separated by
// forward slashes (e.g. 14/2/2022). d)Write a test program named MyDateTest that
// demonstrates class Date.MyDate's capabilities, by creating at least two Date.MyDate objects,
// setting the fields, and then printing out the dates by calling their displayDate methods.

public class MyDate
{
  private int day;
  private int month;
  private int year;


  // Change the set methods so they will throw an IllegalDateException if the resulting
  //date would be an invalid date.
  public void setDay(int day)
  {
    if(day > daysInMonth() || day < daysInMonth())
    {
      throw new IllegalDateException("Invalid day");
    }
    this.day = day;
  }

  public void setMonth(int month)
  {
    if(month > 12 || month < 1)
    {
      throw new IllegalDateException("Invalid month");
    }
    this.month = month;
  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public int daysInMonth()
  {
    int numberDays = 0;
    if (month == 1)
    {
      numberDays = 31;
    }
    else if (month == 2)
    {
      if (isLeapYear() == true)
      {
        numberDays = 29;
      }
      else
      {
        numberDays = 28;
      }
    }
    else if (month == 3)
    {
      numberDays = 31;
    }
    else if (month == 4)
    {
      numberDays = 30;
    }
    else if (month == 5)
    {
      numberDays = 31;
    }
    else if (month == 6)
    {
      numberDays = 30;
    }
    else if (month == 7)
    {
      numberDays = 31;
    }
    else if (month == 8)
    {
      numberDays = 30;
    }
    else if (month == 9)
    {
      numberDays = 31;
    }
    else if (month == 10)
    {
      numberDays = 30;
    }
    else if (month == 11)
    {
      numberDays = 31;
    }
    else if (month == 12)
    {
      numberDays = 31;
    }

    return numberDays;
  }

  public boolean isLeapYear()
  {
    if (year % 4 == 0 && !((year % 100) == 0) && !((year % 100) == 0))
    {
      return true;
    }
    return false;
  }

  public String displayDate()
  {
    return getDay() + "/" + getMonth() + "/" + getYear();
  }

}

