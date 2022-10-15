/*Exercise 6.05
MyDate class revisited:
We have a leap year when the year can be divided by 4 (1996, 2008, 2012, etc.), except
for the years that can also be divided by 100, unless they can also be divided by 400 (i.e.
1600, 2000 and 2400 are leap years, while 1800, 1900, and 2100 are not).
Extend the MyDate class that you made in an earlier exercise with a new method called
isLeapYear(), that will return true if the year stored is a leap year, and false if it
is not. Hint: the following boolean expression will be true if year is dividable by four:
year%4==0
*/

package Part1.Exercise6_5;

import java.util.Scanner;

public class Exercise6_5
{
  public static void main(String[] args)
  {
    MyDate date = new MyDate();
    Scanner input = new Scanner(System.in);

    //Getting year from the user
    System.out.print("Enter year: ");
    date.setYear(input.nextInt());

    //Printing out true for leap year and false otherwise
    System.out.println(date.isLeapYear());
  }
}
