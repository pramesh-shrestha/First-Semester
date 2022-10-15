package Apartment;

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
  //getmethods
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

  //setmethods
  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  //copy
  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof MyDate))
    {
      return false;
    }
    MyDate other = (MyDate) obj;
    return day == other.day && month == other.month && year == other.year;
  }

  //toString

   public String toString()
  {
    return "MyDate{" + "day=" + day + ", month=" + month + ", year=" + year
        + '}';
  }

  // today() method
  public static MyDate now()
  {
    LocalDate currentDate = LocalDate.now();
    int currentDay = currentDate.getDayOfMonth();
    int currentMonth = currentDate.getMonthValue();
    int currentYear = currentDate.getYear();

    return new MyDate(currentDay,currentMonth,currentYear);
  }
}
