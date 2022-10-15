package Part1.Exercise3_3;//Exercise 3.03

import Part1.Exercise3_3.Payroll;

import java.util.Scanner;

public class PayrollTest
{
  public static void main(String[] args)
  {
    //creating Scanner object
    Scanner input = new Scanner(System.in);

    //creating Part1.Exercise3_3.Payroll object
    Payroll employeeInfo = new Payroll();

    //getting input from user
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    employeeInfo.setEmployeeName(name);
    System.out.print("Enter hourly pay rate(kr): ");
    double payRate = input.nextDouble();
    employeeInfo.setPayPerHour(payRate);
    System.out.print("Enter total hours worked: ");
    double totalHours = input.nextDouble();
    employeeInfo.setHoursWorked(totalHours);

    //Calling methods from Part1.Exercise3_3.Payroll class
    System.out.printf("Name entered: %s\n", employeeInfo.getEmployeeName());
    System.out.printf("Hourly pay rate entered: %.2f\n", employeeInfo.getPayPerHour());
    System.out.printf("Total hours entered: %.1f\n", employeeInfo.getHoursWorked());
    System.out.printf("Your gross payment: %.2f", employeeInfo.grossPay());
  }
}
