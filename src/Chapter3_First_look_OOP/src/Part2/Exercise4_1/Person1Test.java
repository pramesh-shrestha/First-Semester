//Exercise 4.01

package Part2.Exercise4_1;

import Part2.Exercise4_1.Person1;

public class Person1Test
{
  public static void main(String[] args)
  {
    //Solution a
    //Creating two Person1 objects with two arguments
    Person1 detail1 = new Person1("Rajip","Saturday");
    Person1 detail2 = new Person1("Suhani", "Tuesday");
    System.out.println(detail1.getName());
    System.out.println(detail1.getBirthday());
    System.out.println(detail2.getName());
    System.out.println(detail2.getBirthday());

    //Solution b
    Person1 detail3 = new Person1();
    Person1 detail4 = new Person1("Pramesh", "Sunday");
    System.out.println(detail3.getName());
    System.out.println(detail3.getBirthday());
    System.out.println(detail4.getName());
    System.out.println(detail4.getBirthday());

    // Solution c Using toString
    System.out.println(detail3);
    System.out.println(detail4);


  }
}


