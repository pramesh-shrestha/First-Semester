/*Exercise 11.03
Add a static method named today() to your MyDate class. The method should return a
MyDate object that is always set to the current date.
To find out what date it is today you can use Java’s built-in LocalDate class.
So, first import that class:
import java.time.LocalDate;

Then you can get the current day, month, and year like this:
LocalDate currentDate = LocalDate.now();
int currentDay = currentDate.getDayOfMonth();
int currentMonth = currentDate.getMonthValue();
int currentYear = currentDate.getYear();
When you are finished, then also modify the no-argument constructor in the MyDate class, so
it always sets the date to the current date. */
package currentDate;

public class MyDateTest
{
  public static void main(String[] args)
  {
    System.out.println(MyDate.today().displayDate());

    //printing no args constructor
    MyDate date3 = new MyDate();
    System.out.println(date3.displayDate());
  }
}
