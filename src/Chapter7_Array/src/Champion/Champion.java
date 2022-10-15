package Champion;

public class Champion
{
  private String championName;
  private boolean isAD;
  private boolean hasSkillShot;
  private String weakOrStrongAgainst;
  private ItemList itemList;

  //constructor
  public Champion(String championName, boolean isAD, boolean hasSkillShot, String weakOrStrongAgainst)
  {
    this.championName = championName;
    this.isAD = isAD;
    this.hasSkillShot = hasSkillShot;
    this.weakOrStrongAgainst = weakOrStrongAgainst;
  }
  //getChampionName
  public String getChampionName()
  {
    return championName;
  }

  //isAD
  public boolean isAD()
  {
    if(isAD)
    {
      return true;
    }
    return false;
  }

  //setIsAD
  public void setIsAD(boolean isAD)
  {
    this.isAD = isAD;
  }

  //isSkillShot
  public boolean isSkillShot()
  {
    return hasSkillShot;
  }

  //setSkillShot
  public void setSkillShot(boolean isSkillShot)
  {
    hasSkillShot = isSkillShot;
  }

  //getWeakOrStrongAgainst
  public String getWeakOrStrongAgainst()
  {
    return weakOrStrongAgainst;
  }

  //setWeakOrStrongAgainst
  public void setWeakOrStrongAgainst(String weakOrStrongAgainst)
  {
    this.weakOrStrongAgainst = weakOrStrongAgainst;
  }

  //buyItem
  public void buyItem(Item item)
  {
    itemList.addItem(item);
  }

  //getNumberOfItems
  public int getNumberOfItems()
  {
    return itemList.getSize();
  }

  //getItem
  public Item getItem(String itemName)
  {
    Item item = null;
    for(int i = 0; i < itemList.getSize(); i++)
    {
      if(itemList.getItem(i).equals(itemName))
      {
        item = itemList.getItem(i);
        break;
      }
    }
    return item;
  }

  //setItemName
  public void setItemName(String itemName)
  {
    for(int i = 0; i < itemList.getSize(); i++)
    {
      if (itemList.getItem(i).equals(itemName))
      {
        itemList.getItem(i).setItemName(itemName);
        break;
      }
    }
  }

  //toString
  public String toString()
  {
    return "Champion{" + "championName='" + championName + '\'' + ", isAD="
        + isAD + ", hasSkillShot=" + hasSkillShot + ", weakOrStrongAgainst='"
        + weakOrStrongAgainst + '\'' + ", itemList=" + itemList + '}';
  }

  //getChampionItems
  public ItemList getChampionItems()

  {
    return itemList;
  }
}
