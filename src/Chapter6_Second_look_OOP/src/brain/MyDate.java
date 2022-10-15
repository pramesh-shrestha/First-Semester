package brain;/*Exercise 3.02 The Part1.Exercise3_2.MyDate class Create a class called Part1.Exercise3_2.MyDate that includes
three pieces of information as fields: A day (int), a month (int), and a year (int).
a)First draw a UML class diagram of the class, and then implement it in Java.
b)Add set and get methods for each field.
c)Add a method displayDate that returns the day, month, and year separated by forward slashes (e.g. 14/2/2022).
d)Write a test program named Part1.Exercise3_2.MyDateTest that demonstrates class Part1.Exercise3_2.MyDate's capabilities,
by creating at least two Part1.Exercise3_2.MyDate objects, setting the fields, and then printing
 out the dates by calling their displayDate methods
 */

import java.time.LocalDate;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  //creating 3 args constructor
  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  //creating copy constructor
  public MyDate(MyDate obj)
  {
    day = obj.day;
    month = obj.month;
    year = obj.year;
  }
  //creating empty constructor
  public MyDate()
  {
    day = 0;
    month = 0;
    year = 0;
  }

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

  public int daysInMonth()
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
    if(day > daysInMonth())
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

  public String getAstroSign()
  {
    if(month == 3)
    {
      if(day >= 1 && day <= 20)
      {
        return "Pisces";
      }
      else
      {
        return "Aries";
      }
    }
    else if(month == 4)
    {
      if(day >= 1 && day <= 19)
      {
        return "Aries";
      }
      else
      {
        return "Taurus";
      }
    }
    else if(month == 5)
    {
      if(day >= 1 && day <= 20)
      {
        return "Taurus";
      }
      else
      {
        return "Gemini";
      }
    }
    else if(month == 6)
    {
      if(day >= 1 && day <= 20)
      {
        return "Gemini";
      }
      else
      {
        return "Cancer";
      }
    }
    else if(month == 7)
    {
      if(day >= 1 && day <= 22)
      {
        return "Cancer";
      }
      else
      {
        return "Leo";
      }
    }
    else if(month == 8)
    {
      if(day >= 1 && day <= 22)
      {
        return "Leo";
      }
      else
      {
        return "Virgo";
      }
    }
    else if(month == 9)
    {
      if(day >= 1 && day <= 22)
      {
        return "Virgo";
      }
      else
      {
        return "Libra";
      }
    }
    else if(month == 10)
    {
      if(day >= 1 && day <= 22)
      {
        return "Libra";
      }
      else
      {
        return "Scorpio";
      }
    }
    else if(month == 11)
    {
      if(day >= 1 && day <= 21)
      {
        return "Scorpio";
      }
      else
      {
        return "Sagittarius";
      }
    }
    else if(month == 12)
    {
      if(day >= 1 && day <= 21)
      {
        return "Sagittarius";
      }
      else
      {
        return "Capricon";
      }
    }
    else if(month == 1)
    {
      if(day >= 1 && day <= 19)
      {
        return "Capricon";
      }
      else
      {
        return "Aquarius";
      }
    }
    else if(month == 2)
    {
      if(day >= 1 && day <= 18)
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
  //days of week method
  public String dayOfWeek()
  {

    double h = (day + (13 * (month + 1) / 5) + ((year-1) % 100) + (((year-1) % 100) / 4) +
          (((year-1) / 100) / 4) + 5 * ((year-1) / 100)) % 7;

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

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "invalid case";
    }
  }

  // today() method
  public static MyDate today()
  {
    LocalDate currentDate = LocalDate.now();
    int currentDay = currentDate.getDayOfMonth();
    int currentMonth = currentDate.getMonthValue();
    int currentYear = currentDate.getYear();

    return new MyDate(currentDay,currentMonth,currentYear);
  }

  //isBefore()method

  public boolean isBefore(MyDate date2)
  {
    if(year < date2.year)
    {
      return true;
    }
    else if(year == date2.year && month < date2.month)
    {
      return true;
    }
    else if(year == date2.year && month == date2.month && day < date2.day)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  //toString() method
  public String toString()
  {
    return "Day: " + day + " Month: " + month + " Year: " + year;
  }

  //copy() method
  public MyDate copy()
  {
    return new MyDate(day, month,year);
  }

  //equals() method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof MyDate))
    {
      return false;
    }
    MyDate other = (MyDate)obj;
    return day == other.day && month == other.month && year == other.year;
  }



}


