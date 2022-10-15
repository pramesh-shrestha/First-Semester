package education;

public class Programme extends Education
{
  private String headOfProgramme;
  public Programme(String code,String title, String headOfProgramme)
  {
    super(code, title);
    this.headOfProgramme =headOfProgramme;
  }

  public String getHeadOfProgramme()
  {
    return headOfProgramme;
  }

  public String toString()
  {
    return super.toString() + headOfProgramme;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Programme))
    {
      return false;
    }
    Programme other = (Programme) obj;
    return super.equals(other) && headOfProgramme.equals(other.headOfProgramme);
  }
}
