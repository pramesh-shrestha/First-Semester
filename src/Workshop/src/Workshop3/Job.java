package Workshop3;

public class Job
{
  private String positionName;
  private String companyName;
  private double salary;

  //creating 3 args constructor
  public Job(String positionName, String companyName, double salary)
  {
    this.positionName = positionName;
    this.companyName = companyName;
    this.salary = salary;
  }

  //set methods
  public void setPosition(String positionName)
  {
    this.positionName = positionName;
  }
  public void setCompany(String companyName)
  {
    this.companyName = companyName;
  }
  public void setSalary(double salary)
  {
    this.salary = salary;
  }
  //get methods
  public String getPosition()
  {
    return positionName;
  }
  public String getCompany()
  {
    return companyName;
  }
  public double getSalary()
  {
    return salary;
  }
  //to string method
  public String toString()
  {
    return "Postion: " + positionName + " Company: " + companyName
        + " Salary: " + salary;
  }
  //equals methods
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Job))
    {
      return false;
    }
    Job other = (Job)obj;
    return positionName.equals(other.positionName) &&
        companyName.equals(other.companyName) &&
        salary == other.salary;
  }

  //copy method
  public Job copy()
  {
    return new Job(positionName,companyName,salary);
  }
}
