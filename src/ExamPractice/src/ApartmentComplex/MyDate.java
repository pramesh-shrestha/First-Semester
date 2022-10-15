package ApartmentComplex;

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
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate copy()
  {
    return new MyDate(day,month,year);
  }

  public static MyDate now()
  {
    LocalDate now = LocalDate.now();
    int currentDay = now.getDayOfMonth();
    int currentMonth = now.getMonthValue();
    int currentYear = now.getYear();

    return new MyDate(currentDay,currentMonth,currentYear);
  }

  @Override public String toString()
  {
    return "MyDate{" + "day=" + day + ", month=" + month + ", year=" + year
        + '}';
  }
}

