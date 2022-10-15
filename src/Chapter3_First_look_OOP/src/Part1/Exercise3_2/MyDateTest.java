package Part1.Exercise3_2;

import Part1.Exercise3_2.MyDate;

//Exercise3.02
public class MyDateTest
{
  public static void main(String[] args)
  {
    //creating two Part1.Exercise3_2.MyDate objects
    MyDate date1 = new MyDate();
    MyDate date2 = new MyDate();

    //setting the fields for date1
    date1.setDay(14);
    date1.setMonth(02);
    date1.setYear(2022);

    //setting the fields for date2
    date2.setDay(15);
    date2.setMonth(02);
    date2.setYear(2023);

    //Display the result
    System.out.println("First date: " + date1.displayDate());
    System.out.println("Second date: " + date2.displayDate());

  }
}
