/*2. Time Calculator
Write a program that asks the user to enter a number of seconds.
● There are 60 seconds in a minute. If the number of seconds entered by the user is
greater than or equal to 60, the program should display the number of minutes in that
many seconds.
● There are 3,600 seconds in an hour. If the number of seconds entered by the user is
greater than or equal to 3,600, the program should display the number of hours in
that many seconds.
● There are 86,400 seconds in a day. If the number of seconds entered by the user is
greater than or equal to 86,400, the program should display the number of days in
that many seconds.*/
package Challenge2_TimeCalculator;

import java.util.Scanner;

public class TimeCalculator
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of seconds: ");
    int seconds = input.nextInt();
    int minutes = 0;
    int hours = 0;
    int days = 0;

    if(seconds >= 60 && seconds < 3600)
    {
      minutes = seconds/60;
      seconds %= 60;
      System.out.println(minutes + " minutes" + " and " + seconds + " seconds");
    }
    else if(seconds >= 3600 && seconds < 86400)
    {
      hours = seconds/3600;
      seconds %= 3600;
      minutes = seconds/60;
      seconds %= 60;
      System.out.println(hours + " hours " + minutes + " minutes" + " and " + seconds + " seconds");
    }
    else
    {
      days = seconds/86400;
      seconds %= 86400;
      hours = seconds/3600;
      seconds %= 3600;
      minutes = seconds/60;
      seconds %= 60;
      System.out.println(days + " days " + hours + " hours " + minutes + " minutes" + " and " + seconds + " seconds");
    }
  }
}
