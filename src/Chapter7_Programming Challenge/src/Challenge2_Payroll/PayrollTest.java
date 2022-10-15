package Challenge2_Payroll;

import java.util.Scanner;

public class PayrollTest
{
  public static void main(String[] args)
  {
    int totalEmployees = 7;
    //creating payroll object
    Payroll payroll = new Payroll();
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < totalEmployees; i++)
    {
      //getting hours of all employees
      System.out.println("Enter hours of employee ID " + payroll.getEmployeeID(i) );
      boolean flag = true;
      do
      {
        try
        {
          int hour = input.nextInt();
          payroll.setHours(i, hour); // This is the line that calls the setHours method which consists of if condition, and if it is true it throws exception
          flag = false;
        }
        catch (NegativeNumberException e)
        {
          System.out.println(e.getMessage());
        }
      } while (flag);

      //getting pay rate of all employees
      System.out.println("Enter pay rate of employee ID " + payroll.getEmployeeID(i));
      boolean flag1 = true;
      do
      {
        try
        {
          double rate = input.nextDouble();
          payroll.setPayRate(i, rate); // This is the line that calls the setHours method which consists of if condition, and if it is true it throws exception
          flag1 = false;
        }
        catch (IllegalNumberException e)
        {
          System.out.println(e.getMessage());
        }
      }while(flag1);
    }

    //displaying employee income data
    System.out.println("Employee Id \t\tSalary");
    System.out.println("------------------------");
    for(int i = 0; i < totalEmployees; i++)
    {
      System.out.println(payroll.getEmployeeID(i) + "\t\t" +payroll.wage(i));
    }

    //getting salary details by entering employee id
    System.out.println("Enter employee Id to get salary details");
    boolean flag2 = true;
    do
    {
      try
      {
        int id = input.nextInt();
        System.out.println(payroll.grossPay(id));
        flag2 = false;
      }
      catch (IDMismatchException e)
      {
        System.out.println(e.getMessage()); // This is the line that calls the setHours method which consists of if condition, and if it is true it throws exception
      }
    }while (flag2);
  }
}