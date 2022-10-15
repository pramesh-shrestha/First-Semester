package Course;

public class Instructor
{
  private  String name;
  private int officeNumber;

  //constructor
  public Instructor(String name, int officeNumber)
  {
    this.name = name;
    this.officeNumber = officeNumber;
  }

  //getName
  public String getName()
  {
    return name;
  }

  //getOfficeNumber
  public int getOfficeNumber()
  {
    return officeNumber;
  }

  //equals method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Instructor))
    {
      return false;
    }
    Instructor other = (Instructor) obj;
    return name.equals(other.name) && officeNumber == other.officeNumber;
  }

  //toString method
  public String toString()
  {
    return "Name: " + name + " " + "Office Number: " + officeNumber;
  }
}
