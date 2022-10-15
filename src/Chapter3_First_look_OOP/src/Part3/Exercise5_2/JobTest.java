package Part3.Exercise5_2;

import java.util.Scanner;

public class JobTest
{
  public static void main(String[] args)
  {
    //creating first Person object for employee 1
    Person person1 = new Person("Pramesh", "1112195");
    //creating first Job object for employee 1
    Job employee1 = new Job("Developer",20000,person1); // --> instead of using person object, we could directly write new Person("Pramesh","11121996")

    //displaying name and birthday of the employee1 using the Person class
    System.out.println("Name of employee 1: " + person1.getName());
    System.out.println("Birthday of employee 1: " + person1.getBirthday());

    //displaying salary after raise for employee1
    employee1.givePercentageRaise(20);
    System.out.println("Salary raise of employee1: " + employee1.getSalary());
    System.out.println();


    //creating second Job object for second employee
    Job employee2 = new Job("Professor", 22000);

    //displaying name and birthday of the employee2 using the Person class
    Scanner input = new Scanner(System.in);
    System.out.print("Enter name for employee2: ");

    //Creating second Person object for second employee
    Person person2 = new Person(input.nextLine(), "21324565");
    employee2.setEmployee(person2);
    System.out.println("Name of employee 1: " + person2.getName());
    System.out.println("Birthday of employee 1: " + person2.getBirthday());

    //displaying salary after raise for employee2
    employee2.givePercentageRaise(10);
    System.out.println("Salary raise of employee1: " + employee2.getSalary());
  }
}
