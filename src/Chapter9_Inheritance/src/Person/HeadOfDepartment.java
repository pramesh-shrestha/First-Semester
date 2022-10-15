package Person;

public class HeadOfDepartment extends Employee
{
  private String department;

  public HeadOfDepartment(String name, int id, double hours, double rate, String department)
  {
    super(name,id,hours,rate);
    this.department = department;
  }

  public String getDepartment()
  {
    return department;
  }

  public void setDepartment(String department)
  {
    this.department = department;
  }

  //toString
  public String toString()
  {
    return super.toString() + "Department: " + department;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof HeadOfDepartment))
    {
      return false;
    }
    HeadOfDepartment other = (HeadOfDepartment) obj;
    return super.equals(other) && department.equals(other.department);
  }
}
