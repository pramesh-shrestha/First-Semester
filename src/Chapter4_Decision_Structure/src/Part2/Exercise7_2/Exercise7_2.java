/*Exercise 7.02
Further modify your MyDate class from the last session by adding a method daysInMonth() that
returns the number of days in the month (e.g. for January it should return 31).
Remember: If year is a leap year February has 29 days (unlike the usual 28 days), so you can use the
isLeapYear() method you made previously to calculate the number of days properly. */

package Part2.Exercise7_2;

import java.util.Scanner;

public class Exercise7_2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a month: "); //getting month
    String month = input.nextLine();
    System.out.print("Enter a year: "); //getting year
    int year  = input.nextInt();

    //creating MyDate object
    MyDate date = new MyDate();
    date.setMonth(month);
    date.setYear(year);
    System.out.println(month + " has " + date.daysInMonth() + " days.");
  }
}
