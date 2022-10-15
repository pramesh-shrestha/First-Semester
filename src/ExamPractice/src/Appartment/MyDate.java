package Appartment;

import DAte.IllegalDateException;

import java.time.LocalDate;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
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

  public void set(int day, int month, int year)
  {
    if(day > 31 || day < 1)
    {
      throw new IllegalDateException("Invalid day");
    }
    else
    {
      this.day = day;
    }
    if(month < 1 || month >12)
    {
      throw new IllegalDateException("Invalid month");
    }
    else
    {
      this.month = month;
    }

    if(year > LocalDate.now().getYear())
    {
      throw new IllegalDateException("Invalid year");
    }
    else
    {
      this.year = year;
    }
  }

  public MyDate copy()
  {
    return new MyDate(day,month,year);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof MyDate))
    {
      return false;
    }
    MyDate other = (MyDate) obj;
    return day == other.day && month == other.month && year == other.year;
  }

  @Override public String toString()
  {
    return "MyDate{" + "day=" + day + ", month=" + month + ", year=" + year
        + '}';
  }

  public static MyDate now()
  {
    LocalDate date = LocalDate.now();
    int currentDay = date.getDayOfMonth();
    int currentMonth = date.getMonthValue();
    int currentYear = date.getYear();
    return new MyDate(currentDay,currentMonth,currentYear);
  }
}
