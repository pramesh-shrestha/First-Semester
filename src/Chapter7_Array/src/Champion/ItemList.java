package Champion;

import java.util.ArrayList;

public class ItemList
{
  private int size;
  private ArrayList<Item> items;

  //constructor
  public ItemList(int initialCapacity)
  {
    size = initialCapacity;
    items = new ArrayList<>(initialCapacity);
  }

  //getSize
  public int getSize()
  {
    return size;
  }
  //addItem
  public void addItem(Item item)
  {
    if(items.size() < size)
    {
      items.add(item);
    }
  }

  //getItem
  public Item getItem(int index)
  {
    return items.get(index);
  }

  //getItem
  public Item getItem(String itemName)
  {
    Item tempName = null;
    for(int i = 0; i < items.size(); i++)
    {
      if(items.get(i).getItemName().equals(itemName))
      {
        tempName = items.get(i);
        break;
      }
    }return tempName;
  }

  //getItem
  public Item getItemPrice(int itemPrice)
  {
    Item tempPrice = null;
    for(int i = 0; i < items.size(); i++)
    {
      if(items.get(i).getItemPrice()==itemPrice)
      {
        tempPrice = items.get(i);
        break;
      }
    }return tempPrice;
  }

  //itemCounter
  public int itemCounter(String itemName)
  {
    int count = 0;
    for(int i = 0; i < items.size(); i++)
    {
      if(items.get(i).getItemName().equals(itemName))
      {
        count++;
      }
    }return count;
  }

  //toString
  public String toString()
  {
    String str = "";
    for(int i = 0; i < items.size(); i++)
    {
      str += items.get(i) + " ";
    }
    return str + size;
  }
}
