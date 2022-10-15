package EqualMethod;/*Exercise 3.02 The Part1.Exercise3_2.MyDate class Create a class called Part1.Exercise3_2.MyDate that includes
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

  //creating MyDate constructor
  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
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
  //creating equals method
  public boolean equals(MyDate newDate)
  {
    if(day == newDate.day &&
    month == newDate.month &&
    year == newDate.year)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  //creating MyDate copy method
  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

  //creating MyDate constructor copy
  public MyDate(MyDate myDate)
  {
    day = myDate.day;
    month = myDate.month;
    year = myDate.year;
  }
}
