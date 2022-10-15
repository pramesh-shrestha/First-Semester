package Workshop7;

public  class Education
{
  private String code;
  private String title;

  //constructor
  public Education(String code, String title)
  {
    this.code = code;
    this.title = title;
  }

  //get methods
  public String getCode()
  {
    return code;
  }

  public String getTitle()
  {
    return title;
  }

  //toString
  public String toString()
  {
    return "Code: " + code + "\nTitle: " + title;
  }

  //equals
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Education))
    {
      return false;
    }
    Education other = (Education) obj;
    return code.equals(other.code) &&
        title.equals(other.title);
  }
}
