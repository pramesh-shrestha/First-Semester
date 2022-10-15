package Workshop5_ArrayList.Champion;

public class Item
{
  private String itemName;
  private int itemPrice;
  private String itemDescription;

  //constructor
  public Item(String itemName, int itemPrice, String itemDescription)
  {
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemDescription = itemDescription;
  }

  public Item(String itemName, int itemPrice)
  {
    this.itemName = itemName;
    this.itemPrice = itemPrice;
  }

  //get methods
  public String getItemName()
  {
    return itemName;
  }

  public int getItemPrice()
  {
    return itemPrice;
  }

  public String getItemDescription()
  {
    return itemDescription;
  }

  //set methods
  public void setItemName(String itemName)
  {
    this.itemName = itemName;
  }

  public void setItemPrice(int itemPrice)
  {
    this.itemPrice = itemPrice;
  }

  public void setItemDescription(String itemDescription)
  {
    this.itemDescription = itemDescription;
  }

  //set
  public void set(String itemName, int itemPrice, String itemDescription)
  {
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemDescription = itemDescription;
  }
  //getItemFullDescription
  public String getItemFullDescription()
  {
    return itemDescription + " " + itemName + " " + itemPrice;
  }
  //toString

  public String toString()
  {
    return "Item{" + "itemName='" + itemName + '\'' + ", itemPrice=" + itemPrice
        + ", itemDescription='" + itemDescription + '\'' + '}';
  }

  //equals method
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Item))
    {
      return false;
    }
    Item other = (Item) obj;
    return itemPrice == other.itemPrice &&
        itemName.equals(other.itemName) &&
        itemDescription.equals(other.itemDescription);
  }
}
