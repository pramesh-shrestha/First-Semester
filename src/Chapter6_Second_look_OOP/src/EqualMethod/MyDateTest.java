/*Exercise 11.01
Modify your MyDate class so that you:
a) Add an equals method that will return true if the object given as argument has the same
values for day, month and year. The method signature should be:
public boolean equals(MyDate obj)
b) Add a copy method, public MyDate copy(), that will return a new MyDate
object with the same date (day, month and year)
c) Add a copy constructor, public MyDate(MyDate obj), that sets the fields to
the same values as those in the MyDate object given as argument

Then write a test class to test the new constructor and methods. */
package EqualMethod;

public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate myDate = new MyDate(11,2,2022);
    MyDate myDate1 = new MyDate(11,2,2021);
    //checking if both date are same
    System.out.println(myDate.equals(myDate1));

    //copying the date of myDate
    MyDate newDate = myDate.copy();
    System.out.println(newDate.displayDate());

    //copying the constructor
    MyDate myDate3 = new MyDate(myDate);
    System.out.println(myDate3.displayDate());

  }
}
