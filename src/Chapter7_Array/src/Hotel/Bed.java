package Hotel;

public class Bed
{
  private String type;

  public Bed(String type)
  {
    this.type = type;
  }

  public boolean isSingle()
  {
    if(type.equalsIgnoreCase("single"))
    {
      return true;
    }
    return false;
  }
  public boolean isDouble()
  {
    if(type.equalsIgnoreCase("double"))
    {
      return true;
    }
    return false;
  }
  public boolean isKingSize()
  {
    if(type.equalsIgnoreCase("kingsize"))
    {
      return true;
    }
    return false;
  }


}

