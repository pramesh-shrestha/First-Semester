package Challenge7_PersonAndCustomer;

public class Customer extends Person
{
  private int customerNum;
  private boolean mailingList;

  /**constructor*/
  public Customer(String name, String address, int telephone, int customerNum,
      boolean mailingList)
  {
    super(name, address, telephone);
    this.customerNum = customerNum;
    this.mailingList = mailingList;
  }

  /**get and set methods*/
  public int getCustomerNum()
  {
    return customerNum;
  }

  public void setCustomerNum(int customerNum)
  {
    this.customerNum = customerNum;
  }

  public boolean isMailingList()
  {
    return mailingList;
  }

  public void setMailingList(boolean mailingList)
  {
    this.mailingList = mailingList;
  }

  /**toString*/
  public String toString()
  {
    return super.toString() + "\nCustomer number: " + customerNum +
        "\nWish to be on a mailing list: " + mailingList;
  }
}
