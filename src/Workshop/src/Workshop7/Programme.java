package Workshop7;

import java.io.Serializable;

public class Programme extends Education implements Serializable
{
  private String headOfProgramme;

  //constructor
  public Programme(String code, String title, String headOfProgramme)
  {
    super(code, title);
    if (super.getCode().equals("ICT") || super.getCode().equals("GBE") ||
    super.getCode().equals("CA"))
    {
      if (super.getTitle().equals("ICT Engineering") || super.getTitle()
        .equals("Global Business Engineering") || super.getTitle()
        .equals("Construction Architect"))
      {
        if (headOfProgramme.equals("Jens") || headOfProgramme.equals("Anders") ||
        headOfProgramme.equals("Gunnar"))
        {
          this.headOfProgramme = headOfProgramme;
        }
      }
    }
    else
    {
      throw new IllegalArgumentException("Error File");
    }
  }

  //getHeadOfProgramme
  public String getHeadOfProgramme()
  {
    return headOfProgramme;
  }

  //toString
  public String toString()
  {
    return super.toString() + "\nHead of Programme: " + headOfProgramme;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Programme))
    {
      return false;
    }
    Programme other = (Programme) obj;
    return super.equals(other) &&
        headOfProgramme.equals(other.headOfProgramme);
  }
}
