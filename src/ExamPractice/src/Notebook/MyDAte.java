package Notebook;

public class MyDAte
{

    private int day;
    private int month;
    private int year;

    public MyDAte(int day, int month, int year)
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

    public MyDAte copy()
    {
      return new MyDAte(day,month,year);
    }

  @Override public String toString()
  {
    return "MyDAte{" + "day=" + day + ", month=" + month + ", year=" + year
        + '}';
  }
}
