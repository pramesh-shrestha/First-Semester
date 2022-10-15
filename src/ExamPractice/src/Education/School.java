package Education;

import ApartmentComplex.IllegalTypeException;

public class School extends Education
{
  private String type;
  public static String INFANT_SCHOOL = "Infant school";
  public static String JUNIOR_SCHOOL = "Junior school";
  public static String SECONDARY_SCHOOL = "Secondary school";
  public static String HIGH_SCHOOL = "High school";

  public School(String code, String title, String type)
  {
    super(code, title);

    if(!(type.equals(INFANT_SCHOOL) || type.equals(JUNIOR_SCHOOL) || type.equals(SECONDARY_SCHOOL) || type.equals(HIGH_SCHOOL)))
    {
      throw new IllegalTypeException("Invalid type");
    }
    else
    {
      this.type = type;
    }
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
      throw new IllegalTypeException("No such type");
    }
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

  public String toString()
  {
    return super.toString() + "Type: " + type;
  }
}
