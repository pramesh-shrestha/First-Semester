/*Exercise 09.03
Add another method to your MyDate class called nextDay(). The method should
change the date to one day later than the current date. Then in your test class create a
MyDate object with the date of your birthday, and use a loop and the nextDay()
method to find out how many days it has been since you were born.*/
package session1.nextDay;

import java.util.Scanner;

public class Exercise9_3
{
  public static void main(String[] args)
  {
    //creating MyDate object
    MyDate myDate = new MyDate();

    //getting input from user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter birth year: ");
    myDate.setYear(input.nextInt()); //storing user input into year field of MyDate class
    System.out.print("Enter birth month: ");
    myDate.setMonth(input.nextInt()); //storing user input into month field of MyDate class
    System.out.print("Enter birth day: ");
    myDate.setDay(input.nextInt()); //storing user input into day field of MyDate class

    System.out.print("Enter year you want to compare with:");
    int year_com = input.nextInt();
    System.out.print("Enter month you want to compare with: ");
    int month_com = input.nextInt();
    System.out.print("Enter day you want to compare with: ");
    int day_com = input.nextInt();

    int count = 0;
    while(myDate.getDay() != day_com || myDate.getMonth() != month_com || myDate.getYear() != year_com)
    {
      myDate.nextDay();
      count++;
    }
    System.out.println("You have already live " + count + " days. Totally wasted.");

  }
}
