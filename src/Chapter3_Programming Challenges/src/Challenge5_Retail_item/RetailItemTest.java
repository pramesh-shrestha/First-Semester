package Challenge5_Retail_item;

public class RetailItemTest
{
  public static void main(String[] args)
  {
    //creating three RetailItem objects
    RetailItem item1 = new RetailItem();
    RetailItem item2 = new RetailItem();
    RetailItem item3 = new RetailItem();

    //setting values to the fields for all three RetailItem objects - item1,item2,item3
    item1.setDescription("Item #1     Jacket");
    item1.setUnitsOnHand(12);
    item1.setPrice(59.95);

    item2.setDescription("Item #2     Designer Jeans");
    item2.setUnitsOnHand(40);
    item2.setPrice(34.95);

    item3.setDescription("Item #3     Shirt");
    item3.setUnitsOnHand(20);
    item3.setPrice(24.95);

    //assigning string values for the menu
    String des = "Description";
    String unit = "Units On Hand";
    String price = "Price";

    //Displaying the information
    System.out.printf("%-30s%-20s%-15s\n",des,unit,price);
    System.out.println("-------------------------------------------------------");
    System.out.printf("%-30s%-20d%-15.2f\n",item1.getDescription(),item1.getUnitsOnHand(),item1.getPrice()); //.2f sets to 2 decimal place
    System.out.printf("%-30s%-20d%-15.2f\n",item2.getDescription(),item2.getUnitsOnHand(),item2.getPrice());
    System.out.printf("%-30s%-20d%-15.2f\n",item3.getDescription(),item3.getUnitsOnHand(),item3.getPrice());
  }
}
