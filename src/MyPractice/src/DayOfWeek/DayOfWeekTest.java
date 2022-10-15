package DayOfWeek;

import java.util.Scanner;

public class DayOfWeekTest
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
    MyDate_Alternative myDate = new MyDate_Alternative();
    //getting day from the user and putting it to the setDay method
    myDate.setDay(day);
    //getting day from the user and putting it to the setMonth method
    myDate.setMonth(month);
    //getting day from the user and putting it to the setYear method
    myDate.setYear(year);

    System.out.print("You were born on: " + myDate.dayOfWeek());

  }
}
