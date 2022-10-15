package Order;

public class OrderLine
{
  private int amount;
  private Item item;

  public OrderLine(Item item, int amount)
  {
    this.item = item;
    this.amount = amount;
  }

  public Item getItem()
  {
    return item;
  }

  public int getAmount()
  {
    return amount;
  }

  public void setAmount(int amount)
  {
    this.amount = amount;
  }


  public  boolean equals(Object obj)
  {
    if(!(obj instanceof OrderLine))
    {
      return false;
    }
    OrderLine other = (OrderLine) obj;
    return amount == other.amount && item.equals(other.item);
  }

  @Override public String toString()
  {
    return "OrderLine{" + "amount=" + amount + ", item=" + item + '}';
  }
}
