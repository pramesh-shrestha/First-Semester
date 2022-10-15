package Order;

import java.util.ArrayList;

public class Order
{
  private int numberOfOrderLines;
  private ArrayList<OrderLine> orderLines;

  public Order(int maxNumberOfOrderLines)
  {
    numberOfOrderLines = maxNumberOfOrderLines;
    orderLines = new ArrayList<>();
  }

  public void addOrderLine(Item item, int amount)
  {
    if(orderLines.size() < numberOfOrderLines)
    {
      orderLines.add(new OrderLine(item, amount));
    }
  }
  public int getNumberOfOrderLines()
  {
    return orderLines.size();
  }
  public double getTotalPrice()
  {
    double price = 0;
    for(int i = 0; i < orderLines.size(); i++)
    {
      price += orderLines.get(i).getItem().getPrice() * orderLines.get(i).getAmount();
    }
    return price;
  }

  public Item getOrderItem(int orderLineIndex)
  {
    return orderLines.get(orderLineIndex).getItem();
  }

  public int getAmountOfOrderItem(int orderLineIndex)
  {
    return orderLines.get(orderLineIndex).getAmount();
  }

  public double getTotalWeightForWeightedItems()
  {
    double weight = 0;
    for (int i = 0; i < orderLines.size(); i++)
    {
      if(orderLines.get(i).getItem() instanceof WeighedItem)
      {
        weight += ((WeighedItem) orderLines.get(i).getItem()).getWeight();
      }
    }
    return weight;
  }

  @Override public String toString()
  {
    return "Order{" + "numberOfOrderLines=" + numberOfOrderLines
        + ", orderLines=" + orderLines + '}';
  }
}
