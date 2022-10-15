package Person;

public class ITSupport extends Employee
{
  String workArea;

  public ITSupport(String name, int id, int hours, double rate, String workArea)
  {
    super(name,id,hours,rate);
    this.workArea = workArea;
  }

  public String getWorkArea()
  {
    return workArea;
  }

  public void setWorkArea(String workArea)
  {
    this.workArea = workArea;
  }
  //toString
  public String toString()
  {
    return super.toString() + "Workarea: " + workArea;
  }
  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof ITSupport))
    {
      return false;
    }
    ITSupport other = (ITSupport) obj;
    return super.equals(other) && workArea.equals(other.workArea);
  }
}
