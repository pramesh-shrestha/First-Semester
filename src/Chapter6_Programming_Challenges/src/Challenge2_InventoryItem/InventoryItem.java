/*2. InventoryItem Class Copy Constructor
Add a copy constructor to the InventoryItem class. This constructor should accept an
InventoryItem object as an argument. The constructor should assign to the description
field the value in the argument’s description field and assign to the units field the value
in the argument's units field. As a result, the new object will be a copy of the argument object*/
package Challenge2_InventoryItem;

public class InventoryItem
{
  private String description;
  private int units;

  //creating two args constructor
  public InventoryItem(String description, int units)
  {
    this.description = description;
    this.units = units;
  }

  //creating a constructor that accepts InventoryItem
  public InventoryItem(InventoryItem inventoryItem)
  {
    description = inventoryItem.description;
    units = inventoryItem.units;
  }

  //creating toString method
  public String toString()
  {
    return "Description: " + description + "," + " Units: " + units;
  }
}
