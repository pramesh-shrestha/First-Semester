package Employee;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
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

  public Date copy()
  {
    return new Date(day,month,year);
  }

  @Override public String toString()
  {
    return "MyDate{" + "day=" + day + ", month=" + month + ", year=" + year
        + '}';
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Date))
    {
      return false;
    }
    Date other = (Date) obj;
    return day == other.day && month == other.month && year == other.month;
  }

}
