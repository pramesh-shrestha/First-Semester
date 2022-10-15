package Challenge6_Employee;

public class EmployeeTest
{
  public static void main(String[] args)
  {
    //creating Employee object
    Employee employee1 = new Employee("Pramesh", 605,"IT", "Data Engineer");
    Employee employee2 = new Employee("Suhani",302);
    Employee employee3 = new Employee();
    System.out.println(employee1.getName());
    System.out.println(employee2.getName());
    employee3.setName("Rajiv");
    System.out.println(employee3.getName());
    System.out.println(employee1.getIdNumber());
    System.out.println(employee2.getIdNumber());
    employee3.setIdNumber(420);
    System.out.println(employee3.getIdNumber());
    System.out.println(employee1.getDepartment());
    employee2.setDepartment("Cleaning");
    System.out.println(employee2.getDepartment());
    employee3.setDepartment("Dish Washing");
    System.out.println(employee3.getDepartment());
  }
}
