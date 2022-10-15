package Challenge6_Payroll;

import java.util.Scanner;

public class PayrollTest
{
  public static void main(String[] args)
  {
    //getting input from user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.print("Enter your id: ");
    int id = input.nextInt();
    System.out.print("Enter your hourly pay rate: ");
    double hourlyPay = input.nextDouble();
    System.out.print("Enter your total hours: ");
    double totalHours = input.nextDouble();

    //creating a Payroll object
    Payroll employee1 = new Payroll(name,id); //name and id are inputs from the user

    //before gross pay is called we must store the values from the user to the Payroll class fields
    employee1.setHoursWorked(totalHours);
    employee1.setPayRate(hourlyPay);
    System.out.println(employee1.getName() + "(id: " + employee1.getID() + "), your gross pay is: " + employee1.grossPay() + "kr.");

  }
}
