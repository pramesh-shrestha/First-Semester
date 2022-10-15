/*Exercise 8.02
Add a method getMonthName() to the MyDate class, that uses a switch statement to
return the name of the current month (1 = January, 2 = February, etc.). */
package Part3.Exercise8_2;

import java.util.Scanner;

public class Exercise8_2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any number in a range of 1 and 12: ");
    int number = input.nextInt();

    MyDate date = new MyDate();
    date.setMonth(number);
    System.out.println(date.getMonthName());
  }
}
