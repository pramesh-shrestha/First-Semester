/*Exercise 7.05
Given a day, month and year, it is possible to calculate which day of the week (Monday, Tuesday,
Wednesday, etc.) that date is. The equation for doing that is slightly complicated, but if you read the
details carefully, and perhaps break it up into smaller parts, then it’s not impossible to calculate. So
add one more method to the MyDate class called dayOfWeek() that returns a String with the name
of the day.
The equation looks like this:
h = (q + (13*(m+1)/5) + k + (k/4) +(j/4) + 5*j) % 7

 q is the day of the month (1 to 31)
 m is the month, but in a special format:
o March=3, April=4, ..., November=11, December=12, January=13, February=14
 k is the year of the century (you can find that as year%100 )
 j is the century (you can find that as integer division of year/100)
 h is the day of the week that we are looking for, but the result will be in a slightly special format:
o 0=Saturday, 1=Sunday, 2=Monday, 3=Tuesday, 4=Wednesday, 5=Thursday, 6=Friday
Note: January and February are actually counted as months 13 and 14 of the previous year. E.g.
February 23, 2022, should be counted as the 23rd day of the 14th month of 2021. So, when the
month is January or February, you will also have to subtract 1 from the year used in the calculation.
Now you can try out this new method in a test class, to find the day of the week for any date in any
year. So, you could e.g. find out which day of the week you were born
*/
package Part2.daysOfWeek;

import java.util.Scanner;

public class Exercise7_5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter day: ");
    int day = input.nextInt();
    System.out.print("Enter month: ");
    String month = input.next();
    System.out.print("Enter year: ");
    int year = input.nextInt();

    //creating one MyDate object
    MyDate myDate = new MyDate();
    //getting day from the user and putting it to the setDay method
    myDate.setDay(day);
    //getting day from the user and putting it to the setMonth method
    myDate.setMonth(month);
    //getting day from the user and putting it to the setYear method
    myDate.setYear(year);

    System.out.println(myDate.dayOfWeek());

  }
}
