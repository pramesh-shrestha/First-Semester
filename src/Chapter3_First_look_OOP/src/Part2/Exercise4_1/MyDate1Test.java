//Exercise 4.01
package Part2.Exercise4_1;

import Part2.Exercise4_1.MyDate1;

public class MyDate1Test
{
  public static void main(String[] args)
  {
    //Creating two MyDate1 objects and printing two dates
    MyDate1 dateFormat1 = new MyDate1();
    MyDate1 dateFormat2 = new MyDate1(10,15,2023);
    System.out.println(dateFormat1.displayDate());
    System.out.println(dateFormat2.displayDate());

    //Creating two  MyDate1 objects with 3 args constructors and printing dates
    MyDate1 dateFormat3 = new MyDate1(01,01,2024);
    MyDate1 dateFormat4 = new MyDate1(02,02,2025);
    System.out.println(dateFormat3.displayDate());
    System.out.println(dateFormat4.displayDate());

    //Using the objects above and printing dates using the toString method
    System.out.println(dateFormat1);
    System.out.println(dateFormat2);
    System.out.println(dateFormat3);
    System.out.println(dateFormat4);



  }
}
