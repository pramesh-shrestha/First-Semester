package Challenge1_Employee;

public class EmployeeTest
{
  public static void main(String[] args)
  {
    //creating three ProgrammingChallenge1.Employee objects
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    Employee employee3 = new Employee();

    //storing values in the fields for employee1
    employee1.setName("Susan Meyers");
    employee1.setIdNumber(47899);
    employee1.setDepartment("Accounting");
    employee1.setPosition("Vice President");

    //storing values in the fields for employee2
    employee2.setName("Mark Jones");
    employee2.setIdNumber(39119);
    employee2.setDepartment("IT");
    employee2.setPosition("Programmer");

    //storing values in the fields for employee3
    employee3.setName("Joy Rogers");
    employee3.setIdNumber(81774);
    employee3.setDepartment("Manufacturing");
    employee3.setPosition("Engineer");

    //Assigning values for the headings
    String name = "Name";
    String id = "ID Number";
    String department = "Department";
    String position = "Position";

    //displaying info of all three ProgrammingChallenge1.Employee objects with left justification
    System.out.printf("%-16s%-16s%-16s%-16s\n",name, id, department,position);
    System.out.println("---------------------------------------------------------");
    System.out.printf("%-16s%-16d%-16s%-16s\n",employee1.getName(),
        employee1.getIdNumber(),employee1.getDepartment(),employee1.getPosition());
    System.out.printf("%-16s%-16d%-16s%-16s\n", employee2.getName(),employee2.getIdNumber(),
        employee2.getDepartment(), employee2.getPosition());
    System.out.printf("%-16s%-16d%-16s%-16s\n", employee3.getName(),employee3.getIdNumber(),
        employee3.getDepartment(), employee3.getPosition());
  }
}
