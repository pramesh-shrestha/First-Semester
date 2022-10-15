package Part1.Exercise3_4;//Challenge_Exercise 1

import Part1.Exercise3_4.Employee;

public class EmployeeTest
{
  public static void main(String[] args)
  {
    //Creating three Part1.Exercise3_4.Employee objects
    Employee info1 = new Employee();
    Employee info2 = new Employee();
    Employee info3 = new Employee();

    //providing arguments to the mutator methods for first employee
    info1.setName("Susan Meyers");
    info1.setIdNumber(47899);
    info1.setDepartment("Accounting");
    info1.setPosition("Vice President");

    //providing arguments to the mutator methods for second employee
    info2.setName("Mark Jones");
    info2.setIdNumber(39119);
    info2.setDepartment("IT");
    info2.setPosition("Programmer");

    //providing arguments to the mutator methods for third employee
    info3.setName("Joy Rogers");
    info3.setIdNumber(81774);
    info3.setDepartment("Manufacturing");
    info3.setPosition("Engineer");

    //assigning the string values of columns
    String name ="Name";
    String id = "ID Number";
    String dep = "Department";
    String pos = "Position";

    //display information left-justified
    System.out.printf("%-16s%-16s%-16s%-16s\n",name,id,dep,pos);
    System.out.printf("%-16s%-16d%-16s%-16s\n", info1.getName(),info1.getIdNumber(),
        info1.getDepartment(), info1.getPosition());
    System.out.printf("%-16s%-16d%-16s%-16s\n", info2.getName(),info2.getIdNumber(),
        info2.getDepartment(), info2.getPosition());
    System.out.printf("%-16s%-16d%-16s%-16s\n", info3.getName(),info3.getIdNumber(),
        info3.getDepartment(), info3.getPosition());

  }
}
