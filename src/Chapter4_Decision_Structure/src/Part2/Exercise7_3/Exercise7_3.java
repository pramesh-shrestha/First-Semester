/*Exercise 7.03
Add yet another method getAstroSign() to the class MyDate that will return a String with the
name of the astrological sign corresponding to the date.
The 12 astrological signs are:
Aries – March 21 - April 19 (both days included)
Taurus – for April 20 - May 20 (both days included)
Gemini – May 21 - June 20 (both days included)
Cancer – June 21 - July 22 (both days included)
Leo – July 23 - August 22 (both days included)
Virgo – August 23 - September 22 (both days included)
Libra – September 23 - October 22 (both days included)
Scorpio – October 23 - November 21 (both days included)
Sagittarius – November 22 - December 21 (both days included)
Capricorn – December 22 - January 19 (both days included)
Aquarius – January 20 - February 18 (both days included)
Pisces – February 19 - March 20 (both days included) */
package Part2.Exercise7_3;

import java.util.Scanner;

public class Exercise7_3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a month: ");
    String month = input.nextLine();
    System.out.print("Enter a day between 1 and 31: ");
    int day = input.nextInt();

    //creating MyDate object
    MyDate sign = new MyDate();
    //using set methods of MyDate class via MyDate object- sign to set month and day
    sign.setMonth(month);
    sign.setDay(day);
    //now calling the getAstroSign method and printing it
    System.out.println("Your zodiac sign is " + sign.getAstroSign());
  }
}
