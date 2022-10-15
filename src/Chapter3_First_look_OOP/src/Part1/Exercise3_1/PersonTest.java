package Part1.Exercise3_1;//Exercise 3.01

import java.util.Scanner;

public class PersonTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Person detail1 = new Person();
    Person detail2 = new Person();

    System.out.print("Enter the name of first person: ");
    String person1 = input.nextLine();
    detail1.setName(person1);
    System.out.print("Enter birthday of first person: ");
    String birthday1 = input.nextLine();
    detail1.setBirthday(birthday1);
    System.out.print("Enter the name of second person: ");
    String person2 = input.nextLine();
    detail2.setName(person2);
    System.out.print("Enter birthday of first person: ");
    String birthday2 = input.nextLine();
    detail2.setBirthday(birthday2);

    System.out.printf("The name of the first person is %s, and the"+
        " birthday is %s.\nThe name of the second person is %s, and" +
        " the birthday is %s.", detail1.getName(),detail1.getBirthday(),
        detail2.getName(), detail2.getBirthday());


  }
}
