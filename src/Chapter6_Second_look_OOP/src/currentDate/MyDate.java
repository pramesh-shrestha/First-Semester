package currentDate;/*Exercise 3.02 The Part1.Exercise3_2.MyDate class Create a class called Part1.Exercise3_2.MyDate that includes
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
  //creating no arg constructor
  public MyDate()
  {
    LocalDate currentDate = LocalDate.now();
    day = currentDate.getDayOfMonth();
    month = currentDate.getMonthValue();
    year = currentDate.getYear();
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
  public static MyDate today()
{
  LocalDate currentDate = LocalDate.now();
  int currentDay = currentDate.getDayOfMonth();
  int currentMonth = currentDate.getMonthValue();
  int currentYear = currentDate.getYear();

  return new MyDate(currentDay,currentMonth,currentYear);
}

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
}
