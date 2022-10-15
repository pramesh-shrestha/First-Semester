package Person;

public class ExchangeStudent extends Student
{
  private int projectGrp;

  public ExchangeStudent(String name, int id, char grade, int projectGrp)
  {
    super(name, id, grade);
    this.projectGrp = projectGrp;
  }

  public int getProjectGrp()
  {
    return projectGrp;
  }

  public void setProjectGrp(int projectGrp)
  {
    this.projectGrp = projectGrp;
  }
  //toString
  public String toString()
  {
    return super.toString() + "Project groupe: " + projectGrp;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof ExchangeStudent))
    {
      return false;
    }
    ExchangeStudent other = (ExchangeStudent) obj;
    return super.equals(other) && projectGrp == other.projectGrp;
  }
}
