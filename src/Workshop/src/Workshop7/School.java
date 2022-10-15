package Workshop7;

import java.io.Serializable;

public class School extends Education implements Serializable
{
  private String type;
  public static String INFANT_SCHOOL = "Infant school";
  public static String JUNIOR_SCHOOL = "Junior school";
  public static String SECONDARY_SCHOOL = "Secondary school";
  public static String HIGH_SCHOOL = "High school";

  //constructor
  public School(String code, String title, String type)
  {
    super(code, title);
    this.type = type;
  }

  public String getSchoolType()
  {
    if(type.equals(INFANT_SCHOOL))
    {
      return INFANT_SCHOOL;
    }
    else if(type.equals(JUNIOR_SCHOOL))
    {
      return JUNIOR_SCHOOL;
    }
    else if(type.equals(SECONDARY_SCHOOL))
    {
      return SECONDARY_SCHOOL;
    }
    else if(type.equals(HIGH_SCHOOL))
    {
      return HIGH_SCHOOL;
    }
    else
    {
      throw new IllegalSchoolException("No such type");
    }

  }

  public String toString()
  {
    return super.toString() + "\nType: " + type;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof School))
    {
      return false;
    }
    School other = (School) obj;
    return super.equals(other) && type.equals(other.type);
  }
}
