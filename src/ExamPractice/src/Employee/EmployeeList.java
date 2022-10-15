package Employee;

import java.util.ArrayList;

public class EmployeeList
{
  private int size;
  private ArrayList<Employee> employees;

  public EmployeeList(int maxNumberOfEmployees)
  {
    size = maxNumberOfEmployees;
    employees = new ArrayList<>();
  }

  public void addEmployee(Employee employee)
  {
    if(employees.size() < size)
    {
      employees.add(employee);
    }
  }

  public void removeEmployee(Employee employee)
  {
    employees.remove(employee);
  }

  public int getNumberOfEmployees()
  {
   return employees.size();
  }

  public Employee[] getAllEmployees()
  {
    Employee[] temp = new Employee[employees.size()];
    return employees.toArray(temp);
  }

  public double getTotalEarningsPerWeek()
  {
    double income = 0;
    ;
    for (int i = 0; i < employees.size(); i++)
    {
      income += employees.get(i).earningsPerWeek();
    }
    return income;
  }
}
