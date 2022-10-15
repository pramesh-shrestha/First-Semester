package session1.Exercise9_2;

import java.util.Scanner;

public class Exercise9_2b
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter start year: ");
    int yearStart = input.nextInt();
    System.out.print("Enter end year: ");
    int yearEnd = input.nextInt();

    int year;
    //initializing accumulator
    int count = 0;

    //creating MyDate object
    MyDate myDate = new MyDate();

    //loop to check all the years in a given period
    for(year = yearStart; year <= yearEnd; year++)
    {
      //storing all year since 1582 til current year in the year field of MyDate class
      myDate.setYear(year);
      //check if the year is leap year, and if it is store it in count accumulator
      if(myDate.isLeapYear())
      {
        count += 1;
      }
    }
    System.out.println("The total number of leapyear in a given period is: " + count);
  }
}
