package Part2.daysOfWeek;/*Exercise 3.02 The Part1.Exercise3_2.MyDate class Create a class called Part1.Exercise3_2.MyDate that includes
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

  public void setDay(int newDay)
  {
    day = newDay;
  }

  public void setMonth(String newMonth)
  {
    month = newMonth;
  }

  public void setYear(int newYear)
  {
    year = newYear;
  }

  public int getDay()
  {
    return day;
  }

  public String getMonth()
  {
    return month;
  }

  public int getYear()
  {
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
    if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0)
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

    if (month.equals("January") || month.equals("january"))
    {
      month = "31";
    }
    else if (month.equals("February") || month.equals("february"))
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

  public String getAstroSign()
  {
    if (month.equals("March"))
    {
      if (day >= 1 && day <= 20)
      {
        return "Pisces";
      }
      else
      {
        return "Aries";
      }
    }
    else if (month.equals("April"))
    {
      if (day >= 1 && day <= 19)
      {
        return "Aries";
      }
      else
      {
        return "Taurus";
      }
    }
    else if (month.equals("May"))
    {
      if (day >= 1 && day <= 20)
      {
        return "Taurus";
      }
      else
      {
        return "Gemini";
      }
    }
    else if (month.equals("June"))
    {
      if (day >= 1 && day <= 20)
      {
        return "Gemini";
      }
      else
      {
        return "Cancer";
      }
    }
    else if (month.equals("July"))
    {
      if (day >= 1 && day <= 22)
      {
        return "Cancer";
      }
      else
      {
        return "Leo";
      }
    }
    else if (month.equals("August"))
    {
      if (day >= 1 && day <= 22)
      {
        return "Leo";
      }
      else
      {
        return "Virgo";
      }
    }
    else if (month.equals("September"))
    {
      if (day >= 1 && day <= 22)
      {
        return "Virgo";
      }
      else
      {
        return "Libra";
      }
    }
    else if (month.equals("October"))
    {
      if (day >= 1 && day <= 22)
      {
        return "Libra";
      }
      else
      {
        return "Scorpio";
      }
    }
    else if (month.equals("November"))
    {
      if (day >= 1 && day <= 21)
      {
        return "Scorpio";
      }
      else
      {
        return "Sagittarius";
      }
    }
    else if (month.equals("December"))
    {
      if (day >= 1 && day <= 21)
      {
        return "Sagittarius";
      }
      else
      {
        return "Capricon";
      }
    }
    else if (month.equals("January"))
    {
      if (day >= 1 && day <= 19)
      {
        return "Capricon";
      }
      else
      {
        return "Aquarius";
      }
    }
    else if (month.equals("February"))
    {
      if (day >= 1 && day <= 18)
      {
        return "Aquarius";
      }
      else
      {
        return "Pisces";
      }
    }
    else
      return "Invalid data";
  }

  public String dayOfWeek()
  {
    int h = 0;
    int newMonth;
    if (month.equalsIgnoreCase("March"))
    {
      newMonth = 3;
      h = (day + (13 * (newMonth + 1) / 5) + (year % 100) + ((year % 100) / 4) +
          ((year / 100) / 4) + 5 * (year / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("April"))
    {
      newMonth = 4;
      h = (day + (13 * (newMonth + 1) / 5) + (year % 100) + ((year % 100) / 4) +
          ((year / 100) / 4) + 5 * (year / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("May"))
    {
      newMonth = 5;
      h = (day + (13 * (newMonth + 1) / 5) + (year % 100) + ((year % 100) / 4) +
          ((year / 100) / 4) + 5 * (year / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("June"))
    {
      newMonth = 6;
      h = (day + (13 * (newMonth + 1) / 5) + (year % 100) + ((year % 100) / 4) +
          ((year / 100) / 4) + 5 * (year / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("July"))
    {
      newMonth = 7;
      h = (day + (13 * (newMonth + 1) / 5) + (year % 100) + ((year % 100) / 4) +
          ((year / 100) / 4) + 5 * (year / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("August"))
    {
      newMonth = 8;
      h = (day + (13 * (newMonth + 1) / 5) + (year % 100) + ((year % 100) / 4) +
          ((year / 100) / 4) + 5 * (year / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("September"))
    {
      newMonth = 9;
      h = (day + (13 * (newMonth + 1) / 5) + (year % 100) + ((year % 100) / 4) +
          ((year / 100) / 4) + 5 * (year / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("October"))
    {
      newMonth = 10;
      h = (day + (13 * (newMonth + 1) / 5) + (year % 100) + ((year % 100) / 4) +
          ((year / 100) / 4) + 5 * (year / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("November"))
    {
      newMonth = 11;
      h = (day + (13 * (newMonth + 1) / 5) + (year % 100) + ((year % 100) / 4) +
          ((year / 100) / 4) + 5 * (year / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("December"))
    {
      newMonth = 12;
      h = (day + (13 * (newMonth + 1) / 5) + (year % 100) + ((year % 100) / 4) +
          ((year / 100) / 4) + 5 * (year / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("January"))
    {
      newMonth = 13;
      h = (day + (13 * (newMonth + 1) / 5) + ((year-1) % 100) + (((year-1) % 100) / 4) +
          (((year-1) / 100) / 4) + 5 * ((year-1) / 100)) % 7;
    }
    else if (month.equalsIgnoreCase("February"))
    {
      newMonth = 14;
      h = (day + (13 * (newMonth + 1) / 5) + ((year-1) % 100) + (((year-1) % 100) / 4) +
          (((year-1) / 100) / 4) + 5 * ((year-1) / 100)) % 7;
    }
      if(h == 0)
      {
        return "Saturday";
      }
      else if(h == 1)
      {
        return "Sunday";
      }
      else if(h == 2)
      {
        return "Monday";
      }
      else if(h == 3)
      {
        return "Tuesday";
      }
      else if(h == 4)
      {
        return "Wednesday";
      }
      else if(h == 5)
      {
        return "Thursday";
      }
      else if(h == 6)
      {
        return "Friday";
      }
    else
      {
        return "invalid input";
      }

  }
}

