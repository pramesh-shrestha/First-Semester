package Challenge7_PersonAndCustomer;

public class CustomerTest
{
  public static void main(String[] args)
  {
    /**creating Customer object*/
    Customer customer = new Customer("Sony Shrestha", "Kolding",
        12346456,777,false);

    /**displaying customer's information*/
    System.out.println(customer);

    /**accessing superclass method using subclass reference object*/
    System.out.println(); /**new line*/
    System.out.println("<--After change-->");
    customer.setName("Pramesh Shrestha");
    customer.setTelephone(78945612);
//    customer.setCustomerNum(123);
    customer.setMailingList(true);
    /**displaying customer information after change using setMethods of superclass*/
    System.out.println(customer);

  }
}
