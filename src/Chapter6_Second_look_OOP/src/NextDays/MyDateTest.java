/*Add a new method nextDays(int days) to your MyDate class. The method is similar
to the nextDay() method you have made previously, but instead of only increasing the date
by one day, it should increase the date by the number of days given as argument. */
package NextDays;

import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter day: ");
    int day = input.nextInt();
    System.out.print("Enter month: ");
    int month = input.nextInt();
    System.out.print("Enter year: ");
    int year = input.nextInt();

    System.out.print("Enter number of days you want to increase: ");
    int numberOfDays = input.nextInt();

    //creating MyDate object
    MyDate myDate = new MyDate(day, month, year);

    //calling the nextDay method
    myDate.nextDay(numberOfDays);
    //displaying the output
    System.out.println(myDate.displayDate());
  }
}
