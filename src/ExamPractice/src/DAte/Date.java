package DAte;

import java.time.LocalDate;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    setDay(day);
    setMonth(month);
    setYear(year);
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

  public void setDay(int day) throws IllegalDateException
  {
    if(day > 31 || day < 1)
    {
      throw new IllegalDateException("Invalid day");
    }
    else
    {
      this.day = day;
    }
  }
  public void setMonth(int month)
  {
    if(month > 12 || month < 1)
    {
      throw new IllegalDateException("Invalid month");
    }
    else
    {
      this.month = month;
    }
  }

  public void setYear(int year)
  {
    if(year > LocalDate.now().getYear())
    {
      throw  new IllegalDateException("invalid year");
    }
    else
    {
      this.year = year;
    }
  }

  @Override public String toString()
  {
    return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
  }
}
