package Employee;

public abstract class Employee
{
  private String name;
  private Date birthday;

  public Employee(String name, Date birthday)
  {
    this.name= name;
    this.birthday = birthday.copy();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Date getBirthday()
  {
    return birthday.copy();
  }

  @Override public String toString()
  {
    return "Employee{" + "name='" + name + '\'' + ", birthday=" + birthday
        + '}';
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Employee))
    {
      return false;
    }
    Employee other = (Employee) obj;
    return name.equals(other.name) && birthday.equals(other.birthday);
  }

  public abstract double earningsPerWeek();
}
