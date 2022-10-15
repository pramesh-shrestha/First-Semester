package Pizza;

import java.util.ArrayList;

public class Pizza
{
  private String name;
  private double initialPrice;
  private int numberOfToppings;
  private static int MAX_NUMBER_OF_TOPPINGS = 5;
  private ArrayList<Topping> toppings;

  public Pizza(String name, double initialPrice)
  {
    this.name = name;
    this.initialPrice = initialPrice;
    numberOfToppings = 0;
    toppings = new ArrayList<>();
  }

  public int getNumberOfToppings()
  {
    return toppings.size();
  }
  public void addTopping(Topping topping)
  {
    if(toppings.size() < MAX_NUMBER_OF_TOPPINGS)
    {
      toppings.add(topping);
    }
  }

  public void removeTopping(String toppingName)
  {
    for (int i = 0; i < toppings.size(); i++)
    {
      if(toppings.get(i).getName().equals(toppingName))
      {
        toppings.remove(i);
      }
    }
  }

  public double getTotalPrice()
  {
    double price = initialPrice;
    for (int i = 0; i < toppings.size(); i++)
    {
      price += toppings.get(i).getPrice();
    }
    return price;
  }

  public String getName()
  {
    return name;
  }
}
