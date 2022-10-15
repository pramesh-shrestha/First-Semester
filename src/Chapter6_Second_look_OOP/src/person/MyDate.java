package person;/*Exercise 3.02 The Part1.Exercise3_2.MyDate class Create a class called Part1.Exercise3_2.MyDate that includes
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


