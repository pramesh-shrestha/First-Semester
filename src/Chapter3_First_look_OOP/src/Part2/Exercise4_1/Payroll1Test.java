//Exercise 4.01
package Part2.Exercise4_1;

import Part2.Exercise4_1.Payroll1;

import java.util.Scanner;

public class Payroll1Test
{
  public static void main(String[] args)
  {
    //Creating Scanner object
    Scanner input = new Scanner(System.in);

    //Getting input
    System.out.print("Enter name: ");
    String name = input.nextLine();
    System.out.print("Enter hourly pay: ");
    double payRate = input.nextDouble();
    System.out.print("Enter total hours: ");
    double totalHours = input.nextDouble();

    //printing gross payment using no-args constructor
    //Creating Payroll1 object
    Payroll1 payment1 = new Payroll1();
    System.out.println(payment1.grossPay());

    //printing gross payment using 3 args constructor
    //Creating Payroll1 object
    Payroll1 payment2 = new Payroll1(name, payRate, totalHours);
    System.out.println(payment2.grossPay());

    //printing gross payment using toString method for payment1 object
    System.out.println(payment1);

    //printing gross payment using toString method for payment2 object
    System.out.println(payment2);


  }
}
