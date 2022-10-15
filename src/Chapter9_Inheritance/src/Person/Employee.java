package Person;

public class Employee extends Person
{
  private double payRate;
  private double hours;

  public Employee(String name, int id, double hours, double payRate)
  {
    super(name, id);
    this.hours = hours;
    this.payRate = payRate;
  }

  public double getPayRate()
  {
    return payRate;
  }

  public void setPayRate(double payRate)
  {
    this.payRate = payRate;
  }

  public double getHours()
  {
    return hours;
  }

  public void setHours(double hours)
  {
    this.hours = hours;
  }

  public String toString()
  {
    return super.toString() + "payRate=" + payRate + ", hours=" + hours;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Employee))
    {
      return false;
    }
    Employee other = (Employee) obj;
    return super.equals(other) && payRate == other.payRate && hours == other.hours;
  }
}
