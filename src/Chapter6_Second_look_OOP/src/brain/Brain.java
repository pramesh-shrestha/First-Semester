package brain;

public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItemOne;
  private String passiveMemoryItemTwo;

  //empty construtor
  public Brain()
  {
    activeMemoryItem = "";
    passiveMemoryItemOne = "";
    passiveMemoryItemTwo = "";
  }

  //getIQ() method
  public int getIQ()
  {
    int a1 = activeMemoryItem.length();
    int p1 = passiveMemoryItemOne.length();
    int p2 = passiveMemoryItemTwo.length();
    if((a1 > 20 || p1 > 20 || p2 > 20) && (a1 > 10 && p1 > 10 && p2 > 10))
    {
      return 130;
    }

    else if((a1 >= 10 && a1 < 20) &&
        (p1 >= 10 && p1 < 20) && (p2 >= 10 && p2 < 20))
    {
      return 100;
    }
    else
    {
      return 70;
    }
  }

  //isBrainDamaged() method
  public boolean isBrainDamaged()
  {
    if(activeMemoryItem.equals("null") || passiveMemoryItemOne.equals("null") || passiveMemoryItemTwo.equals("null"))
    {
      return true;
    }
    else {
      return false;
    }
  }

  //remember() method
  public void remember(String info)
  {
    passiveMemoryItemTwo = passiveMemoryItemOne;
    passiveMemoryItemOne = activeMemoryItem;
    activeMemoryItem = info;
  }

  //refreshMemory() method
  public void refreshMemory(String info)
  {
    if(passiveMemoryItemOne.equals(info))
    {
      passiveMemoryItemOne = activeMemoryItem;
      activeMemoryItem = info;
    }
    else if(passiveMemoryItemTwo.equals(info))
    {
      passiveMemoryItemTwo = activeMemoryItem;
      activeMemoryItem = info;
    }

  }

  //recall() boolean method
  public boolean recall(String info)
  {
    if(activeMemoryItem.equals(info) || passiveMemoryItemOne.equals(info) || passiveMemoryItemTwo.equals(info))
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  //recall() method
  public String recall()
  {
    return activeMemoryItem;
  }

  //toString() method
  public String toString()
  {
    return "Active memory: " + activeMemoryItem + " Passive memory one " + passiveMemoryItemOne +
        " Passive memory two: " + passiveMemoryItemTwo;
  }

  //equals() method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Brain))
    {
      return false;
    }
    Brain other = (Brain)obj;
    return activeMemoryItem.equals(other.activeMemoryItem) &&
        passiveMemoryItemOne.equals(other.passiveMemoryItemOne) &&
        passiveMemoryItemTwo.equals(other.passiveMemoryItemTwo);
  }

}
