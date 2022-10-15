/*Exercise 09.02
Our current concept of leap years was started in 1582 when the Gregorian calendar was
introduced. From previous exercises you should have a MyDate class with an
isLeapYear() method. Use that for the following:
a) Create a program with a main method that uses a for-loop and a MyDate object
to calculate how many leap years there have been since 1582, and then prints out
the result. Hint: set the MyDate object to all the years, and check which ones are
leap years.
b) Modify the program by adding a Scanner object, allowing the user to input a
start year and an end year. Then the program should calculate the number of leap
years within that range.*/
package session1.Exercise9_2;

public class Exercise9_2a
{
  public static void main(String[] args)
  {
    //creating MyDate object
    MyDate myDate = new MyDate();
    //initializing accumulator count
    int count = 0;
    int year;
    for(year = 1582; year <= 2022; year++)
    {
      //storing all year since 1582 til current year in the year field of MyDate class
      myDate.setYear(year);
      //check if the year is leap year, and if it is store it in count accumulator
      if(myDate.isLeapYear())
      {
        count += 1;
      }
    }
    System.out.println("Total leap year since 1582: " + count);
  }
}
