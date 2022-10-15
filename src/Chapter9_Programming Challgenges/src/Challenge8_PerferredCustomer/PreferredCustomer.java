/*8. PreferredCustomer Class
A retail store has a preferred customer plan where customers can earn discounts on all
their purchases. The amount of a customer’s discount is determined by the amount of the
customer’s cumulative purchases in the store, as follows:
● When a preferred customer spends $500, he or she gets a 5% discount on all future
purchases.
● When a preferred customer spends $1,000, he or she gets a 6% discount on all future
purchases.
● When a preferred customer spends $1,500, he or she gets a 7% discount on all future
purchases.
● When a preferred customer spends $2,000 or more, he or she gets a 10% discount on
all future purchases.
Design a class named PreferredCustomer, which inherits from the Customer class you created in Programming Challenge 7.
The PreferredCustomer class should have fields for
the amount of the customer’s purchases and the customer’s discount level. Write one or
more constructors and the appropriate mutator and accessor methods for the class’s fields.
Demonstrate the class in a simple program.*/
package Challenge8_PerferredCustomer;

public class PreferredCustomer extends Customer
{
  private int customerPurchases;
  private double discount;

  /**constructor*/
  public PreferredCustomer(String name, String address, int telephone,
      int customerNum, boolean mailingList, int customerPurchases)
  {
    super(name, address, telephone, customerNum, mailingList);
    this.customerPurchases = customerPurchases;
    /**calling the setDiscountLevel method and setting the discount level*/
    setDiscountLevel(customerPurchases);
  }

  /**set and get methods*/
  public int getCustomerPurchases()
  {
    return customerPurchases;
  }

  public void setCustomerPurchases(int customerPurchases)
  {
    this.customerPurchases = customerPurchases;
  }

  public double getDiscount()
  {
    return discount;
  }

  /**discountLevel*/
  public void setDiscountLevel(int customerPurchases)
  {
    discount = 0;
    if (customerPurchases >= 500 && customerPurchases < 1000)
    {
      discount = 0.05;
    }
    else if (customerPurchases >= 1000 && customerPurchases < 1500)
    {
      discount = 0.06;
    }
    else if (customerPurchases >= 1500 && customerPurchases < 2000)
    {
      discount = 0.07;
    }
    else if (customerPurchases >= 2000)
    {
      discount = 0.10;
    }
  }

  /**toString*/
  public String toString()
  {
    return super.toString() + "\nCustomer Purchases: " + customerPurchases +
        "\nDiscount level: " + discount;
  }
}
