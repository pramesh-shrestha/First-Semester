package Date;

import java.util.Scanner;

public class IllegalDateTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a day");
    int day = input.nextInt();

    System.out.println("Enter a month");
    int month = input.nextInt();

    System.out.println("Enter a year");
    int year = input.nextInt();

    MyDate date = new MyDate();
    try
    {
      date.setMonth(month);
      date.setDay(day);
    }
    catch (IllegalDateException e)
    {
      System.out.println(e.getMessage());

    }
  }
}
