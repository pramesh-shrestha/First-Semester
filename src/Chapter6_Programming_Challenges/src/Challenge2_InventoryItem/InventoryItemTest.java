package Challenge2_InventoryItem;

public class InventoryItemTest
{
  public static void main(String[] args)
  {
    //creating InventoryItem object
    InventoryItem item1 = new InventoryItem("Monitor", 50);

    //creating one more InventoryItem object that will store the memory address of values of item1
    InventoryItem item2 = new InventoryItem(item1);

    //printing out the values of item2
    System.out.println(item2);
  }
}
