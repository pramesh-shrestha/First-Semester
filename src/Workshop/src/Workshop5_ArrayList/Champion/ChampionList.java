package Workshop5_ArrayList.Champion;

import java.util.ArrayList;

public class ChampionList
{
  private int size;
  private ArrayList<Champion> champions;

  //constructor
  public ChampionList(int size)
  {
    this.size = size;
    champions = new ArrayList<>();
  }

  //addChampion
  public void addChampion(Champion champion)
  {
    champions.add(champion);
  }

  //removeChampion
  public void removeChampion(Champion championName)
  {
    champions.remove(championName);
  }

  //getChampionItems
  public ItemList getChampionItems(String championName)
  {
    ItemList temp = null;
    for(int i = 0; i < champions.size(); i++)
    {
      if(champions.get(i).getChampionName().equals(championName))
      {
        temp = champions.get(i).getChampionItems();
      }
    }return temp;
  }

  //toString
  public String toString()
  {
    String str = "";
    for(int i = 0; i < champions.size(); i++)
    {
      str += champions + " ";
    }
    return str + size;
  }

}
