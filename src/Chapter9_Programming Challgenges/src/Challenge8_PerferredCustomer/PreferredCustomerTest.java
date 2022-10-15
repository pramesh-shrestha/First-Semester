package Challenge8_PerferredCustomer;

public class PreferredCustomerTest
{
  public static void main(String[] args)
  {
    /**creating PreferredCustomer object*/
    PreferredCustomer preferredCustomer = new PreferredCustomer("Pramesh Shrestha",
        "Kolding",12345678,605,false,1900);

    /**Displaying customer info with discount level*/
    System.out.println(preferredCustomer);

    /**accessing superclass methods and changing some info*/
    /**setting customer purchase to 300*/
    preferredCustomer.setCustomerPurchases(300);
    /**setting discountLevel*/
    preferredCustomer.setDiscountLevel(preferredCustomer.getCustomerPurchases());
    /**setting name*/
    preferredCustomer.setName("Sony Shrestha");
    System.out.println(preferredCustomer);
  }
}
